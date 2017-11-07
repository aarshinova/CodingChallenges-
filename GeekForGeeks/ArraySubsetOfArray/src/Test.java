import com.sun.tools.javac.util.Assert;

public class Test {
    public static void main(String[] args) {
        // O(n*m)
        testCase1();
        testCase2();
        testCase3();
        // O(m*logm + n*logm)
        testCaseBinarySearch1();
        testCaseBinarySearch2();
        testCaseBinarySearch3();
        // O(n*logn + mlogm + m
        testCaseSortMerge1();
        testCaseSortMerge2();
        testCaseSortMerge3();
    }

    public static void testCaseSortMerge3() {
        //Given
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3, 100};
        // When
        boolean result = Main.checkSubArray3(arr1, arr2);

        //Then
        if (result) {
            System.out.print("The result of testCaseSortMerge3 is " + result);
            System.out.println(" but should be false ");
        } else
            System.out.println("The result of testCaseSortMerge3 is " + result);
    }

    public static void testCaseSortMerge2() {
        // Given
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4};

        // When
        boolean result = Main.checkSubArray3(arr1, arr2);

        //Then
        if (!result) {
            System.out.print("The result of testCaseSortMerge2 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCaseSortMerge2 is " + result);

    }


    public static void testCaseSortMerge1() {
        // Given
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        // When
        boolean result = Main.checkSubArray3(arr1, arr2);

        //Then

        if (!result) {
            System.out.print("The result of testCaseSortMerge1 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCaseSortMerge1 is " + result);
    }


    public static void testCaseBinarySearch3() {
        //Given
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3, 100};
        // When
        boolean result = Main.checkSubArray2(arr1, arr2);

        //Then
        if (result) {
            System.out.print("The result of testCaseBinarySearch3 is " + result);
            System.out.println(" but should be false ");
        } else
            System.out.println("The result of testCaseBinarySearch3 is " + result);
    }

    public static void testCaseBinarySearch2() {
        // Given
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4};

        // When
        boolean result = Main.checkSubArray2(arr1, arr2);

        //Then
        if (!result) {
            System.out.print("The result of testCaseBinarySearch2 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCaseBinarySearch2 is " + result);

    }


    public static void testCaseBinarySearch1() {
        // Given
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        // When
        boolean result = Main.checkSubArray2(arr1, arr2);

        //Then

        if (!result) {
            System.out.print("The result of testCaseBinarySearch1 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCaseBinarySearch1 is " + result);
    }

    public static void testCase1() {
        // Given
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        // When
        boolean result = Main.checkSubArray(arr1, arr2);

        //Then

        if (!result) {
            System.out.print("The result of testCase1 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCase1 is " + result);
    }

    public static void testCase2() {
        // Given
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4};

        // When
        boolean result = Main.checkSubArray(arr1, arr2);

        //Then
        if (!result) {
            System.out.print("The result of testCase2 is " + result);
            System.out.println(" but should be true ");
        } else
            System.out.println("The result of testCase2 is " + result);

    }

    public static void testCase3() {
        //Given
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3};
        // When
        boolean result = Main.checkSubArray(arr1, arr2);

        //Then
        if (result) {
            System.out.print("The result of testCase3 is " + result);
            System.out.println(" but should be false ");
        } else
            System.out.println("The result of testCase3 is " + result);
    }

    }
