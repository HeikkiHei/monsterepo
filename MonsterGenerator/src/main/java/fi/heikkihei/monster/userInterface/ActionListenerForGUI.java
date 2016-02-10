package fi.heikkihei.monster.userInterface;

import java.awt.event.*;
import javax.swing.*;

public class ActionListenerForGUI implements ActionListener {

    private JButton generate;
    private JTextArea output;
    private JSlider setLevel;
    private JRadioButton npc;
    private JRadioButton monster;

    public ActionListenerForGUI(JButton generate, JTextArea output, JSlider setLevel, JRadioButton npc, JRadioButton monster) {
        this.generate = generate;
        this.output = output;
        this.setLevel = setLevel;
        this.npc = npc;
        this.monster = monster;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int level = this.setLevel.getValue();
        if (ae.getSource() == this.generate) {
            if (this.npc.isSelected()) {
                this.output.setText("NPC " + level + " ");
            }
            if (this.monster.isSelected()) {
                this.output.setText("Monster " + level + " ");
            }
        }
    }

}
