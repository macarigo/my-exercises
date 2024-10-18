import java.util.Iterator;

public class Main {
    private static final String FILE_PATH = "src/lorem_ipsum.txt";
    private static final String OTHER_PATH = "src/lorem_ipsum2.txt";


    public static void main(String[] args) {
        try {
            WordReader wordReader = new WordReader(FILE_PATH);
            wordReader.removeSpecialCharacters(wordReader.readFileByLine());

            for (String word : wordReader) {
                System.out.println(word);
            }

            Iterator<String> iterator = wordReader.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}