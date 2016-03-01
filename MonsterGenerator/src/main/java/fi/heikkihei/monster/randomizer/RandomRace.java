package fi.heikkihei.monster.randomizer;

import java.io.File;

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
     */
    public String returnRandomRace() {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
