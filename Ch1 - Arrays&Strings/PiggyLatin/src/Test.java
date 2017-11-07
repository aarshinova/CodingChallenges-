public class Test {
    // To test if it is piggy latin word
    public static void testOnlyVowels(){
        // Given
        String word = "aaaaa";

        // When
        String result = Main.convertToPiggyLatin(word);

        // Output
        assertEqual("testOnlyVowels", result,"aaaaaY");
    }

    public static void testEmptyString(){
        // Given
        String word = "";

        // When
        String result = Main.convertToPiggyLatin(word);

        // Output
        assertEqual("testEmptyString", result,"");
    }

    private static void assertEqual(String methodName,String result,String expected) {
        System.out.print("==> " + methodName + " ");
        if (!result.equals(expected)) {
            System.out.println(String.format("NOK %s is supposed to be %s",result,expected));
        } else {
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        testOnlyVowels();
        testEmptyString();
    }
}
