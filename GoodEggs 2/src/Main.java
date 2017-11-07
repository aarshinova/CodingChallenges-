public class Main {
    // Convert sentence ou word to pig latin letters
    // As a user I can enter a phrase "hello" and see it translated to Pig Latin "ellohay"
    // 2. As a user I can enter a phrase "hello world" and see it translated to Pig Latin "ellohay orldway"
    // 3. As a user I can enter a phrase "Hello world" and see it translated to Pig Latin "Ellohay orldway"
    // 4. As a user I can enter a phrase "Hello, world!!" and see it translated to "Ellohay, orldway!!"
    // 5. As a user I can enter a phrase "eat apples" and see it translated to Pig Latin "eatay applesay"
    // 6. As a user I can enter a phrase "quick brown fox" and see it translated to Pig Latin "ickquay ownbray oxfay"
    //philippe@goodeggs.com
    public static String convertSentenceToPigLatin(String sentence) {
       if (sentence==null || sentence.length()==0)
            return "";

        String[] words = sentence.split(" ");
        String newSentence ="";

        for (int i=0; i<words.length; i++) {
            String word = words[i];
            if (i!=(words.length-1))
                newSentence += convertToPigLatin(word) + " ";
            else
                newSentence += convertToPigLatin(word);
        }

        return newSentence;
    }

    // Input : word
    // Output: piggy word
    private static String convertToPigLatin(String word){
        String vowels="aeuioAEUOI";
        String punctuationSigns = ",;!?:";
        int vowelInd = 0; // index of vowels
        int punctuationInd = 0; // index of punctuation
        char firstLetter=' ';
        String lastLetters = "";

        char[] array = word.toCharArray();

        // if not we should find first vowel in the word
        for (int ind=0; ind<array.length; ind++){
            char letter = array[ind];
            if (ind!=0 && Character.toLowerCase(letter)=='u' && Character.toLowerCase(array[ind-1])=='q') {
                continue;
            }
            if (vowels.contains("" + letter)) {
                vowelInd = ind;
                lastLetters += "ay";
                break;
            }
        }

        // Check if first letter is capital
        if (Character.isUpperCase(word.charAt(0)) && !word.equals(word.toUpperCase())){
            firstLetter = Character.toUpperCase(word.charAt(vowelInd));
            if (word.substring(0,2).toLowerCase().equals("qu"))
                word = word.substring(0, 2).toLowerCase() + word.substring(2, word.length());
            else
                word = word.substring(0, 1).toLowerCase() + word.substring(1, word.length());
        }else
        {
            firstLetter = word.charAt(vowelInd);
        }

        // Check if there is punctuation in the end of the word
        for (int ind=0; ind<array.length; ind++){
            char letter = array[ind];
            if (punctuationSigns.contains("" + letter)) {
                punctuationInd = ind;
                String punctuation = word.substring(punctuationInd, word.length());
                word = word.replace(punctuation,"");
                lastLetters+=punctuation;
                break;
            }
        }

        // Final result
        word = firstLetter + word.substring(vowelInd+1, word.length()) + word.substring(0, vowelInd) + lastLetters;
        return word;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Enter some word or sentence...");
        }
        String result = convertSentenceToPigLatin(String.join(" ",args));
        System.out.println("result = " + result);
    }
}
