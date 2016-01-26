package monster.userInterface;

import java.util.*;

public class NonGraphicInterface {

    private Scanner reader = new Scanner(System.in);
    private String inputType = "";
    private int inputInteger = 0;

    public void run() {

        inputType = chooseType(inputType, reader);
        inputInteger = chooseLevel(inputInteger, reader);
        String monsterType = inputTypeToMonsterType(inputType);

        System.out.println("Päädyit hahmoon, jonka luokka on " + monsterType + " ja taso on " + inputInteger);
    }

    private static String inputTypeToMonsterType(String inputType) {
        String monsterType;
        if (inputType.equalsIgnoreCase("h")) {
            return monsterType = "hirviö";
        }
        if (inputType.equalsIgnoreCase("n")) {
            return monsterType = "NPC";
        } else {
            return monsterType = "tuntematon";
        }
    }

    private static int chooseLevel(int inputInteger, Scanner reader) {
        while (true) {
            System.out.println("Valitse taso: 1-10");
            try {
                inputInteger = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
                System.out.println("Et antanut oikeaa syötettä. Anna kokonaisluku väliltä 1-10");
            }
            if (inputInteger <= 10 && inputInteger >= 1) {
                System.out.println("Valitsit tason " + inputInteger);
                break;
            }
        }
        return inputInteger;
    }

    private static String chooseType(String inputType, Scanner reader) {
        while (true) {
            System.out.println("Valitse tyyppi: Hirviö (H) tai NPC (N)");
            try {
                inputType = reader.nextLine();
            } catch (Exception e) {
                System.out.println("Et antanut oikeaa syötettä. Kirjoita H tai N");
            }
            if (inputType.equalsIgnoreCase("H")) {
                System.out.println("Valitsit hirviön");
                break;
            } else if (inputType.equalsIgnoreCase("N")) {
                System.out.println("Valitsit NPC:n");
                break;
            }

        }
        return inputType;
    }
}
