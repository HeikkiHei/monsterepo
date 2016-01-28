//MAIN -Heikki Hei
package monster.monstergenerator;

import java.util.Scanner;
import monster.userInterface.*;

public class Generate {

    public void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            TextInterface monster = new TextInterface(reader);
            monster.run();
        } catch (Exception e) {
            System.out.println("Ohjelma kaatui, voi voi.");
        }

    }
}
