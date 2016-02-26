package fi.heikkihei.monster.userinterface;

import fi.heikkihei.monster.creature.Creature;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class PrinterForGUITest {

    private PrinterForGUI testable;
    private Creature creature;

    public PrinterForGUITest() {
    }

    @Before
    public void setUp() {
        creature = new Creature();
        creature.setName("name");
        creature.setCreatureClass("class");
        creature.setRace("race");
        creature.setWeapon("weapon");
        creature.setLevel(5);
        creature.setStrength(1);
        creature.setDexterity(1);
        creature.setConstitution(1);
        creature.setIntelligence(1);
        creature.setWisdom(1);
        creature.setCharisma(1);
    }

    @Test
    public void printCreatureWorks() {
        this.testable = new PrinterForGUI(creature);
        assertEquals("NAME: \n" + "name" + "\n \n"
                + "CLASS: \n" + "class" + "\n \n"
                + "RACE: \n" + "race" + "\n \n"
                + "WEAPON: \n" + "weapon" + "\n \n"
                + "LEVEL: \n" + 5 + "\n \n"
                + "STATISTICS: \n \n"
                + "Strength: \n" + 1 + "\n"
                + "Dexterity: \n" + 1 + "\n"
                + "Constitution: \n" + 1 + "\n"
                + "Intelligence: \n" + 1 + "\n"
                + "Wisdom: \n" + 1 + "\n"
                + "Charisma: \n" + 1, testable.printCreature());
    }
}
