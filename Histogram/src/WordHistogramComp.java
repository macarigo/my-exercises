import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class WordHistogramComp extends HashMap<String, Integer> implements Iterable<String> {
    String arr[];
    HashSet<String> uniqueWords = new HashSet<>();

    public WordHistogramComp(String phrase) {
        arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            uniqueWords.add(arr[i]);
        }
        wordCounter();
    }

    private void wordCounter() {
        for (String uniqueWord : uniqueWords) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (uniqueWord.equals(arr[i])) {
                    counter++;
                }
                this.put(uniqueWord, counter);
            }

        }
    }

    @Override
    public Iterator<String> iterator() {
        return this.keySet().iterator();
    }
}



/*
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class WordHistogramComp implements Iterable<String> {
    HashMap<String, Integer> wordMap = new HashMap<>();
    HashSet<String> uniqueWords = new HashSet<>();
    String arr[];

    public WordHistogramComp(String phrase) {
        arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            uniqueWords.add(arr[i]);
        }
        wordCounter();
    }

    @Override
    public Iterator iterator() {
        return wordMap.keySet().iterator();
    }

    private void wordCounter() {
        for (String uniqueWord : uniqueWords) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (uniqueWord.equals(arr[i])) {
                    counter++;
                }
                wordMap.put(uniqueWord, counter);
            }

        }
    }

    public int size() {
        return wordMap.size();
    }

    public Integer get(String word) {
        return wordMap.get(word);
    }
}
*/
