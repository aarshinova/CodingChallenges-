public class Main {
    public static int solution(int[] arr){
        int currentSum=arr[0];
        int maxSumSubArray = Integer.MIN_VALUE;

        for (int i=1; i<arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSumSubArray = Math.max(maxSumSubArray, currentSum);
        }

        return maxSumSubArray;
    }
}
