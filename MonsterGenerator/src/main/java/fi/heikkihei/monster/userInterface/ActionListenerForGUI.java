package fi.heikkihei.monster.userInterface;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HeikkiHei
 */
public class ActionListenerForGUI implements ActionListener {

    private JButton generate;
    private JTextArea output;
    private JSlider setLevel;
    private JRadioButton npcButton;
    private JRadioButton monsterButton;

    /**
     *
     * @param generate nappi, jolla hahmo luodaan.
     * @param output alue, johon tiedot tulostuvat.
     * @param setLevel liuku, jolla määritetään hahmon taso.
     * @param npcButton radionappi, jos halutaan npc.
     * @param monsterButton radionappi, jos halutaan monster.
     */
    public ActionListenerForGUI(JButton generate, JTextArea output, JSlider setLevel, JRadioButton npcButton, JRadioButton monsterButton) {
        this.generate = generate;
        this.output = output;
        this.setLevel = setLevel;
        this.npcButton = npcButton;
        this.monsterButton = monsterButton;
    }

    /**
     * Kuunnellaan nappia Generate, lisätietoja radionapeista ja liuku'usta.
     * @param ae kuunneltava event.
     *
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        int level = this.setLevel.getValue();
        if (ae.getSource() == this.generate) {
            if (this.npcButton.isSelected()) {
                this.output.setText("NPC " + level + " ");
            }
            if (this.monsterButton.isSelected()) {
                this.output.setText("Monster " + level + " ");
            }
        }
    }

}
