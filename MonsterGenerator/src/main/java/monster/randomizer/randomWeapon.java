package monster.randomizer;

import java.io.File;

public class RandomWeapon {

    public RandomWeapon() throws Exception {
        File inputFile = new File("src\\main\\java\\monster\\datafiles\\weapons.csv");
        Randomizer randomizer = new Randomizer();
        randomizer.readFileIntoString(inputFile);
    }

}
