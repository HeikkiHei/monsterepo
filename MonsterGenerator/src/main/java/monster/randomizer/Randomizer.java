package monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Randomizer {

    ArrayList<String> FileList = new ArrayList<String>();

    public Randomizer() {
    }

    public String getRandomLineFromInputFile(File inputFile) throws Exception {
        Random random = new Random();
        
        changeFileIntoStrings(inputFile);
        
        return FileList.get(random.nextInt(FileList.size()));
    }

    private void changeFileIntoStrings(File inputFile) throws FileNotFoundException {
        Scanner reader = new Scanner(inputFile);
        while (reader.hasNextLine()) {
            String InputForOneInstance = reader.nextLine();
            FileList.add(InputForOneInstance);
        }
        reader.close();
    }
    
    //Testit puuttuu - Heikki Hei

}
