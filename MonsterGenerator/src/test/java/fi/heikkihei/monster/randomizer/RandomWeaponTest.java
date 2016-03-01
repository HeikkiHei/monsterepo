package fi.heikkihei.monster.randomizer;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomWeaponTest {

    private RandomWeapon testable;
    private File inputFile = new File("resources/test.csv"); 

    public RandomWeaponTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomWeapon();
        testable.setInputFile(inputFile);
    }
    
    @Test
    public void randomWeaponWorks() {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomWeapon());
    }

}
