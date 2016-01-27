package monster.userInterface;

import java.util.*;
import monster.logic.*;

public class NonGraphicInterface {

    private Scanner reader;
    private String inputType = "";
    private int inputInteger = 0;
    
    public monster.logic.logic logic;

    public NonGraphicInterface(Scanner reader) {
        this.reader = reader;
        this.logic = new monster.logic.logic(reader);
    }

    public void run() {
        this.inputType = logic.chooseType(this.inputType, reader);
        this.inputInteger = logic.chooseLevel(this.inputInteger, reader);
        String monsterType = logic.inputTypeToMonsterType(inputType);
        System.out.print("Päädyit hahmoon, jonka tyyppi on " + monsterType + " ja taso on " + this.inputInteger);
    }

}
