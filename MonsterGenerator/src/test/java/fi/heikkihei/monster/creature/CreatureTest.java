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
        creature = new Creature("otus", "paladin", "örkki");
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
        assertEquals("otus", creature.getName());
        assertEquals("paladin", creature.getCreatureClass());
        assertEquals("örkki", creature.getRace());
        assertEquals(5, creature.getLevel());
    }

    @Test
    public void constructorNoParaMetersWorks() {
        Creature noParameters = new Creature();
        assertEquals(null, noParameters.getName());
    }

    @Test
    public void toStringWorks() {
        assertEquals("otus\n paladin\n örkki\n 5\n 1\n 1\n 1\n 1\n 1\n 1", creature.toString());
    }

    //<editor-fold defaultstate="collapsed" desc="Testataan setterit ja getterit isossa nipussa">
    @Test
    public void settersAndGettersLegalWork() {
        creature.setStrength(10);
        assertEquals(10, creature.getStrength());
        creature.setDexterity(10);
        assertEquals(10, creature.getDexterity());
        creature.setConstitution(10);
        assertEquals(10, creature.getConstitution());
        creature.setIntelligence(10);
        assertEquals(10, creature.getIntelligence());
        creature.setWisdom(10);
        assertEquals(10, creature.getWisdom());
        creature.setCharisma(10);
        assertEquals(10, creature.getCharisma());
        creature.setName("name");
        assertEquals("name", creature.getName());
        creature.setCreatureClass("warrior");
        assertEquals("warrior", creature.getCreatureClass());
        creature.setRace("orc");
        assertEquals("orc", creature.getRace());
        creature.setWeapon("weapon");
        assertEquals("weapon", creature.getWeapon());
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
        creature.setStrength(210);
        assertEquals(1, creature.getStrength());
        creature.setDexterity(210);
        assertEquals(1, creature.getDexterity());
        creature.setConstitution(220);
        assertEquals(1, creature.getConstitution());
        creature.setIntelligence(100029);
        assertEquals(1, creature.getIntelligence());
        creature.setWisdom(340);
        assertEquals(1, creature.getWisdom());
        creature.setCharisma(340);
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
        assertEquals("none", creature.getWeapon());
    }
//</editor-fold>

}
