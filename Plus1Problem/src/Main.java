import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        ArrayList<Integer> newArr = new ArrayList<>();

        int temp = 1;
        int newVal;
        for (int i=a.size()-1; i>=0; i--){
            int el = a.get(i);
            if (temp>0){
                el = el + temp;
                if (el>=10){
                    newVal = el%10;
                    temp = el/10;
                }else{
                    newVal = el;
                    temp = 0;
                }
            }else{
                newVal = a.get(i);
            }

            a.set(i, newVal);
        }

        if (temp>0){
            newArr.add(temp);
        }

        for (int elem  : a){
            if (elem==0 && newArr.size()==0){
                continue;
            }
            newArr.add(elem);
        }

        return  newArr;
    }
    }


