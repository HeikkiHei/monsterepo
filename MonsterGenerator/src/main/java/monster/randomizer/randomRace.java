package monster.randomizer;

import java.io.File;

public class RandomRace {

    public RandomRace() throws Exception {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\races.csv");
        Randomizer randomizer = new Randomizer();
        randomizer.getRandomLineFromInputFile(inputFile);
    }

}
