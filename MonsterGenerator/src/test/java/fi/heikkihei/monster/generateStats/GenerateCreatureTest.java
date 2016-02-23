package fi.heikkihei.monster.generatestats;

import fi.heikkihei.monster.creature.Creature;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HeikkiHei
 */
public class GenerateCreatureTest {
    
    private Creature comparableCreature;
    private GenerateCreature testableGenerator;
    
    public GenerateCreatureTest() {
    }
    
    @Before
    public void setUp() {
        this.comparableCreature = new Creature();
        this.comparableCreature.setLevel(5);
        this.testableGenerator = new GenerateCreature(5);
    }
    
    @Test
    public void constructorWorks() {
        assertEquals(5, this.testableGenerator.getLevel());
        assertEquals(comparableCreature.toString(), this.testableGenerator.getCreature().toString());
    }
    
    @Test
    public void createWorks() {
        try {
            this.testableGenerator.create();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateCreatureTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void randomStrWorks() {
        this.testableGenerator.randomStrength();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getStrength());
    }
    
    @Test
    public void randomDexWorks() {
        this.testableGenerator.randomDexterity();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getDexterity());
    }
    
    @Test
    public void randomConWorks() {
        this.testableGenerator.randomConstitution();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getConstitution());
    }
    
    @Test
    public void randomIntWorks() {
        this.testableGenerator.randomIntelligence();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getIntelligence());
    }
    
    @Test
    public void randomWisWorks() {
        this.testableGenerator.randomWisdom();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getWisdom());
    }
    
    @Test
    public void randomChaWorks() {
        this.testableGenerator.randomCharisma();
        assertEquals(this.testableGenerator.getIntStat() + this.testableGenerator.getLevel(), this.testableGenerator.getCreature().getCharisma());
    }
    
    @Test
    public void randomCreatureClassWorks() throws FileNotFoundException {
        this.testableGenerator.randomCreatureClass();
        assertEquals(this.testableGenerator.getStringStat(), this.testableGenerator.getCreature().getCreatureClass());
    }
    
    @Test
    public void randomWeaponWorks() throws FileNotFoundException {
        this.testableGenerator.randomWeapon();
        assertEquals(this.testableGenerator.getStringStat(), this.testableGenerator.getCreature().getWeapon());
    }
    
    @Test
    public void randomNameWorks() throws FileNotFoundException {
        this.testableGenerator.randomName();
        assertEquals(this.testableGenerator.getStringStat(), this.testableGenerator.getCreature().getName());
    }
    
    @Test
    public void randomRaceWorks() throws FileNotFoundException {
        this.testableGenerator.randomRace();
        assertEquals(this.testableGenerator.getStringStat(), this.testableGenerator.getCreature().getRace());
    }
    
}