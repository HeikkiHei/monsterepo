package monster.creature;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreatureTest {

    public Creature creature;

    public CreatureTest() {
    }

    @Before
    public void setUp() {
        creature = new Creature("otus", "örkki");
        creature.setStr(1);
        creature.setDex(2);
        creature.setCon(3);
        creature.setInt(4);
        creature.setWis(5);
        creature.setCha(6);
    }

    @Test
    public void constructorWorks() {
        assertEquals("otus", creature.getName());
        assertEquals("örkki", creature.getCreatureClass());
    }

    @Test
    public void toStringWorks() {
        assertEquals("otus örkki", creature.toString());
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
        creature.setCreatureClass("orc");
        assertEquals("orc", creature.getCreatureClass());
        creature.setWeapon("weapon");
        assertEquals("weapon", creature.getWeapon());
    }

    @Test
    public void settersAndGettersTooSmallWork() {
        creature.setStr(-10);
        assertEquals(1, creature.getStr());
        creature.setDex(-10);
        assertEquals(2, creature.getDex());
        creature.setCon(-10);
        assertEquals(3, creature.getCon());
        creature.setInt(-10);
        assertEquals(4, creature.getInt());
        creature.setWis(-10);
        assertEquals(5, creature.getWis());
        creature.setCha(-10);
        assertEquals(6, creature.getCha());
    }

    @Test
    public void settersAndGettersTooLargeWork() {
        creature.setStr(11);
        assertEquals(1, creature.getStr());
        creature.setDex(12);
        assertEquals(2, creature.getDex());
        creature.setCon(13);
        assertEquals(3, creature.getCon());
        creature.setInt(100029);
        assertEquals(4, creature.getInt());
        creature.setWis(34);
        assertEquals(5, creature.getWis());
        creature.setCha(11);
        assertEquals(6, creature.getCha());
    }

    @Test
    public void settersAndGettersStringNullWork() {
        creature.setName(null);
        assertEquals("otus", creature.getName());
        creature.setCreatureClass(null);
        assertEquals("örkki", creature.getCreatureClass());
        creature.setWeapon(null);
        assertEquals("none", creature.getWeapon());
    }

}
