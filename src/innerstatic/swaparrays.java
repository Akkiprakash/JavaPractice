public class swaparrays {
    private static void swapping(int left,int right,int[] arr){
        //base case
        if(left>= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        swapping(left+1, right-1, arr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,3,5,6,7,3,5,5};
        int left =0;
        int right = arr.length-1;
        swapping(left, right,arr);
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
}
