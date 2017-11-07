import java.util.*;

public class Main {


    public static int[] classicFibonacci(int n){
        int[] arr = new int[n+1];

        recursiveFibonacci(n, arr);

        return arr;
    }

    public static int recursiveFibonacci(int n, int[] arr) {
        if (n==0) {
            arr[0]=0;
            return 0;
        }
        if (n<=2){
            arr[1]=1;
            arr[2]=1;
            return 1;
        }
        int val = recursiveFibonacci(n-1, arr) + recursiveFibonacci(n-2, arr);
        arr[n]=val;
        return val;
    }

    public static List arrayFibonacci(int n) {
        List<Integer> arr = new ArrayList<>();
        if (n==0) {
            arr.add(0);
            return arr;
        }
        if (n==1) {
            arr.add(0);
            arr.add(1);
            return arr;
        }

        arr.add(0);
        arr.add(1);

        for (int i=2; i<=n; i++){
            arr.add(arr.get(i-1) + arr.get(i-2));
        }
        return arr;
    }
}
