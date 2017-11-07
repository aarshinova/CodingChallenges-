public class Test {

    public static void main(String[] args) {
        System.out.println("Testing Piggy Letters");

        testEmptyWord();
        testManyVowels(); // RaaaaaaaaAAA
        testSeveralConsonants(); // SCHTSCHUROWSKIA
        testCaseAllConsonants(); // qsdfgh
        testCase1(); //hello world
        testCase2(); // Hello world
        testCase3(); // Hello, world!!
        testCase4(); // eat apples
        testCase5(); // quick brown fox
        testCase6(); // Quick BrOwn FOX
        testCase7(); // ququa
        testCase8(); // QUQUbar
    }

    public static void testEmptyWord(){
        // Given
        String sentence="";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testEmptyWord", sentence, "");
    }

    public static void testManyVowels(){
        // Given
        String sentence="RaaaaaaaaAAA";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testVowels", sentence, "AaaaaaaaAAAray");
    }

    public static void testSeveralConsonants(){
        // Given
        String sentence="SCHTSCHUROWSKIA";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testSeveralConsonants", sentence, "UROWSKIASCHTSCHay");
    }

    public static void testCaseAllConsonants(){
        // Given
        String sentence="qsdfgh";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCaseAllConsonants", sentence, "qsdfgh");
    }

    public static void testCase1(){
        // Given
        String sentence="hello world";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase1", sentence, "ellohay orldway");
    }

    public static void testCase2(){
        // Given
        String sentence="Hello world";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase2", sentence, "Ellohay orldway");
    }

    public static void testCase3(){
        // Given
        String sentence="Hello, world!!";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase3", sentence, "Ellohay, orldway!!");
    }

    public static void testCase4(){
        // Given
        String sentence="eat apples";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase4", sentence, "eatay applesay");
    }

    public static void testCase5(){
        // Given
        String sentence="quick brown fox";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase5", sentence, "ickquay ownbray oxfay");
    }

    public static void testCase6(){
        // Given
        String sentence="QUick BrOwn FOX";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase6", sentence, "Ickquay Ownbray OXFay");
    }

    public static void testCase7(){
        // Given
        String sentence="ququa";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase7", sentence, "aququay");
    }

    public static void testCase8(){
        // Given
        String sentence="QUQUbar";
        //When
        sentence = Main.convertSentenceToPigLatin(sentence);
        //Then
        assertEqual("testCase8", sentence, "ArquQUbay");
    }

    private static void assertEqual(String methodName, String result, String expected) {
        System.out.print("==> " + methodName + " ");
        if (result.compareTo(expected)!=0) {
            System.out.println(String.format("NOK %s is supposed to be %s",result,expected));
        } else {
            System.out.println("OK");
        }
    }
}
