package streams;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        // finding the distinct
      long i =  Arrays.stream(nums).distinct().count();
      if(i < 3){
        return Arrays.stream(nums).max().orElse(0);
      }
      return Arrays.stream(nums)
      .distinct()
      .sorted()
      .skip(i-3)
      .findFirst().getAsInt();
    }
    public void sorting(int[] arr){
        Arrays.stream(arr).distinct().sorted().forEach(n-> System.out.print(n+" "));
    }
}

public class thirdhiggest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {3,2,34,5,5,7,8,3,6,8,9,1};
      
        System.out.println(  solution.thirdMax(arr));

        System.out.println("sorting the array");
         solution.sorting(arr);
    }
    
}
