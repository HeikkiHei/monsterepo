package fi.heikkihei.monster.levelpack;

import java.util.*;

public class DetermineType {

    public DetermineType() {
    }

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
        return changeInputLetterForToString(inputType);
    }

    public static String changeInputLetterForToString(String inputType) {
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
    
    
}
