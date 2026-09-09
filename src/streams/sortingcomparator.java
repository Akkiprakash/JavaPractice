package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortingcomparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akki","Prakash","Reddy","apple","banana","kiwi","mango");

        names.stream().sorted(Comparator.comparingInt   (String::length).reversed())
        .map(n->n.toUpperCase()).toList().forEach(System.out::println);
       

}
}
