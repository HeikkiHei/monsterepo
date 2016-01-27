package monster.logic;

import java.util.*;

public class SystemLogic {

    private Scanner reader;

    public SystemLogic(Scanner reader) {
        this.reader = reader;
    }

    public static int chooseLevel(int inputInteger, Scanner reader) {
        while (true) {
            try {
                System.out.println("Valitse taso: 1-10");
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

    public static String chooseType(String inputType, Scanner reader) {
        while (true) {
            try {
                System.out.println("Valitse tyyppi: Hirviö (H) tai NPC (N)");
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

    public static String inputTypeToMonsterType(String inputType) {
        try {
            String monsterType;
            if (inputType.equalsIgnoreCase("h")) {
                return monsterType = "hirviö";
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
