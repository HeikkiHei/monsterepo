package fi.heikkihei.monster.randomizer;

import java.io.File;

/**
 * Luodaan hahmolle satunnainen ase.
 *
 * @author HeikkiHei
 */
public class RandomWeapon {

    File inputFile;

    /**
     * Parametritön konstruktori, jossa annetaan kuitenkin oikea tiedosto
     * luettavaksi.
     *
     */
    public RandomWeapon() {
        this.inputFile = new File("resources/weapons.csv");
    }

    /**
     * Metodi jolla voidaan asettaa inputFile, lähinnä helpottamaan testien
     * tekemistä.
     *
     * @param inputFile tiedosto joka halutaan luettavan.
     */
    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Luetaan tiedosto joka sisältää aseet ja arvotaan satunnainen rivi eli
     * satunnainen ase.
     *
     * @see Randomizer#getRandomLineFromInputFile(java.io.File)
     *
     * @return satunnainen ase, String.
     */
    public String returnRandomWeapon()  {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }
}
