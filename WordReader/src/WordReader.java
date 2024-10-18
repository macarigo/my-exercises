import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class WordReader implements Iterable<String> {
    FileReader reader;
    BufferedReader bReader;
    String[] words;
    int wordCounter;

    public WordReader(String path) throws FileNotFoundException {
        changeFiles(path);
    }

    public void changeFiles(String path) throws FileNotFoundException {
        reader = new FileReader(path);
        bReader = new BufferedReader(reader);
    }

    public String readFileByLine() throws IOException {
        String line = "";
        String result = "";

        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }
        bReader.close();
        return result;
    }

    public void removeSpecialCharacters(String text) {
        words = text.split("[\\s,.\"(){}]+");
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                if (wordCounter >= words.length) {
                    return false;
                }
                return true;
            }

            @Override
            public String next() {
                String tempWord;
                if (hasNext()) {
                    tempWord = words[wordCounter];
                    wordCounter++;
                    return tempWord;
                }
                return null;

            }
        };
    }
}