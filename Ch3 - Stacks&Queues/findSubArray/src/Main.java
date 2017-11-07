import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        char[] arr = s.toCharArray();
        String list = new String<>();

        for (int i=0; i<arr.length; i++){
            if (!list.contains(arr[i]))
                list.add(arr[i]);
        }

        String maxLetters=list.size()-2;
        Set<String> setComb;

        int val=1;
        while (val<=maxLetters){
            int i = 0;
            while (i<list.length){
                String s = list.substring(i, i+val)
                for (int j=(i+val); j<list.size(); j++){
                    String comb = "" + s + list.charAt[j];
                    setComb.add(comb);
                }
                i=i+1;
            }
            val=val+1;
        }
    }


    public static int subarraySum(int[] nums, int k) {
        Integer nbSubArr=0;
        nbSubArr=findSubArray(nums, k, 0, nbSubArr);
        return nbSubArr;
    }

    public static int findSubArray(int[] nums, int k, int counter, Integer nbSubArray){
        if (counter % 1000 == 0)
            System.out.println("counter = " + counter);
        int sum = 0;
        if (counter==nums.length-1)
            return nbSubArray;
        else {
            for (int j=counter; j<nums.length; j++){
                sum+=nums[j];
                if (sum==k)
                    nbSubArray++;
            }
           return findSubArray(nums,k,++counter, nbSubArray);
        }
    }
}
