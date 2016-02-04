package monster.logic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import monster.userInterface.TextInterface;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void chooseLevelWorks() {
        String input = "8";

        Scanner reader = new Scanner(input);
        int output = testableLogic.chooseLevel(reader);
        assertEquals(8, output);
    }

    @Test
    public void chooseTypeWorksNPC() {
        String input = "N";

        Scanner reader = new Scanner(input);
        String output = testableLogic.chooseType(reader);
        assertEquals("N", output);
    }

    @Test
    public void chooseTypeWorksMonster() {
        String input = "H";

        Scanner reader = new Scanner(input);
        String output = testableLogic.chooseType(reader);
        assertEquals("H", output);
    }

    //<editor-fold defaultstate="collapsed" desc="inputTypeToMonsterTests">
    @Test
    public void inputTypeToMonsterTypeNpcWorks() {
        String input = "N";
        String output = testableLogic.inputTypeToMonsterType(input);
        assertEquals("NPC", output);
    }

    @Test
    public void inputTypeToMonsterTypeMonsterWorks() {
        String input = "H";
        String output = testableLogic.inputTypeToMonsterType(input);
        assertEquals("Monsu", output);
    }

    @Test
    public void inputTypeToMonsterTypeIllegalWorks() {
        String input = "G";
        String output = testableLogic.inputTypeToMonsterType(input);
        assertEquals("tuntematon", output);
    }

    @Test
    public void inputTypeToMonsterTypeNullWorks() {
        String input = null;
        String output = testableLogic.inputTypeToMonsterType(input);
        assertEquals("tuntematon", output);
    }
//</editor-fold>

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
