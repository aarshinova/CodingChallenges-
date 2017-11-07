import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(121);  //12 121

        // ae
        largestNumber(arr);

    }

    public static String largestNumber(final List<Integer> a) {

        String s="";

        List<String> arr = new ArrayList<>();
        for (Integer el : a){
            arr.add(""+el);
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String xy = o1 + o2;
                String yx = o2 + o1;
                return yx.compareTo(xy);
            }
        });

        for (String val : arr){
            s+=val;
        }

        return s;
    }

}
