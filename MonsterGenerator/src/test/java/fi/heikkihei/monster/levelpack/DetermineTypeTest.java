package fi.heikkihei.monster.levelpack;

import fi.heikkihei.monster.levelpack.DetermineType;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DetermineTypeTest {

    public DetermineTypeTest() {
    }
    private DetermineType testableDetermineClass;

    @Before
    public void setUp() {
        testableDetermineClass = new DetermineType();
    }

    @Test
    public void chooseTypeWorksNPC() {
        String input = "N";
        Scanner reader = new Scanner(input);
        String output = testableDetermineClass.chooseType(reader);
        assertEquals("NPC", output);
    }

    @Test
    public void chooseTypeWorksMonster() {
        String input = "H";
        Scanner reader = new Scanner(input);
        String output = testableDetermineClass.chooseType(reader);
        assertEquals("Monsu", output);
    }

    @Test
    public void inputTypeToMonsterTypeNpcWorks() {
        String input = "N";
        String output = testableDetermineClass.changeInputLetterForToString(input);
        assertEquals("NPC", output);
    }

    @Test
    public void inputTypeToMonsterTypeMonsterWorks() {
        String input = "H";
        String output = testableDetermineClass.changeInputLetterForToString(input);
        assertEquals("Monsu", output);
    }

    @Test
    public void inputTypeToMonsterTypeIllegalWorks() {
        String input = "G";
        String output = testableDetermineClass.changeInputLetterForToString(input);
        assertEquals("tuntematon", output);
    }

    @Test
    public void inputTypeToMonsterTypeNullWorks() {
        String input = null;
        String output = testableDetermineClass.changeInputLetterForToString(input);
        assertEquals("tuntematon", output);
    }
}
