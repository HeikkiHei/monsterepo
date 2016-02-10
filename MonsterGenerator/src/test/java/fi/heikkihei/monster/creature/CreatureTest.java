package fi.heikkihei.monster.creature;

import fi.heikkihei.monster.creature.Creature;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreatureTest {

    public Creature creature;

    public CreatureTest() {
    }

    @Before
    public void setUp() {
        creature = new Creature("otus", "paladin", "örkki");
        creature.setStr(1);
        creature.setDex(1);
        creature.setCon(1);
        creature.setInt(1);
        creature.setWis(1);
        creature.setCha(1);
    }

    @Test
    public void constructorWorks() {
        assertEquals("otus", creature.getName());
        assertEquals("paladin", creature.getCreatureClass());
        assertEquals("örkki", creature.getRace());
    }

    @Test
    public void toStringWorks() {
        assertEquals("otus paladin örkki", creature.toString());
    }

    @Test
    public void settersAndGettersLegalWork() {
        creature.setStr(10);
        assertEquals(10, creature.getStr());
        creature.setDex(10);
        assertEquals(10, creature.getDex());
        creature.setCon(10);
        assertEquals(10, creature.getCon());
        creature.setInt(10);
        assertEquals(10, creature.getInt());
        creature.setWis(10);
        assertEquals(10, creature.getWis());
        creature.setCha(10);
        assertEquals(10, creature.getCha());
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
        creature.setStr(-10);
        assertEquals(1, creature.getStr());
        creature.setDex(-10);
        assertEquals(1, creature.getDex());
        creature.setCon(-10);
        assertEquals(1, creature.getCon());
        creature.setInt(-10);
        assertEquals(1, creature.getInt());
        creature.setWis(-10);
        assertEquals(1, creature.getWis());
        creature.setCha(-10);
        assertEquals(1, creature.getCha());
    }

    @Test
    public void settersAndGettersTooLargeWork() {
        creature.setStr(11);
        assertEquals(1, creature.getStr());
        creature.setDex(12);
        assertEquals(1, creature.getDex());
        creature.setCon(13);
        assertEquals(1, creature.getCon());
        creature.setInt(100029);
        assertEquals(1, creature.getInt());
        creature.setWis(34);
        assertEquals(1, creature.getWis());
        creature.setCha(11);
        assertEquals(1, creature.getCha());
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

}
