//MAIN -Heikki Hei
package monster.monstergenerator;

import java.util.Scanner;
import monster.userInterface.*;

public class Generate {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        TextInterface monster = new TextInterface(reader);
        monster.run();

    }
}
