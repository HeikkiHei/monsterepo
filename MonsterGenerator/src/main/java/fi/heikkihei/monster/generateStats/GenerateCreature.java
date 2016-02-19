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

    /**
     *
     * @param level taso jonka GUIn liuku määrittää, määrittää hahmon tason.
     */
    public GenerateCreature(int level) {
        this.creature = new Creature();
        this.creature.setLevel(level);
        this.level = level;
    }

    /**
     *
     * @return palauttaa oletushahmon.
     */
    public Creature getCreature() {
        return creature;
    }

    /**
     *
     * @return palauttaa hahmon määritetyn tason
     */
    public int getLevel() {
        return level;
    }

    /**
     * apumuuttuja, jonka avulla saadaan testattua void-metodeita.
     * @return int-tyyppinen muuttuja
     */
    public int getIntStat() {
        return intStat;
    }

    /**
     * apumuuttuja, jonka avulla saadaan testattua void-metodeita.
     * @return String-tyyppinen muuttuja.
     */
    public String getStringStat() {
        return stringStat;
    }

    /**
     *
     * @return luodun hahmon toString
     * @throws FileNotFoundException koska ensimmäiset neljä metodia sisältävät tiedoston lukua.
     * 
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
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

    /**
     * heitetään kymmentahoista noppaa autenttisuuden ja huvin vuoksi.
     * @return luku väliltä 1-10
     */
    public int castD10() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }

    /**
     * annetaan hahmon voimakkuudeksi nopan heitto + taso
     */
    public void randomStrength() {
        this.intStat = castD10();
        this.creature.setStrength(this.intStat + this.level);
    }

    /**
     * annetaan hahmon tarkkuudeksi nopan heitto + taso
     */
    public void randomDexterity() {
        this.intStat = castD10();
        this.creature.setDexterity(this.intStat + this.level);
    }

    /**
     * annetaan hahmon ruumiinrakenteeksi nopan heitto + taso
     */
    public void randomConstitution() {
        this.intStat = castD10();
        this.creature.setConstitution(this.intStat + this.level);
    }

    /**
     * annetaan hahmon älykkyydeksi nopan heitto + taso
     */
    public void randomIntelligence() {
        this.intStat = castD10();
        this.creature.setIntelligence(this.intStat + this.level);
    }

    /**
     * annetaan hahmon viisaudeksi nopan heitto + taso
     */
    public void randomWisdom() {
        this.intStat = castD10();
        this.creature.setWisdom(this.intStat + this.level);
    }

    /**
     * annetaan hahmon karismaksi nopan heitto + taso
     */
    public void randomCharisma() {
        this.intStat = castD10();
        this.creature.setCharisma(this.intStat + this.level);
    }

    /**
     * annetaan hahmolle satunnainen rotu tiedostosta.
     * 
     * @throws FileNotFoundException koska luettu metodi
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomRace() throws FileNotFoundException {
        RandomRace randomRace = new RandomRace();
        this.stringStat = randomRace.returnRandomRace();
        this.creature.setRace(stringStat);
    }

    /**
     * annetaan hahmolle satunnainen luokka tiedostosta.
     * 
     * @throws FileNotFoundException koska luettu metodi
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomCreatureClass() throws FileNotFoundException {
        RandomClass randomClass = new RandomClass();
        this.stringStat = randomClass.returnRandomClass();
        this.creature.setCreatureClass(stringStat);
    }

    /**
     * annetaan hahmolle satunnainen miehen nimi tiedostosta.
     * 
     * @throws FileNotFoundException koska luettu metodi
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomName() throws FileNotFoundException {
        RandomName randomName = new RandomName();
        this.stringStat = randomName.returnRandomName();
        this.creature.setName(stringStat);
    }

    /**
     * annetaan hahmolle satunnainen ase tiedostosta.
     *
     * @throws FileNotFoundException koska luettu metodi
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomWeapon() throws FileNotFoundException {
        RandomWeapon randomWeapon = new RandomWeapon();
        this.stringStat = randomWeapon.returnRandomWeapon();
        this.creature.setWeapon(stringStat);
    }

}
