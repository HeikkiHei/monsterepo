package monster.logic;

import java.util.*;
import monster.levelpack.*;

public class SystemLogic {

    public monster.levelpack.DetermineLevel determineLevel;
    private int testi = 0;
    private Scanner reader;

    public SystemLogic() {
        this.determineLevel = new DetermineLevel();

    }

    public int chooseLevel(Scanner reader) {
        return this.testi = determineLevel.chooseLevel(reader);
    }

//    public static int chooseLevel(Scanner reader) {
//        int inputInteger = 0;
//
//        while (true) {
//            System.out.println("Valitse taso: 1-10");
//            try {
//                inputInteger = Integer.parseInt(reader.nextLine());
//            } catch (Exception e) {
//            }
//            if (inputInteger < 11) {
//                if (inputInteger > 0) { // Jaettu kahtia saadakseni selvyyttä PITiin - Heikki Hei
//                    break;
//                }
//            }
//        }
//        return inputInteger;
//    }

    public static String chooseType(Scanner reader) {
        String inputType = "";
        while (true) {
            System.out.println("Valitse tyyppi: Hirviö (H) tai NPC (N)");
            inputType = reader.nextLine();
            if (inputType.equalsIgnoreCase("H")) {
                break;
            }
            if (inputType.equalsIgnoreCase("N")) {
                break;
            }
        }
        return inputType;
    }

    public static String inputTypeToMonsterType(String inputType) {
        try {
            String monsterType;
            if (inputType.equalsIgnoreCase("h")) {
                return monsterType = "Monsu";
            }
            if (inputType.equalsIgnoreCase("n")) {
                return monsterType = "NPC";
            } else {
                return monsterType = "tuntematon";
            }
        } catch (Exception e) {
        }
        return "tuntematon";
    }

    // En ehtinyt opetella ja tehdä try-catch -testereitä, jää ensi viikkoon. -Heikki Hei
}
