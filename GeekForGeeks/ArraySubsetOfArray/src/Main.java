import java.util.Arrays;

/* Find if an array is a subset of array */
/*Examples:
        Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
        Output: arr2[] is a subset of arr1[]

        Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
        Output: arr2[] is a subset of arr1[]

        Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
        Output: arr2[] is not a subset of arr1[]*/
public class Main {
    // Solution (n*m) not additional space used
    public static boolean checkSubArray(int[] arr1, int[] arr2){
        int[] arr = new int[arr2.length];
        int j =0;

        for (int i=0; i<arr2.length; i++){
            for (j = 0; j<arr1.length; j++){  // O(n*m)
                if (arr1[j] == arr2[i]) {
                    break;
                }
            }
            if (j==arr1.length) return false;
        }

        return  true;
    }

    // Solution using sort and binary search (n*logn + m*logn)
    public static boolean checkSubArray2(int[] arr1, int[] arr2) {
        // sort array arr1
        sort(arr1, 0, arr1.length-1);

        for (int j=0; j<arr2.length; j++){
            if (!binarySearch(arr1, arr2[j], 0, arr1.length-1))
                return false;
        }

        return true;
    }

    // Solution using sorting and merging
    public static boolean checkSubArray3(int[] arr1, int[] arr2){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i=0, j=0;

            while (i<=(arr1.length-1) && j <=(arr2.length-1) ){
                if (arr1[i]<arr2[j]){
                    i++;
                }
                if (arr1[i]>arr2[j]){
                    return false;
                }
                if(arr1[i]==arr2[j]){
                    i++;
                    j++;
                }
            }

        return true;
    }

    public static boolean binarySearch(int[] arr, int val, int low, int high ){

        if (low<=high) {
            int mid = (low + high) / 2;

            if (arr[mid] > val)
                // search on the left side
               return binarySearch(arr, val, low, mid-1);
            if (arr[mid] < val)
                // search on the right side
               return binarySearch(arr, val, mid+1, high);

            if (arr[mid] == val)
                return true;
        }

        return false;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    //Quick sort implementation
    // low lowest index
    // high highest index
    public static void sort(int[] arr1, int low, int high){
        if (low< high){

            int pi = partition(arr1, low, high);

            sort(arr1, low, pi-1);
            sort(arr1, pi+1, high);
        }

    }


}
