package fi.heikkihei.monster.randomizer;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomizerTest {

    private Randomizer testable;
    private File inputFile;

    public RandomizerTest() {
    }

    @Before
    public void setUp() {
        this.testable = new Randomizer();
        this.inputFile = new File("./src/test/java/fi/heikkihei/monster/datafiles/test.csv");
    }

    @Test
    public void randomizerGetRandomLineWorks() {

        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.getRandomLineFromInputFile(inputFile));
    }

    @Test
    public void randomizerFileNotFoundWorks() {
        this.inputFile = new File("There is no such file");
        assertEquals("File not found", testable.getRandomLineFromInputFile(inputFile));
    }

}
