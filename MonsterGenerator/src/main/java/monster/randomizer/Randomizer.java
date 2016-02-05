package monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Randomizer {

    ArrayList<String> FileList = new ArrayList<String>();

    public Randomizer() {
    }

    public String readFileIntoString(File inputFile) throws Exception {
        Random random = new Random();
        Scanner reader = changeFileIntoArrayList(inputFile);
        reader.close();

        int getOneRandom = random.nextInt(FileList.size());
        String randomized = FileList.get(getOneRandom);   
        return randomized;
    }

    private Scanner changeFileIntoArrayList(File inputFile) throws FileNotFoundException {
        Scanner reader = new Scanner(inputFile);
        while (reader.hasNextLine()) {
            String InputForOneInstance = reader.nextLine();
            FileList.add(InputForOneInstance);
        }
        return reader;
    }
    
    //Testit puuttuu - Heikki Hei

}
