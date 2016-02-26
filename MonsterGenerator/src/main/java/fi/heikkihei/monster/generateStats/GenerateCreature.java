package fi.heikkihei.monster.generatestats;

import fi.heikkihei.monster.creature.Creature;
import fi.heikkihei.monster.randomizer.RandomCreatureclass;
import fi.heikkihei.monster.randomizer.RandomName;
import fi.heikkihei.monster.randomizer.RandomRace;
import fi.heikkihei.monster.randomizer.RandomWeapon;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Luokka jossa luodaan hahmo.
 *
 * @author HeikkiHei
 */
public class GenerateCreature {

    private Creature creature;
    private int level;
    private int intStat;
    private String stringStat;

    /**
     * Konstruktori, jossa alustetaan luotava hahmo.
     *
     * @param level hahmolle annettava taso, 1-10.
     */
    public GenerateCreature(int level) {
        this.creature = new Creature();
        this.creature.setLevel(level);
        this.level = level;
    }

    /**
     * Metodi joka hoitaa hahmon luonnin.
     *
     * @return luodun hahmon toString.
     * @throws FileNotFoundException koska ensimmäiset neljä metodia sisältävät
     * tiedoston lukua.
     *
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public Creature create() throws FileNotFoundException {
        randomName();
        randomCreatureClass();
        randomRace();
        randomWeapon();
        randomStrength();
        randomDexterity();
        randomConstitution();
        randomIntelligence();
        randomWisdom();
        randomCharisma();

        return this.creature;
    }

    /**
     * Palauttaa hahmon, joka on luotu.
     *
     * @return hahmo.
     */
    public Creature getCreature() {
        return creature;
    }

    /**
     * Palauttaa luokan tason, joka konstruktorissa asetetaan myös hahmon
     * tasoksi.
     *
     * @return luokan taso.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Apumuuttuja, jonka avulla saadaan testattua void-metodeita.
     *
     * @return int-tyyppinen muuttuja.
     */
    public int getIntStat() {
        return intStat;
    }

    /**
     * Apumuuttuja, jonka avulla saadaan testattua void-metodeita.
     *
     * @return String-tyyppinen muuttuja.
     */
    public String getStringStat() {
        return stringStat;
    }

    /**
     * Heitetään kymmentahoista noppaa autenttisuuden ja huvin vuoksi.
     *
     * @return luku väliltä 1-10.
     */
    public int castD10() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }

    /**
     * Annetaan hahmon voimakkuudeksi nopan heitto + taso.
     */
    public void randomStrength() {
        this.intStat = castD10();
        this.creature.setStrength(this.intStat + this.level);
    }

    /**
     * Annetaan hahmon tarkkuudeksi nopan heitto + taso.
     */
    public void randomDexterity() {
        this.intStat = castD10();
        this.creature.setDexterity(this.intStat + this.level);
    }

    /**
     * Annetaan hahmon ruumiinrakenteeksi nopan heitto + taso.
     */
    public void randomConstitution() {
        this.intStat = castD10();
        this.creature.setConstitution(this.intStat + this.level);
    }

    /**
     * Annetaan hahmon älykkyydeksi nopan heitto + taso.
     */
    public void randomIntelligence() {
        this.intStat = castD10();
        this.creature.setIntelligence(this.intStat + this.level);
    }

    /**
     * Annetaan hahmon viisaudeksi nopan heitto + taso.
     */
    public void randomWisdom() {
        this.intStat = castD10();
        this.creature.setWisdom(this.intStat + this.level);
    }

    /**
     * Annetaan hahmon karismaksi nopan heitto + taso.
     */
    public void randomCharisma() {
        this.intStat = castD10();
        this.creature.setCharisma(this.intStat + this.level);
    }

    /**
     * Annetaan hahmolle satunnainen rotu tiedostosta.
     *
     * @throws FileNotFoundException koska luettu metodi.
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomRace() throws FileNotFoundException {
        RandomRace randomRace = new RandomRace();
        this.stringStat = randomRace.returnRandomRace();
        this.creature.setRace(this.stringStat);
    }

    /**
     * Annetaan hahmolle satunnainen luokka tiedostosta.
     *
     * @throws FileNotFoundException koska luettu metodi.
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomCreatureClass() throws FileNotFoundException {
        RandomCreatureclass randomClass = new RandomCreatureclass();
        this.stringStat = randomClass.returnRandomClass();
        this.creature.setCreatureClass(this.stringStat);
    }

    /**
     * Annetaan hahmolle satunnainen miehen nimi tiedostosta.
     *
     * @throws FileNotFoundException koska luettu metodi.
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomName() throws FileNotFoundException {
        RandomName randomName = new RandomName();
        this.stringStat = randomName.returnRandomName();
        this.creature.setName(this.stringStat);
    }

    /**
     * Annetaan hahmolle satunnainen ase tiedostosta.
     *
     * @throws FileNotFoundException koska luettu metodi.
     * @see fi.heikkihei.monster.randomizer.Randomizer
     */
    public void randomWeapon() throws FileNotFoundException {
        RandomWeapon randomWeapon = new RandomWeapon();
        this.stringStat = randomWeapon.returnRandomWeapon();
        this.creature.setWeapon(this.stringStat);
    }
}
