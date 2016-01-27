//MAIN -Heikki Hei

package monster.monstergenerator;

import java.util.Scanner;
import monster.userInterface.*;

public class Generate {

    Scanner reader;

    public static void main(String[] args) {
        Interface monster = new Interface(new Scanner(System.in));
        monster.run();
    }
}
