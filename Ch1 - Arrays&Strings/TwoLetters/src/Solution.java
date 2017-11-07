import com.sun.deploy.util.OrderedHashSet;

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        System.out.println("a" + 128%122);

        int[] index = new int[size];

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<arr.length; i++, len++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(
                set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // 9 9 8 8 8 8 7 7
        int maxLength=0;
        Character nextKey=null;
        Integer nextValue=null;
        for (int i=0; i<list.size(); i++) {
            Map.Entry<Character, Integer> entry = list.get(i);
            Character key = entry.getKey();
            Integer value = entry.getValue();
            for (int j=(i+1); j<list.size(); j++) {
                Map.Entry<Character, Integer> internalEntry = list.get(j);
                nextKey = internalEntry.getKey();
                nextValue = internalEntry.getValue();

                int ll = 0;
                if ((value - nextValue) == 1) {
                    ll = determineLength(key, nextKey, s);
                } else if ((value - nextValue) == 0) {
                    if (s.indexOf(key) < s.indexOf(nextKey))
                        ll = determineLength(key, nextKey, s);
                    else
                        ll = determineLength(nextKey, key, s);
                }else if ((value - nextValue)>1){
                    break;
                }

                if (ll > maxLength)
                    maxLength = ll;
            }
        }
        System.out.println(maxLength);
    }

    public static int determineLength(Character first, Character second, String test){
        if (test.length()<=1) return -1;
        if (first==second) return -1;
        int length=0;
        boolean firstMeet = false;

        //beabeefeab
        for (int i=0; i<test.length(); i++){
            if (test.charAt(i)==first && !firstMeet){
                length++;
                firstMeet = true;
            }
            else if (test.charAt(i)==second && firstMeet){
                length++;
                firstMeet=false;
            }else if (test.charAt(i)==second && !firstMeet){
                return -1;
            }
            else if (test.charAt(i)==first && firstMeet){
                return -1;
            }
        }
        return length;
    }
}
