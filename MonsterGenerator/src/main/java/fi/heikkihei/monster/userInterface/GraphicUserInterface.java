package fi.heikkihei.monster.userinterface;

import java.awt.*;
import javax.swing.*;

/**
 * Graafinen käyttöliittymä.
 *
 * @author HeikkiHei
 */
public class GraphicUserInterface implements Runnable {

    private JFrame frame;

    /**
     * Parametritön konstruktori.
     */
    public GraphicUserInterface() {
    }

    /**
     * Override run, luodaan suoritusikkuna.
     */
    @Override
    public void run() {
        frame = new JFrame("MonsterGenerator");
        frame.setPreferredSize(new Dimension(600, 700));

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     *
     * @param container luodaan suoritusikkunaan komponentit. Radionapit
     * npcButton ja monsterButton valitsevat luotavan tyypin, Liuku setLevel
     * määrittää hahmon tason, Nappi Generate luo hahmon.
     */
    private void createComponents(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        ButtonGroup askType = new ButtonGroup();
        JRadioButton npcButton = new JRadioButton("NPC");
        JRadioButton monsterButton = new JRadioButton("Monster");
        npcButton.setBackground(Color.LIGHT_GRAY);
        monsterButton.setBackground(Color.LIGHT_GRAY);
        monsterButton.setSelected(true);

        askType.add(npcButton);
        askType.add(monsterButton);

        container.add(npcButton);
        container.add(monsterButton);

        JSlider setLevel = createSlider(container);

        JButton generate = createGenerateButton(container);

        JTextArea printOut = createPrintOutArea(container);

        ActionListenerForGUI listener = new ActionListenerForGUI(generate, printOut, setLevel, npcButton, monsterButton);
        generate.addActionListener(listener);

    }

    /**
     * Suoritusikkunan komponentin alimetodi.
     *
     * @param container mihin lisätään TextArea
     * @return alue, johon tulostuu hahmon tiedot.
     */
    private JTextArea createPrintOutArea(Container container) {
        JTextArea printOut = new JTextArea();
        Font font = new Font("Verdana", Font.BOLD, 10);
        printOut.setFont(font);
        printOut.setBackground(Color.LIGHT_GRAY);
        printOut.setLineWrap(true);
        printOut.setEditable(false);
        container.add(printOut);
        return printOut;
    }

    /**
     *
     * @param container mihin lisätään nappi.
     * @return nappi, jolla luodaan hahmo.
     */
    private JButton createGenerateButton(Container container) {
        JButton generate = new JButton("GENERATE");
        container.add(generate);
        return generate;
    }

    /**
     *
     * @param container tähän lisätään liuku
     * @return liuku, jolla määritetään hahmon taso.
     */
    private JSlider createSlider(Container container) {
        JSlider setLevel = new JSlider(1, 10);
        setLevel.setMajorTickSpacing(1);
        setLevel.setPaintLabels(true);
        setLevel.setPaintTicks(true);
        setLevel.setBackground(Color.LIGHT_GRAY);
        container.add(setLevel);
        return setLevel;
    }

}
