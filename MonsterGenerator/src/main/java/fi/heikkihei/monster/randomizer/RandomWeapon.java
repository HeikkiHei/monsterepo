package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author HeikkiHei
 */
public class RandomWeapon {

    /**
     * Luetaan tiedosto joka sisältää aseet ja arvotaan satunnainen rivi eli satunnainen ase.
     * 
     * @see Randomizer#getRandomLineFromInputFile(java.io.File) 
     * 
     * @return satunnainen ase, String.
     * @throws java.io.FileNotFoundException jos tiedostoa ei löydy.
     */
    public String RandomWeapon() throws FileNotFoundException {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\weapons.csv");
        Randomizer randomizer = new Randomizer();
        return randomizer.getRandomLineFromInputFile(inputFile);
    }
}
