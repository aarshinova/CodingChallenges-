public class Main {

    public static void main(String[] args) {
        // if (args.length==0) return;
        // String sentence = args[0];
        String sentence = "Anna goes shopping with friends this easter";

        if (sentence.length()==0) return;

        String[] words = sentence.split(" ");
        String newString="";
        for (String w : words)
            newString += convertToPiggyLatin(w)+" ";
        System.out.println("Output is " + newString);
    }

    public static String convertToPiggyLatin(String word){
        int count=0;
        String vowels = "aeoiuAEOIU";
        Boolean firstLetterDone = false;
        while (count<word.length()){
            char ch = word.charAt(count);
            if (vowels.contains(""+ch)){
                word = word + "AY";
                break;
            }else if (count == 0 && !firstLetterDone){
                word = word.substring(1, word.length()) + ch;
                firstLetterDone = true;
                count = -1;
            }
            count++;
        }

        return  word;
    }
}
