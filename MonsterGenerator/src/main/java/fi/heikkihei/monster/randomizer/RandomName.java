package fi.heikkihei.monster.randomizer;

import java.io.File;

/**
 * Luodaan hahmolle satunnainen nimi.
 *
 * @author HeikkiHei
 */
public class RandomName {

    File inputFile;

    /** Parametritön konstruktori, jossa annetaan kuitenkin oikea tiedosto luettavaksi.
     *
     */
    public RandomName() {
        this.inputFile = new File("resources/malenames.csv"); 
    }
    /** Metodi jolla voidaan asettaa inputFile, lähinnä helpottamaan testien tekemistä.
     * 
     * @param inputFile tiedosto joka halutaan luettavan.
     */
    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Luetaan tiedosto joka sisältää nimet ja arvotaan satunnainen rivi eli
     * satunnainen nimi.
     *
     * @see Randomizer#getRandomLineFromInputFile(java.io.File)
     *
     * @return satunnainen nimi, String.
     */
    public String returnRandomName() {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
