package fi.heikkihei.monster.levelpack;

import java.util.*;

public class DetermineLevel {

    public DetermineLevel() {
    }
    
        public static int chooseLevel(Scanner reader) {

        int monsterLevel = 0;

        while (true) {
            System.out.println("Valitse taso: 1-10");
            try {
                monsterLevel = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
            }
            if (monsterLevel < 11) {
                if (monsterLevel > 0) { // Jaettu kahtia saadakseni selvyyttä PITiin - Heikki Hei
                    break;
                }
            }
        }
        return monsterLevel;
    }
    
    
//TODO : Tästä tullee osa GUIn slideria, jolla käyttäjä määrittää haluamansa levelin. Level määrittää monsun tason ja/tai monsujen määrän - Heikki Hei
}
