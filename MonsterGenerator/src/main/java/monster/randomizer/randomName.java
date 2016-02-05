package monster.randomizer;

import java.io.File;

public class RandomName {

    public RandomName() throws Exception {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\malenames.csv");
        Randomizer randomizer = new Randomizer();
        randomizer.getRandomLineFromInputFile(inputFile);
    }

}
