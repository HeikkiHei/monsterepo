package fi.heikkihei.monster.levelpack;

import java.util.*;

/**
 * Luokka, joka tulee vielä täysin muuttumaan, kunhan saan GUIn rakennettua loppuun.
 * Sisältää vielä liikaa tekstikäyttöliittymän osia.
 * 
 * @author HeikkiHei
 */
public class DetermineType {

    /**
     * Parametritön konstruktori
     */
    public DetermineType() {
    }

    /**
     *
     * @param reader lukija, jolla tulkitaan haluttu tyyppi.
     * @return palautetaan haluttu tyyppi apumetodin tekstiksi muuttamana.
     */
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

    /**
     *
     * @param inputType päämetodin antama syöte.
     * @return syöte muutettu kirjaimesta tekstiksi.
     */
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
