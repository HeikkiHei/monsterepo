package monster.logic;

import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SystemLogicTest {

    public SystemLogic testable;

    public SystemLogicTest() {
    }

    @Before
    public void setUp() {
        testable = new SystemLogic();
    }

    @Test
    public void chooseLevelWorks() {
        String input = "10";

        Scanner reader = new Scanner(input);
        int output = testable.chooseLevel(reader);
        assertEquals(10, output);
    }

    @Test
    public void chooseTypeWorks() {
        String input = "N";

        Scanner reader = new Scanner(input);
        String output = testable.chooseType(reader);
        assertEquals("N", output);
    }

    //<editor-fold defaultstate="collapsed" desc="inputTypeToMonsterTests">
    @Test
    public void inputTypeToMonsterTypeNpcWorks() {
        String input = "N";
        String output = testable.inputTypeToMonsterType(input);
        assertEquals("NPC", output);
    }
    
    @Test
    public void inputTypeToMonsterTypeMonsterWorks() {
        String input = "H";
        String output = testable.inputTypeToMonsterType(input);
        assertEquals("Monsu", output);
    }
    
    @Test
    public void inputTypeToMonsterTypeIllegalWorks() {
        String input = "G";
        String output = testable.inputTypeToMonsterType(input);
        assertEquals("tuntematon", output);
    }
    
    @Test
    public void inputTypeToMonsterTypeNullWorks() {
        String input = null;
        String output = testable.inputTypeToMonsterType(input);
        assertEquals("tuntematon", output);
    }
//</editor-fold>
}
