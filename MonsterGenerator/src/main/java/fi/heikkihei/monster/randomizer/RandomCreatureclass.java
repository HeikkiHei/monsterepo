package fi.heikkihei.monster.randomizer;

import java.io.File;

/**
 * Luodaan hahmolle satunnainen hahmoluokka.
 *
 * @author HeikkiHei
 */
public class RandomCreatureclass {

    File inputFile;

    /** Parametritön konstruktori, jossa annetaan kuitenkin oikea tiedosto luettavaksi.
     *
     */
    public RandomCreatureclass() {
        this.inputFile = new File("classes.csv");
    }
    /** Metodi jolla voidaan asettaa inputFile, lähinnä helpottamaan testien tekemistä.
     * 
     * @param inputFile tiedosto joka halutaan luettavan.
     */
    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    /**Luetaan tiedosto joka sisältää luokat ja arvotaan satunnainen rivi eli satunnainen luokka.
     *
     * @see Randomizer#getRandomLineFromInputFile(java.io.File)
     *
     * @return satunnainen luokka, String.
     */
    public String returnRandomClass() {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
