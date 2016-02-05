package monster.levelpack;

import java.util.*;

public class DetermineLevel {

    public DetermineLevel() {
    }
    
        public static int chooseLevel(Scanner reader) {

        int inputInteger = 0;

        while (true) {
            System.out.println("Valitse taso: 1-10");
            try {
                inputInteger = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
            }
            if (inputInteger < 11) {
                if (inputInteger > 0) { // Jaettu kahtia saadakseni selvyyttä PITiin - Heikki Hei
                    break;
                }
            }
        }
        return inputInteger;
    }
    
    
//TODO : Tästä tullee osa GUIn slideria, jolla käyttäjä määrittää haluamansa levelin. Level määrittää monsun tason ja/tai monsujen määrän - Heikki Hei
}
