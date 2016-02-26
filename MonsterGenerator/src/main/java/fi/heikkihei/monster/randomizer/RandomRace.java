package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Luodaan hahmolle satunnainen rotu.
 *
 * @author HeikkiHei
 */
public class RandomRace {

    File inputFile;

    /**
     * Parametritön konstruktori, jossa annetaan kuitenkin oikea tiedosto
     * luettavaksi.
     *
     */
    public RandomRace() {
        this.inputFile = new File("races.csv");
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
     * Luetaan tiedosto joka sisältää rodut ja arvotaan satunnainen rivi eli
     * satunnainen rotu.
     *
     * @see Randomizer#getRandomLineFromInputFile(java.io.File)
     *
     * @return satunnainen rotu, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String returnRandomRace() throws FileNotFoundException {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
