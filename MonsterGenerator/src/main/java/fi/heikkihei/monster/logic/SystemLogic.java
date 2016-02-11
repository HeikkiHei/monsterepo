package fi.heikkihei.monster.logic;

import fi.heikkihei.monster.levelpack.DetermineType;
import fi.heikkihei.monster.levelpack.DetermineLevel;
import java.util.*;

/**
 *
 * @author HeikkiHei
 */
public class SystemLogic {

    public DetermineLevel determineLevel;
    public DetermineType determineClass;
    private Scanner reader;

    /**
     * alustetaan konstruktorissa luokan ja tason määrittäjät.
     */
    public SystemLogic() {
        this.determineLevel = new DetermineLevel();
        this.determineClass = new DetermineType();
    }

    /**
     *
     * @param reader annetaan lukija, joka tuupataan suoraan eteenpäin seuraavaan luokkaan.
     * @return palautetaan valittu taso.
     */
    public int chooseLevel(Scanner reader) {
        return this.determineLevel.chooseLevel(reader);
    }

    /**
     *
     * @param reader annetaan lukija, joka tuupataan suoraan eteenpäin seuraavaan luokkaan.
     * @return palautetaan valittu tyyppi.
     */
    public String chooseType(Scanner reader) {
        return this.determineClass.chooseType(reader);
    }
}
