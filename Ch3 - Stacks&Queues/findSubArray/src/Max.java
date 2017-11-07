public class Max {
    public static void foo(int count) {
        System.out.println("count = " + count);
        foo(++count);
    }

    public static void main(String[] args) {
        foo(0);
        System.out.println("a = ");
    }
}
