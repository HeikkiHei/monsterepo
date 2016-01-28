package monster.logic;

import java.util.*;

public class SystemLogic {

    private Scanner reader;

    public SystemLogic(Scanner reader) {
        this.reader = reader;
    }

    public static int chooseLevel(Scanner reader) {
        System.out.println("Valitse taso: 1-10");
        int inputInteger = 0;
        while (true) {
            try {
                inputInteger = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
                System.out.println("Et antanut oikeaa syÃ¶tettÃ¤. Anna kokonaisluku vÃ¤liltÃ¤ 1-10");
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
        System.out.println("Valitse tyyppi: HirviÃ¶ (H) tai NPC (N)");
        while (true) {
            try {
                System.out.println("Valitse tyyppi: HirviÃ¶ (H) tai NPC (N)");
                inputType = reader.nextLine();
            } catch (Exception e) {
                System.out.println("Et antanut oikeaa syÃ¶tettÃ¤. Kirjoita H tai N");
            }
            if (inputType.equalsIgnoreCase("H")) {
                System.out.println("Valitsit hirviÃ¶n");
                break;
            } else if (inputType.equalsIgnoreCase("N")) {
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
                return monsterType = "hirviÃ¶";
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
