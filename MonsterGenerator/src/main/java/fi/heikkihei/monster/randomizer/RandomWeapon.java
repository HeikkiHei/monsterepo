package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

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
        this.inputFile = new File("./src/main/java/fi/heikkihei/monster/datafiles/weapons.csv");
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
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String returnRandomWeapon() throws FileNotFoundException {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }
}
