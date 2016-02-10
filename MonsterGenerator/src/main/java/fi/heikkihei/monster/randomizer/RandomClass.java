
package fi.heikkihei.monster.randomizer;

import java.io.File;

public class RandomClass {
    
        public RandomClass() throws Exception {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\classes.csv");
        Randomizer randomizer = new Randomizer();
        randomizer.getRandomLineFromInputFile(inputFile);
    }

    
}
