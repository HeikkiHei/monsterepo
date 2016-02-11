package fi.heikkihei.monster.logic;

import fi.heikkihei.monster.logic.SystemLogic;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import fi.heikkihei.monster.userInterface.TextInterface;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class SystemLogicTest {

    SystemLogic testableLogic;
    ByteArrayOutputStream inputStream;

 
    public SystemLogicTest() {
    }

    @Before
    public void setUp() {
        testableLogic = new SystemLogic();
    }

    @Test
    public void creatureCreationWorksNPC() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("n", "8");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 8", compare);
    }

    @Test
    public void creatureCreationWorksMonster() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("h", "8");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on Monsu ja taso on 8", compare);
    }

    @Test
    public void creatureCreationWorksTooLargeLevelNPC() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("n", "111", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksTooLargeLevelMonster() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("h", "111", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on Monsu ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksNegativeLevelMonster() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("h", "-2", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on Monsu ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksNegativeLevelNPC() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("n", "-2", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksMultipleWrongTypeAndLevelInputNPC() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("r", "r", "r", "r", "r", "n", "111", "n", "0", "111", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksMultipleWrongTypeAndLevelInputMonster() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("r", "r", "r", "r", "r", "h", "111", "n", "0", "111", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on Monsu ja taso on 5", compare);
    }

    @Test
    public void creatureCreationWorksIllegalLevelInputNPC() {
        inputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(inputStream));

        String input = createTestLine("n", "n", "5");
        TextInterface testableInterface = new TextInterface(new Scanner(input));
        testableInterface.run();

        String compare = lastOutputLine();
        assertEquals("Päädyit hahmoon, jonka tyyppi on NPC ja taso on 5", compare);
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
