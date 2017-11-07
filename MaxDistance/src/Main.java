import java.util.*;

public class Main {

    public int maximumGap(final List<Integer> a) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<a.size(); i++){
            int el = a.get(i);
            map.put(el, map.getOrDefault(el, 0) + i);
        }

        a.sort(Comparator.naturalOrder());

        for (int j=0; j<a.size()-1; j++){
            if ( map.get(a.get(j)) < map.get(a.get(j+1))){
                int  maxTemp = map.get(a.get(j)) - map.get(a.get(j+1));
                max = Math.max(max, maxTemp);
            }
        }
        return max;
    }


}
