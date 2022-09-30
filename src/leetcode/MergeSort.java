package leetcode;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] a, int p, int r) {

        if (p < r) {
            int q = (r + p) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    public static void merge(int[] a, int p, int q, int r) {

        int[] L = new int[q - p + 1];
        int[] R = new int[r - q];

        for (int i = 0; i <= q - p; i++) {
            L[i] = a[i + p];
        }
        for (int i = 0; i < r - q; i++) {
            R[i] = a[i + q + 1];
        }
        int i = 0;
        int j = 0;
        int k = p;
        while (i < q - p + 1 && j < r - q) {
            if (L[i] <= R[j]) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }
        while (i < q - p + 1) {
            a[k++] = L[i++];
        }
        while (j < r - q) {
            a[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 6, 1, 3, 2, 6};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
