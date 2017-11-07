public class Solution {

    public static void main(String[] args) {
        //int[] arr = new int[]{23, 45, 23, 57} ;
     //   int[] arr = new int[]{26, 52, 23, 30, 28, 50, 13, 10, 25};
        //int[] arr ={1,1,1};
        int[] arr = {8, 7, 6, 4};
        int max = 0;
        int min = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i]>min){
                int diff = arr[i] - min;
                max = Math.max(diff, max);
            }else {
                min = arr[i];
            }
        }

        System.out.println("Max : " +max);
    }

}
