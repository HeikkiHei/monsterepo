package monster.logic;

import java.util.*;
import monster.levelpack.*;

public class SystemLogic {

    public DetermineLevel determineLevel;
    public DetermineClass determineClass;
    private Scanner reader;

    public SystemLogic() {
        this.determineLevel = new DetermineLevel();
        this.determineClass = new DetermineClass();
    }

    public int chooseLevel(Scanner reader) {
        return determineLevel.chooseLevel(reader);
    }

    public String chooseType(Scanner reader) {
        return this.determineClass.chooseType(reader);
    }
}
