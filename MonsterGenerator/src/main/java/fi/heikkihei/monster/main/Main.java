package fi.heikkihei.monster.main;

import javax.swing.SwingUtilities;
import fi.heikkihei.monster.userinterface.GraphicUserInterface;

/**
 * Main. Tarvitaan ohjelman avaamiseen.
 *
 * @author HeikkiHei
 * @version 0.9
 * @since 2016-02-29
 */
public class Main {

    /**
     * Ajaa graafisen käyttöliittymän.
     *
     * @param args no se.
     */
    public static void main(String[] args) {
        GraphicUserInterface gui = new GraphicUserInterface();
        SwingUtilities.invokeLater(gui);
    }
}
