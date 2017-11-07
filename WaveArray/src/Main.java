import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr = Arrays.asList(6, 13, 15, 17);
        wave(arr);
    }

    public static ArrayList<Integer> wave(List<Integer> a) {
        a.sort(Comparator.naturalOrder());
        
        Integer[] arr = new Integer[a.size()];

        for (int i=0; i<a.size(); i+=2){
            if ((i+1)<a.size()){
                arr[i] = a.get(i+1);
            }
        }

        for (int i=1; i<a.size(); i+=2){
                arr[i] = a.get(i-1);
        }

        if (a.size()%2>0)
        arr[a.size()-1] = a.get(a.size()-1);

        ArrayList<Integer> res = new ArrayList<>();

        for (Integer el : arr){
            res.add(el);
        }

        return res;
    }
}
