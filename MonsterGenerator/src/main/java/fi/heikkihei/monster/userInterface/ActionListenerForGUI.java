package fi.heikkihei.monster.userinterface;

import fi.heikkihei.monster.creature.Creature;
import fi.heikkihei.monster.generatestats.GenerateCreature;
import fi.heikkihei.monster.userInterface.PrinterForGUI;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Tapahtumakuuntelija GraphicUserInterfacelle.
 *
 * @author HeikkiHei
 */
public class ActionListenerForGUI implements ActionListener {

    private JButton generate;
    private JTextArea output;
    private JSlider setLevel;
    private JRadioButton npcButton;
    private JRadioButton monsterButton;
    private GenerateCreature generateCreature;
    private PrinterForGUI printer;

    /**
     * Konstruktori, jolla parametrina alla olevat.
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
     * Luodaan uusi GenerateCreature, joka luo hahmon kuunneltujen nappien
     * perusteella. Luotu hahmo palautetaan GUIn output-ikkunaan.
     *
     * @param ae kuunneltava event.
     *
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.generateCreature = new GenerateCreature(this.setLevel.getValue());
        if (ae.getSource() == this.generate) {
            if (this.npcButton.isSelected()) {
                try {
                    this.generateCreature.create();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ActionListenerForGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.printer = new PrinterForGUI(this.generateCreature.getCreature());
                this.output.setText(this.printer.printCreature());

            }
            if (this.monsterButton.isSelected()) {
                try {
                    this.generateCreature.create();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ActionListenerForGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.printer = new PrinterForGUI(this.generateCreature.getCreature());
                this.output.setText(this.printer.printCreature());
            }
        }
    }

}
