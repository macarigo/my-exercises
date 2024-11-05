import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main implements Iterable{
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";
        //map, filter and reduce
        //map to apply touppercase
        //filter to remove garbage
        //reduce to join the two strings

        Stream result = Stream.of(message.split(" ")).map(String::toUpperCase);
        Stream.of(result).peek(r -> System.out.println(r));
        System.out.println(result);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
