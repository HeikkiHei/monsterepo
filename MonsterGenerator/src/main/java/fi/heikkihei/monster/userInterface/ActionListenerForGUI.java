package fi.heikkihei.monster.userinterface;

import fi.heikkihei.monster.creature.Creature;
import fi.heikkihei.monster.generatestats.GenerateCreature;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private GenerateCreature generateStats;

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
     *
     * @param ae kuunneltava event.
     *
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.generateStats = new GenerateCreature(this.setLevel.getValue());
        if (ae.getSource() == this.generate) {
            if (this.npcButton.isSelected()) {              
                try {
                    this.output.setText(this.generateStats.create());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ActionListenerForGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.monsterButton.isSelected()) {
                try {
                    this.output.setText(this.generateStats.create());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ActionListenerForGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
