package fi.heikkihei.monster.randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Luokka joka käyttää randomia kaikkien puolesta, arpoo rivin luettavasta
 * tiedostosta.
 *
 * @author HeikkiHei
 */
public class Randomizer {

    ArrayList<String> fileAsStrings = new ArrayList<>();

    /**
     * Parametritön konstruktori.
     */
    public Randomizer() {
    }

    /**
     * Luetaan haluttu tiedosto ja palautetaan siitä yksi satunnainen rivi.
     *
     * @param inputFile luettava csv-tiedosto, joka sisältää halutun datan.
     * @return satunnainen rivi tiedostosta.
     * @throws java.io.FileNotFoundException jos tiedostoa ei ole.
     */
    public String getRandomLineFromInputFile(File inputFile) throws FileNotFoundException {
        Random random = new Random();

        changeFileIntoStrings(inputFile);

        return fileAsStrings.get(random.nextInt(fileAsStrings.size()));
    }

    /**
     * Muutetaan tiedosto csv:stä ArrayListiksi.
     *
     * @param inputFile luettava csv-tiedosto.
     * @throws FileNotFoundException jos tiedostoa ei ole.
     */
    private void changeFileIntoStrings(File inputFile) throws FileNotFoundException {
        try (Scanner reader = new Scanner(inputFile)) {
            while (reader.hasNextLine()) {
                String inputForOneInstance = reader.nextLine();
                fileAsStrings.add(inputForOneInstance);
            }
        }
    }

}
