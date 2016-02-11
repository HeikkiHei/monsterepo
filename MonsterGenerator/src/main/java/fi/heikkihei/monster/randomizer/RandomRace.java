package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomRace {

    /**
     * Luetaan tiedosto joka sisältää rodut ja arvotaan satunnainen rivi eli satunnainen rotu.
     * 
     * @see Randomizer#getRandomLineFromInputFile(java.io.File) 
     * 
     * @return satunnainen rotu, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String RandomRace() throws FileNotFoundException {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\races.csv");
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
