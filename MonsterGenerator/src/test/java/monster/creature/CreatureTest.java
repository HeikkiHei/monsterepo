
package monster.creature;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        assertEquals("otus",creature.getName());
        assertEquals("örkki",creature.getCreatureClass());
    }
    
    @Test
    public void toStringWorks() {
        assertEquals("otus örkki", creature.toString());
    }


}
