package monster.logic;

import java.util.*;

public class SystemLogic {

    public SystemLogic() {
    }

    public static int chooseLevel(Scanner reader) {

        int inputInteger = 0;

        while (true) {
            System.out.println("Valitse taso: 1-10");
            try {
                inputInteger = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
            }
            if (inputInteger <= 10 && inputInteger >= 1) {
                System.out.println("Valitsit tason " + inputInteger);
                break;
            }
        }
        return inputInteger;
    }

    public static String chooseType(Scanner reader) {
        String inputType = "";
        while (true) {
            System.out.println("Valitse tyyppi: Hirviö (H) tai NPC (N)");
            try {
                inputType = reader.nextLine();
            } catch (Exception e) {
            }
            if (inputType.equalsIgnoreCase("H")) {
                System.out.println("Valitsit hirviön");
                break;
            }
            if (inputType.equalsIgnoreCase("N")) {
                System.out.println("Valitsit NPC:n");
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
