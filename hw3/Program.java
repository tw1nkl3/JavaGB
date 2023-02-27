package hw3;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = { 17, 5, 3, 20, 15, 18, 5, 8, 22, 37, 2, 21, 85 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            hp(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            hp(arr, i, 0);
        }
    }

    static void hp(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            hp(arr, n, largest);
        }
    }
}
