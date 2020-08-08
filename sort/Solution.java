package com.rhb.sort;

public class Solution {

    //冒泡
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    //交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    //插入
    public void insertSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    //选择
    public void selectSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            int j;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
        }
    }

    //归并
    public void mergeSort(int[] a, int n) {
        if (n <= 1) return;

        int[] result = new int[n];
        merge_sort_recursive(a, result, 0, n - 1);
    }

    private void merge_sort_recursive(int[] a, int[] result, int start, int end) {
        if (start >= end) return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(a, result, start1, end1);
        merge_sort_recursive(a, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = a[start1] < a[start2] ? a[start1++] : a[start2++];
        }
        while (start1 <= end1) {
            result[k++] = a[start1++];
        }
        while (start2 <= end2) {
            result[k++] = a[start2++];
        }
        for (k = start; k <= end; k++) {
            a[k] = result[k];
        }
    }

    //快排
    public void quick_sort(int[] a, int n) {
        if (n <= 0) return;
        quick_sort_c(a, 0, n - 1);
    }

    private void quick_sort_c(int[] a, int p, int r) {
        if (p >= r) return;

        int q = partition(a, p, r);
        quick_sort_c(a, p, q - 1);
        quick_sort_c(a, q + 1, r);
    }

    private int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j <= r - 1; j++) {
            if (a[j] < pivot) {
                swap(a[i], a[j]);
                i = i + 1;
            }
        }
        swap(a[i], a[r]);
        return i;
    }

    private void swap(int i, int i1) {
        int tmp = i;
        i = i1;
        i1 = tmp;
    }
}
