package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomName {
    /**
     * Luetaan tiedosto joka sisältää nimet ja arvotaan satunnainen rivi eli satunnainen nimi.
     * 
     * @see Randomizer#getRandomLineFromInputFile(java.io.File) 
     * 
     * @return satunnainen nimi, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String RandomName() throws FileNotFoundException{
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\malenames.csv");
        Randomizer randomizer = new Randomizer();
         return randomizer.getRandomLineFromInputFile(inputFile);
    }

}
