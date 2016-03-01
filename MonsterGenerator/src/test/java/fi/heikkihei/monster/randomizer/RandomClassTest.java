package fi.heikkihei.monster.randomizer;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomClassTest {

    private RandomCreatureclass testable;
    private File inputFile = new File("./src/test/java/fi/heikkihei/monster/datafiles/test.csv"); 

    
    public RandomClassTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomCreatureclass();
        testable.setInputFile(inputFile);
    }

    @Test
    public void randomClassWorks() {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomClass());
    }

}
