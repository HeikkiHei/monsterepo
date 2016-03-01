package fi.heikkihei.monster.randomizer;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class RandomRaceTest {

    private RandomRace testable;
    private File inputFile = new File("./src/test/java/fi/heikkihei/monster/datafiles/test.csv"); 

    public RandomRaceTest() {
    }

    @Before
    public void setUp() {
        testable = new RandomRace();
        testable.setInputFile(inputFile);
    }

    @Test
    public void randomWeaponWorks() {
        assertEquals("Testattava;Erotettu pilkulla;150;Edellinen kokeilee numeroa", testable.returnRandomRace());
    }

}
