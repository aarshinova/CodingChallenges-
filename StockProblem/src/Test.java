public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    private static void test1() {
        // given
        int[] prices = {1, 3, 7, 2, 8, 16, 21}; // 7 days

        //when
        Stock stock = Main.solution(prices);

        //then
        System.out.println("$$$ test 1");
       for (int val :stock.priceMin
               ){
           System.out.println("buy " + val);
       }
        for (int val :stock.priceMax
                ){
            System.out.println("sell " + val);
        }
    }

    private static void test2() {
        // given
        int[] prices =  {100, 180, 260, 310, 40, 535, 695}; // 5 days

        //when
        Stock stock = Main.solution(prices);

        //then
        System.out.println("$$$ test 2");
        for (int val :stock.priceMin
                ){
            System.out.println("buy " + val);
        }
        for (int val :stock.priceMax
                ){
            System.out.println("sell " + val);
        }
    }

    private static void test3() {
        // given
        int[] prices =  {695, 300, 3, 2, 1}; // 5 days

        //when
        Stock stock = Main.solution(prices);

        //then
        System.out.println("$$$ test 3 ");
        for (int val :stock.priceMin
                ){
            System.out.println("buy " + val);
        }
        for (int val :stock.priceMax
                ){
            System.out.println("sell " + val);
        }
    }

    private static void test4() {
        // given
        int[] prices =  {695, 300, 3, 2, 500, 8}; // 5 days

        //when
        Stock stock = Main.solution(prices);

        //then
        System.out.println("$$$ test 4");
        for (int val :stock.priceMin
                ){
            System.out.println("buy " + val);
        }
        for (int val :stock.priceMax
                ){
            System.out.println("sell " + val);
        }
    }

    private static void test5(){
        // given
        int[] prices =  {10, 22, 5, 75, 65, 80}; // 5 days

        //when
        Stock stock = Main.solution(prices);

        //then
        System.out.println("$$$ test 5");
        for (int val :stock.priceMin
                ){
            System.out.println("buy " + val);
        }
        for (int val :stock.priceMax
                ){
            System.out.println("sell " + val);
        }
    }


}
