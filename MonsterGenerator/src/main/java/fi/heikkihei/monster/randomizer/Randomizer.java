package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Randomizer {

    ArrayList<String> fileAsStrings = new ArrayList<>();

    public Randomizer() {
    }

    public String getRandomLineFromInputFile(File inputFile) throws Exception {
        Random random = new Random();
        
        changeFileIntoStrings(inputFile);
        
        return fileAsStrings.get(random.nextInt(fileAsStrings.size()));
    }

    private void changeFileIntoStrings(File inputFile) throws FileNotFoundException {
        try (Scanner reader = new Scanner(inputFile)) {
            while (reader.hasNextLine()) {
                String InputForOneInstance = reader.nextLine();
                fileAsStrings.add(InputForOneInstance);
            }
        }
    }
    
    //Testit puuttuu - Heikki Hei

}
