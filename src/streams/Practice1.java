
package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream; 

public class Practice1{
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};

       Integer[] arr2 = {1,2,3,4,5};

      IntStream steam= Arrays.stream(arr);
    //   steam.forEach(System.out::print);

      Stream<Integer> stream1 = Arrays.stream(arr2);
    //   stream1.forEach(System.out::println);

    //   Stream<Integer> stream2 = Stream.of(arr2);
    //   stream2.forEach(System.out::println);
      

    /*
        filter -> is used to filter the data based on the need like map, filter,reduce,peek,distinct,sort,skip,limit
        --> these are called intermediate operations because they return stream object and we can use them again and again

        --> terminal operations -> forEach, collect, reduce, count, min, max, findFirst, findAny, allMatch, anyMatch, noneMatch
        -> these are called terminal operations because they return void or non-stream object and we cannot use them again
    */
//       // printing the even numbers 
//       stream1.filter(n->n%2==0).forEach(System.out::println);  /// if one stream is used we cannot use that stream again 
// /// one time use == stream
//       // printing the odd
//       steam.filter(n->n%2!=0).forEach(n->System.out.println(n));

//       /// maps is the transformation operation which is used to transform the data from one form to another form
      
//       List<String> names = Arrays.asList("akki","prakash","Reddy");

//       names.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));

      int[] array = {2,4,5,6,3,1};
      
     System.out.println(Arrays.stream(array).sorted().limit(array.length-1).max().or);

      
    }
}
