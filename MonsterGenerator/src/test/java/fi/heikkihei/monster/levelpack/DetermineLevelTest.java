
package fi.heikkihei.monster.levelpack;

import fi.heikkihei.monster.levelpack.DetermineLevel;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class DetermineLevelTest {

    DetermineLevel testableLevelpack;
    ByteArrayOutputStream inputStream;

    public DetermineLevelTest() {
    }

    @Before
    public void setUp() {
        testableLevelpack = new DetermineLevel();
    }

    @Test
    public void chooseLevelWorks() {
        String input = "8";
        Scanner reader = new Scanner(input);
        int output = testableLevelpack.chooseLevel(reader);
        assertEquals(8, output);
    }

    @Test
    public void chooseLevelWorksTooLargeInput() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("111", "5");
        int output = testableLevelpack.chooseLevel(new Scanner(input));
        assertEquals(5, output);
    }

    @Test
    public void chooseLevelWorksTooSmallInput() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("-1", "5");
        int output = testableLevelpack.chooseLevel(new Scanner(input));
        assertEquals(5, output);
    }

    @Test
    public void chooseLevelWorksIllegalInput() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("textInput", "5");
        int output = testableLevelpack.chooseLevel(new Scanner(input));
        assertEquals(5, output);
    }

    private String lastOutputLine() {
        String[] output = inputStream.toString().split("\n");
        String lastLine = output[output.length - 1];
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
