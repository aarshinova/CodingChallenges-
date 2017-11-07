import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 17, 0, 45, 11, 16, 43, 15, 42, 2, 41, 0, 27, 37, 25, 17, 42, 24, 23, 11, 4, 29, 39, 6, 10, 42, 16, 17, 39, 1 };
        Integer[] dep = {25, 24, 52, 51, 26, 46, 25, 45, 9, 51, 49, 48, 51, 66, 65, 57, 69, 43, 50, 9, 32, 55, 10, 58, 62, 46, 19, 87, 12};
        List<Integer> arrive = Arrays.asList(arr);
        List<Integer> depart = Arrays.asList(dep);
        int K = 16;

        System.out.println("The result is : " + hotel(arrive,depart,K));
    }

    public static boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {

        HashMap<Integer, Integer> setIn = new HashMap();
        HashMap<Integer, Integer> setOut = new HashMap<>();

        int min = 0;
        int max = 0;

        for (Integer day : arrive){
            setIn.put(day, setIn.getOrDefault(day,0) + 1);
            if (day<min)
                min = day;
            if (day>max)
                max= day;
        }

        for (Integer day : depart){
            setOut.put(day, setOut.getOrDefault(day,0) + 1);
            if (day<min)
                min = day;
            if (day>max)
                max= day;
        }

        //int[] array = new int[max-min+1];

        for (int i=min;i<=max; i++){
           if (setIn.containsKey(i)){
               K= K - setIn.get(i);
           }
           if (setOut.containsKey(i)){
               K=K+setOut.get(i);
           }

           if (K<0)
               return false;

        }

        return true;
    }
}
