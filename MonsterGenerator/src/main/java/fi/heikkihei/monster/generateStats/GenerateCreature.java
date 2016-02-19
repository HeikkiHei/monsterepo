package fi.heikkihei.monster.generatestats;

import fi.heikkihei.monster.creature.Creature;
import fi.heikkihei.monster.randomizer.RandomClass;
import fi.heikkihei.monster.randomizer.RandomName;
import fi.heikkihei.monster.randomizer.RandomRace;
import fi.heikkihei.monster.randomizer.RandomWeapon;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 *
 * @author HeikkiHei
 */
public class GenerateCreature {

    private Creature creature;
    private int level;
    private int intStat;
    private String stringStat;

    public GenerateCreature(int level) {
        this.creature = new Creature();
        this.creature.setLevel(level);
        this.level = level;
    }

    public Creature getCreature() {
        return creature;
    }

    public int getLevel() {
        return level;
    }

    public int getIntStat() {
        return intStat;
    }

    public String getStringStat() {
        return stringStat;
    }

    public String create() throws FileNotFoundException {
        randomWeapon();
        randomName();
        randomCreatureClass();
        randomRace();

        randomStrength();
        randomDexterity();
        randomConstitution();
        randomIntelligence();
        randomWisdom();
        randomCharisma();
        
        return this.creature.toString();
    }


    public int castD10() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }

    public void randomStrength() {
        this.intStat = castD10();
        this.creature.setStrength(this.intStat + this.level);
    }

    public void randomDexterity() {
        this.intStat = castD10();
        this.creature.setDexterity(this.intStat + this.level);
    }

    public void randomConstitution() {
        this.intStat = castD10();
        this.creature.setConstitution(this.intStat + this.level);
    }

    public void randomIntelligence() {
        this.intStat = castD10();
        this.creature.setIntelligence(this.intStat + this.level);
    }

    public void randomWisdom() {
        this.intStat = castD10();
        this.creature.setWisdom(this.intStat + this.level);
    }

    public void randomCharisma() {
        this.intStat = castD10();
        this.creature.setCharisma(this.intStat + this.level);
    }

    public void randomRace() throws FileNotFoundException {
        RandomRace randomRace = new RandomRace();
        this.stringStat = randomRace.returnRandomRace();
        this.creature.setRace(stringStat);
    }

    public void randomCreatureClass() throws FileNotFoundException {
        RandomClass randomClass = new RandomClass();
        this.stringStat = randomClass.returnRandomClass();
        this.creature.setCreatureClass(stringStat);
    }

    public void randomName() throws FileNotFoundException {
        RandomName randomName = new RandomName();
        this.stringStat = randomName.returnRandomName();
        this.creature.setName(stringStat);
    }

    public void randomWeapon() throws FileNotFoundException {
        RandomWeapon randomWeapon = new RandomWeapon();
        this.stringStat = randomWeapon.returnRandomWeapon();
        this.creature.setWeapon(stringStat);
    }

}
