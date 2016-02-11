package fi.heikkihei.monster.levelpack;

import java.util.*;

/**
 * Luokka, joka tulee vielä täysin muuttumaan, kunhan saan GUIn rakennettua loppuun.
 * Sisältää vielä liikaa tekstikäyttöliittymän osia.
 * 
 * @author HeikkiHei
 */
public class DetermineLevel {

    /**
     * Parametritön konstruktori.
     */
    public DetermineLevel() {
    }
    
    /**
     *
     * @param reader lukija syötettä varten.
     * @return monsterLevel jonka metodi saa syötteenä, rajoitettu välille 1-10.
     */
    public static int chooseLevel(Scanner reader) {

        int monsterLevel = 0;

        while (true) {
            System.out.println("Valitse taso: 1-10");
            try {
                monsterLevel = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException nfe) {
            }
            if (monsterLevel < 11 &&monsterLevel > 0) {
                    break;
                }
        }
        return monsterLevel;
    }

}
