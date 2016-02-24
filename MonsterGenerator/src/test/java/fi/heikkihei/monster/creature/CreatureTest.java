package fi.heikkihei.monster.creature;

import fi.heikkihei.monster.creature.Creature;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class CreatureTest {

    public Creature creature;

    public CreatureTest() {
    }

    @Before
    public void setUp() {
        creature = new Creature();
        creature.setName("otus");
        creature.setCreatureClass("paladin");
        creature.setRace("örkki");
        creature.setStrength(1);
        creature.setDexterity(1);
        creature.setConstitution(1);
        creature.setIntelligence(1);
        creature.setWisdom(1);
        creature.setCharisma(1);
        creature.setLevel(5);
    }

    @Test
    public void constructorWorks() {
        Creature noParameters = new Creature();
        assertEquals(null, noParameters.getName());
        assertEquals(0, noParameters.getLevel());
    }

    @Test
    public void toStringWorks() {
        assertEquals("otus\n paladin\n örkki\n null\n 5\n 1\n 1\n 1\n 1\n 1\n 1", creature.toString());
    }

    //<editor-fold defaultstate="collapsed" desc="Testataan setterit ja getterit isossa nipussa">
    @Test
    public void settersAndGettersLegalWork() {
        creature.setStrength(20);
        assertEquals(20, creature.getStrength());
        creature.setDexterity(20);
        assertEquals(20, creature.getDexterity());
        creature.setConstitution(20);
        assertEquals(20, creature.getConstitution());
        creature.setIntelligence(20);
        assertEquals(20, creature.getIntelligence());
        creature.setWisdom(20);
        assertEquals(20, creature.getWisdom());
        creature.setCharisma(20);
        assertEquals(20, creature.getCharisma());
        creature.setName("name");
        assertEquals("name", creature.getName());
        creature.setCreatureClass("warrior");
        assertEquals("warrior", creature.getCreatureClass());
        creature.setRace("orc");
        assertEquals("orc", creature.getRace());
        creature.setWeapon("weapon");
        assertEquals("weapon", creature.getWeapon());
        creature.setLevel(5);
        assertEquals(5, this.creature.getLevel());
    }

    @Test
    public void settersAndGettersTooSmallWork() {
        creature.setStrength(-100);
        assertEquals(1, creature.getStrength());
        creature.setDexterity(-100);
        assertEquals(1, creature.getDexterity());
        creature.setConstitution(-100);
        assertEquals(1, creature.getConstitution());
        creature.setIntelligence(-100);
        assertEquals(1, creature.getIntelligence());
        creature.setWisdom(-100);
        assertEquals(1, creature.getWisdom());
        creature.setCharisma(-100);
        assertEquals(1, creature.getCharisma());
    }

    @Test
    public void settersAndGettersTooLargeWork() {
        creature.setStrength(21);
        assertEquals(1, creature.getStrength());
        creature.setDexterity(21);
        assertEquals(1, creature.getDexterity());
        creature.setConstitution(21);
        assertEquals(1, creature.getConstitution());
        creature.setIntelligence(21);
        assertEquals(1, creature.getIntelligence());
        creature.setWisdom(21);
        assertEquals(1, creature.getWisdom());
        creature.setCharisma(21);
        assertEquals(1, creature.getCharisma());
    }

    @Test
    public void settersAndGettersStringNullWork() {
        creature.setName(null);
        assertEquals("otus", creature.getName());
        creature.setCreatureClass(null);
        assertEquals("paladin", creature.getCreatureClass());
        creature.setRace(null);
        assertEquals("örkki", creature.getRace());
        creature.setWeapon(null);
        assertEquals(null, creature.getWeapon());
    }
//</editor-fold>

}
