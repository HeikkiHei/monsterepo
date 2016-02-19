package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomWeaponTest {

    private RandomWeapon testable;
    private File inputFile = new File("src\\test\\java\\fi\\heikkihei\\monster\\datafiles\\test.csv");

    public RandomWeaponTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomWeapon();
        testable.setInputFile(inputFile);
    }
    
    @Test
    public void randomWeaponWorks() throws FileNotFoundException {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomWeapon());
    }

}
