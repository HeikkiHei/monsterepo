package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomRace {

    File inputFile;

    public RandomRace() {
        this.inputFile = new File("./src/main/java/fi/heikkihei/monster/datafiles/races.csv");
    }

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
