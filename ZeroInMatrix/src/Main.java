import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

       // a.set(0, )

    }

    public static Set<Integer> rows = new HashSet<>();
    public static Set<Integer> columns = new HashSet<>();

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        for (int i=0; i<a.size(); i++){
            if (rows.contains(i))
                continue;
            for (int j=0; j<a.get(i).size(); j++){
                if (columns.contains(j))
                    continue;
                if (a.get(i).get(j)==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (Integer r : rows){
            Main.convertRowToZero(a, r, 0);

        }
        for (Integer c : columns){
            Main.convertColumnToZero(a, 0, c);
        }



    }

    public static void convertColumnToZero(ArrayList<ArrayList<Integer>> arr, int i,int j){
        for (int k=0; k<arr.size(); k++){
            arr.get(k).set(j, 0);
        }
    }

    public static void convertRowToZero(ArrayList<ArrayList<Integer>> arr, int i, int j){
        //  if (i==0) return;
        for (int k=0; k<arr.get(i).size(); k++){
            arr.get(i).set(k, 0);
        }
    }

}
