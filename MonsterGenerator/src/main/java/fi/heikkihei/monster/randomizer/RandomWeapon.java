package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomWeapon {
    
    File inputFile;

    public RandomWeapon() {
        this.inputFile = new File("./src/main/java/fi/heikkihei/monster/datafiles/weapons.csv");
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }
    
    
    /**
     * Luetaan tiedosto joka sisältää aseet ja arvotaan satunnainen rivi eli satunnainen ase.
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
