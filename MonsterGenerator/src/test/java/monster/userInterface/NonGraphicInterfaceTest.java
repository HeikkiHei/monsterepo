package monster.userInterface;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonGraphicInterfaceTest {

    ByteArrayOutputStream inputStream;

    public NonGraphicInterfaceTest() {
    }
    NonGraphicInterface testableInterface;

    @Before
    public void setUp() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));
    }

    @Test
    public void runWorks() {
        String input = createTestLine("n", "10");
        testableInterface = new NonGraphicInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLineForGuiTest();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 10", compare);
    }

    private String lastOutputLineForGuiTest() {
        String[] output = inputStream.toString().split("\n");
        String lastLine = output[output.length -1];
        return lastLine;
    }

    private String createTestLine(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }

}
