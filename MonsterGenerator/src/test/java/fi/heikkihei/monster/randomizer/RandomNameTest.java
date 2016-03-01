package fi.heikkihei.monster.randomizer;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomNameTest {

    private RandomName testable;
    private File inputFile = new File("./resources/test.csv"); 
    
    public RandomNameTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomName();
        testable.setInputFile(inputFile);
    }

    @Test
    public void randomNameWorks() {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomName());
    }

}
