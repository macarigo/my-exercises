import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class UniqueWord implements Iterable<String> {
    private String message;
    private TreeSet<String> words;

    public UniqueWord(String message) {
        this.message = message;
        this.words = new TreeSet<>();
        String arr[] = message.split(" ");
        for (int i = 0; i < arr.length; i++) {
            words.add(arr[i]);
        }
    }

    @Override
    public Iterator iterator() {
        return words.iterator();
    }

}
