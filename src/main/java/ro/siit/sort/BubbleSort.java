package ro.siit.sort;

public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
//        for (int element : arr )
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    System.out.println(j + " - " + temp  + " - " + arr[j + 1]);
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {12, 64, 34, 25, 12, 22, 11, 55};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    // https://www.geeksforgeeks.org/bubble-sort/
    // https://www.geeksforgeeks.org/quick-sort/
    // https://www.geeksforgeeks.org/merge-sort/
    // https://www.geeksforgeeks.org/selection-sort/
    // https://www.geeksforgeeks.org/sorting-algorithms/
}
