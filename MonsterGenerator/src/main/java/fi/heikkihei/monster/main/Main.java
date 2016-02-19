
package fi.heikkihei.monster.main;

import javax.swing.SwingUtilities;
import fi.heikkihei.monster.userinterface.GraphicUserInterface;

/**
 * @author HeikkiHei
 * @version 0.9
 * @since 2016-02-10
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
