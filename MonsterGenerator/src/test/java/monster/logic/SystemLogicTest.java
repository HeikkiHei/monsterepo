package monster.logic;

import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SystemLogicTest {

    public SystemLogic testable;

    public SystemLogicTest() {
    }

    @Test
    public void chooseLevelWorks() {
        String input = "10";
        testable = new SystemLogic();
        Scanner reader = new Scanner(input);
        int output = testable.chooseLevel(reader);
        assertEquals(10, output);
    }

    @Test
    public void chooseTypeWorks() {
        String input = "N";
        testable = new SystemLogic();
        Scanner reader = new Scanner(input);
        String output = testable.chooseType(reader);
        assertEquals("N", output);
    }

}
