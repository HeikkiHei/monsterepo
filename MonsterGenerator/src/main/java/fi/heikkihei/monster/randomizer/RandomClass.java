
package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomClass {
    
    /**
     * Luetaan tiedosto joka sisältää luokat ja arvotaan satunnainen rivi eli satunnainen luokka.
     * 
     * @see Randomizer#getRandomLineFromInputFile(java.io.File) 
     * 
     * @return satunnainen luokka, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String RandomClass() throws FileNotFoundException {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\classes.csv");
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }

    
}
