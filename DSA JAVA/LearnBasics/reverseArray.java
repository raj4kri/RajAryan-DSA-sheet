public class reverseArray {

    static void ra(int arr[], int s, int e) {

        int temp;
        while (s < e) {

            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }
    }

    static void printArr(int arr[], int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }
        System.err.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArr(arr, 10);
        ra(arr, 0, 9);
        printArr(arr, 10);

    }

}