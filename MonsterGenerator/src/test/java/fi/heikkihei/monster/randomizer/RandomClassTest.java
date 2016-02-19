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
public class RandomClassTest {

    private RandomClass testable;
    private File inputFile = new File("src\\test\\java\\fi\\heikkihei\\monster\\datafiles\\test.csv");

    public RandomClassTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomClass();
        testable.setInputFile(inputFile);
    }

    @Test
    public void randomClassWorks() throws FileNotFoundException {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomClass());
    }

}
