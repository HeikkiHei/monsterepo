
package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomClass {
    
    File inputFile;

    public RandomClass() {
        this.inputFile = new File("src\\main\\java\\fi\\heikkihei\\monster\\datafiles\\classes.csv");
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }
    
    
    /**
     * Luetaan tiedosto joka sisältää luokat ja arvotaan satunnainen rivi eli satunnainen luokka.
     * 
     * @see Randomizer#getRandomLineFromInputFile(java.io.File) 
     * 
     * @return satunnainen luokka, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String returnRandomClass() throws FileNotFoundException {
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }


    
}
