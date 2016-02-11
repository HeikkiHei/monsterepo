package fi.heikkihei.monster.userInterface;

import java.util.*;

/**
 *
 * @author HeikkiHei
 */
public class TextInterface {

    private Scanner reader;
    private String inputType = "";
    private int inputInteger = 0;
    public fi.heikkihei.monster.logic.SystemLogic logic;
    
    

    /**
     *
     * @param reader luodaan skanneri jolla voidan käyttää logiikan metodeita.
     */
    public TextInterface(Scanner reader) {
        this.reader = reader;
        this.logic = new fi.heikkihei.monster.logic.SystemLogic();
    }

    /**
     * Ajetaan logiikan metodit ja syötetään ulos teksti, joka kertoo valitut tiedot.
     */
    public void run() {
        this.inputType = logic.chooseType(reader);
        this.inputInteger = logic.chooseLevel(reader);
        System.out.print("Päädyit hahmoon, jonka tyyppi on " + inputType + " ja taso on " + this.inputInteger);
    }

}
