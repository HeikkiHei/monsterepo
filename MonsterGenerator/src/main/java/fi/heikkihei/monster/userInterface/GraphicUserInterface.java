package fi.heikkihei.monster.userInterface;

import java.awt.*;
import javax.swing.*;

public class GraphicUserInterface implements Runnable {

    private JFrame frame;

    public GraphicUserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("MonsterGenerator");
        frame.setPreferredSize(new Dimension(600, 600));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        ButtonGroup askType = new ButtonGroup();
        JRadioButton npc = new JRadioButton("NPC");
        JRadioButton monster = new JRadioButton("Monster");
        monster.setSelected(true);

        askType.add(npc);
        askType.add(monster);

        container.add(npc);
        container.add(monster);

        JSlider setLevel = createSlider(container);

        JButton generate = createGenerateButton(container);

        JTextArea printOut = createPrintOutArea(container);

        ActionListenerForGUI algui = new ActionListenerForGUI(generate, printOut, setLevel, npc, monster);
        generate.addActionListener(algui);

    }

    private JTextArea createPrintOutArea(Container container) {
        JTextArea printOut = new JTextArea();
        printOut.setEnabled(false);
        container.add(printOut);
        return printOut;
    }

    private JButton createGenerateButton(Container container) {
        JButton generate = new JButton("GENERATE");
        container.add(generate);
        return generate;
    }

    private JSlider createSlider(Container container) {
        JSlider setLevel = new JSlider(1, 10);
        setLevel.setMajorTickSpacing(1);
        setLevel.setPaintLabels(true);
        setLevel.setPaintTicks(true);
        container.add(setLevel);
        return setLevel;
    }

}
