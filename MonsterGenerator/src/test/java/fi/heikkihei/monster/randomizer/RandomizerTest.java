package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomizerTest {

    private Randomizer testable;
   private File inputFile = new File("./src/test/java/fi/heikkihei/monster/datafiles/test.csv");

    public RandomizerTest() {
    }

    @Before
    public void setUp() {
        testable = new Randomizer();
    }

    @Test
    public void randomizerGetRandomLineWorks() throws FileNotFoundException {

        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.getRandomLineFromInputFile(inputFile));
    }

}
