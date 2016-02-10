
package fi.heikkihei.monster.main;

import javax.swing.SwingUtilities;
import fi.heikkihei.monster.userInterface.GraphicUserInterface;
public class Main {

    public static void main(String[] args) {
        GraphicUserInterface gui = new GraphicUserInterface();
        SwingUtilities.invokeLater(gui);
    }
}
