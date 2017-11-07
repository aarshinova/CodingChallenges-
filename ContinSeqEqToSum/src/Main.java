import java.util.HashMap;

public class Main {
    //Problem: Given a sequence of nonnegative integers A and an integer T, return whether there is a *continuous sequence* of A that sums up to exactly T
    //* Problem: Given a sequence of nonnegative integers A and an integer T, return whether there is a *continuous sequence* of A that sums up to exactly T

   // Example:
    //     [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
    //     [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
    //     [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7
    public static boolean solution(int[] array, int total){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);

        for (int i=0; i<array.length; i++){
            sum += array[i];
            if (map.containsKey(sum-total))
                return true;
            map.put(sum, map.getOrDefault(sum, 1) + 1);
        }

        return false;
    }

    // Find subarray with given sum
    // {1, 4, 20, 3, 10, 5}, sum = 33
    public static boolean solutionSubArray(int[] array, int total){
        int sum = 0;
        int start=0;

        for (int i=0; i<array.length; i++){
            sum += array[i];
            while (sum>total && start<i){
                sum=sum - array[start];
                start++;
            }

            if (sum == total){
                System.out.println("The sum is between "+start+ " and " +i);
                return true;
            }


        }

        return false;
    }

}
