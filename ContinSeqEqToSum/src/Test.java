public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
    }
    //     [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
    //     [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
    //     [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7
    public static void test1(){
        // given
        int[] arr = {23, 5, 4, 7, 2, 11};
        int total = 20;

        // then
        boolean res = Main.solution(arr, total);

        //wehn
        if (!res)
            System.out.println("Test1 error");
        else
            System.out.println("Test1 Ok");
    }

    public static void test2(){
        // given
        int[] arr = {1, 3, 5, 23, 2};
        int total = 8;

        // then
        boolean res = Main.solution(arr, total);

        //wehn
        if (!res)
            System.out.println("Test2 error");
        else
            System.out.println("Test2 Ok");

    }

    public static void test3(){
        // given
        int[] arr = {1, 3, 5, 23, 2};
        int total = 7;

        // then
        boolean res = Main.solution(arr, total);

        //wehn
        if (!res)
            System.out.println("Test3 Ok");
        else
            System.out.println("Test3 error");

    }

    public static void test4(){
        // given
        int[] arr = {1, 2, 3, 4, 20, 21, 5, 9, 6};
        int total = 20;

        // then
        boolean res = Main.solution(arr, total);

        //wehn
        if (res)
            System.out.println("Test4 Ok");
        else
            System.out.println("Test4 error");

    }

    public static void test5(){
        // given
        int[] arr = {1, 4, 20, 3, 10, 5};
        int total = 33;

        // then
        boolean res = Main.solution(arr, total);

        //wehn
        if (res)
            System.out.println("Test5 Ok");
        else
            System.out.println("Test5 error");

    }

    public static void test6(){
        // given
        int[] arr = {1, 4, 20, 3, 10, 5};
        int total = 33;

        // then
        boolean res = Main.solutionSubArray(arr, total);

        //wehn
        if (res)
            System.out.println("Test6 Ok");
        else
            System.out.println("Test6 error");

    }

    public static void test7(){
        // given
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        int total = 7;

        // then
        boolean res = Main.solutionSubArray(arr, total);

        //wehn
        if (res)
            System.out.println("Test7 Ok");
        else
            System.out.println("Test7 error");

    }

    public static void test8(){
        // given
        int[] arr = {1, 4};
        int total = 0;

        // then
        boolean res = Main.solutionSubArray(arr, total);

        //wehn
        if (!res)
            System.out.println("Test8 Ok");
        else
            System.out.println("Test8 error");

    }


    public static void test9(){
        // given
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int total = 23;

        // then
        boolean res = Main.solutionSubArray(arr, total);

        //wehn
        if (res)
            System.out.println("Test9 Ok");
        else
            System.out.println("Test9 error");

    }


}
