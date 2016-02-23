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
public class RandomNameTest {

    private RandomName testable;
    private File inputFile = new File("./src/test/java/fi/heikkihei/monster/datafiles/test.csv");
    
    public RandomNameTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomName();
        testable.setInputFile(inputFile);
    }

    @Test
    public void randomNameWorks() throws FileNotFoundException {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomName());
    }

}
