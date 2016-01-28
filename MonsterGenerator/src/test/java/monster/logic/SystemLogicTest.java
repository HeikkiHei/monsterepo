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
        int output = testable.chooseLevel(new Scanner(input));
        assertEquals(10, output);
    }
    
    @Test
    public void chooseTypeWorks() {
        String input = "N";
        String output = testable.chooseType(new Scanner(input));
        assertEquals("N", output);
    }
    

}
