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

        randomStr();
        randomDex();
        randomCon();
        randomInt();
        randomWis();
        randomCha();
        
        return this.creature.toString();
    }


    public int castD10() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }

    public void randomStr() {
        this.intStat = castD10();
        this.creature.setStrength(this.intStat + this.level);
    }

    public void randomDex() {
        this.intStat = castD10();
        this.creature.setDexterity(this.intStat + this.level);
    }

    public void randomCon() {
        this.intStat = castD10();
        this.creature.setConstitution(this.intStat + this.level);
    }

    public void randomInt() {
        this.intStat = castD10();
        this.creature.setIntelligence(this.intStat + this.level);
    }

    public void randomWis() {
        this.intStat = castD10();
        this.creature.setWisdom(this.intStat + this.level);
    }

    public void randomCha() {
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
