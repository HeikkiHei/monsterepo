package monster.userInterface;

import java.util.*;
import monster.logic.*;

public class TextInterface {

    private Scanner reader;
    private String inputType = "";
    private int inputInteger = 0;
    
    public monster.logic.SystemLogic logic;

    public TextInterface(Scanner reader) {
        this.reader = reader;
        this.logic = new monster.logic.SystemLogic();
    }

    public void run() {
        this.inputType = logic.chooseType(reader);
        this.inputInteger = logic.chooseLevel(reader);
        System.out.print("Päädyit hahmoon, jonka tyyppi on " + inputType + " ja taso on " + this.inputInteger);
    }

}
