import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // test first method (recursive )
        testRecursive();

        // test array method (non recursive)
       testArray();
    }


    public static void testRecursive(){
        //Given
        int n = 10;

        //WHEN
        int[] ar = Main.classicFibonacci(n);

        List<Integer> arr = new ArrayList();
        for (int el : ar){
            arr.add(el);
        }

        //Then
        System.out.println("Is it fibonacci sequence ? " + testFibonacci(arr));

        for (Integer val : arr){
            System.out.println("val " + val);
        }

    }


    public static  void testArray(){
        //Given
        int n =10;

        //When
        List<Integer> arr = Main.arrayFibonacci(n);

        //Then
        System.out.println("Is it fibonacci sequence ? " + testFibonacci(arr));

        for (Integer val : arr){
            System.out.println("val " + val);
        }
    }

    private static boolean testFibonacci(List<Integer> arr) {
        for (int i=2; i<arr.size(); i++){
            if ((arr.get(i-1) + arr.get(i-2))!=arr.get(i))
                return false;
        }

        return true;
    }


}
