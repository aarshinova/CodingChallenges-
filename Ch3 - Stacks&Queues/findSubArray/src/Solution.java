import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

        char[] arr = s.toCharArray();
        NavigableMap<Character,Integer> map = new TreeMap<>();


        for (int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 1));
        }
        map.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()));

        int maxLength=0;
        int i=0;
        Character pkey=null;
        Integer pvalue=null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (i==0) continue;
            Character key = entry.getKey();
            Integer value = entry.getValue();

            int ll=0;
            if ((pvalue-value)==1){
                ll = determineLength(pkey, key, s);
            }
            else if ((pvalue-value)==0){
                if (s.indexOf(pvalue)<s.indexOf(value))
                    ll = determineLength(pkey, key, s);
                else
                    ll = determineLength(key, pkey, s);
            }
            if (ll>maxLength)
                maxLength=ll;
            pkey = key;
            pvalue = value;
            i++;
        }


        System.out.println(maxLength);

    }

    public static int determineLength(Character first, Character second, String test){
        if (test.length()<=1) return -1;
        if (first==second) return -1;
        int i=0;
        int length=1;

        while (i<test.length()){
            if (test.indexOf(first, i)>test.indexOf(second, i)){
                length++;
                if (i+1<test.length())
                    i=test.indexOf(first, i+1);
                else
                    i=test.indexOf(first, i);
            }else{
                return -1;
            }
        }
        // cicic


        return length;
    }
}
