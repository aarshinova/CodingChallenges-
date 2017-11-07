public class Test {

    public static void main(String[] args) {
        test1(new int[]{-1, -1, 2, 2}, 4);
    }

    public static void test1(int[] arr, int res){
        //given
        // arr

        // when
        int output = Main.solution(arr);

        //then
        if (res!=output)
        System.out.println("Result incorrect, should be " + res + " and not " + output);
        else
            System.out.println(
                    "The result is correct"
            );


    }
}
