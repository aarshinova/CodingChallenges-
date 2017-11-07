import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(121);  //12 121

        largestNumber(arr);

    }


    public static String largestNumber(final List<Integer> a) {

        String s="";

        List<String> arr = new ArrayList<>();
        for (Integer el : a){
            arr.add(""+el);
        }


        Collections.sort(arr, (x, y) -> x.compareTo(y));

        for (String val : arr){
            s+=val;
        }

        return s;


    }
    // abz
    // adaaa
}
