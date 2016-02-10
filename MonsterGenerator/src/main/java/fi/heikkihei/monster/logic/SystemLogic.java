package fi.heikkihei.monster.logic;

import fi.heikkihei.monster.levelpack.DetermineType;
import fi.heikkihei.monster.levelpack.DetermineLevel;
import java.util.*;

public class SystemLogic {

    public DetermineLevel determineLevel;
    public DetermineType determineClass;
    private Scanner reader;

    public SystemLogic() {
        this.determineLevel = new DetermineLevel();
        this.determineClass = new DetermineType();
    }

    public int chooseLevel(Scanner reader) {
        return this.determineLevel.chooseLevel(reader);
    }

    public String chooseType(Scanner reader) {
        return this.determineClass.chooseType(reader);
    }
}
