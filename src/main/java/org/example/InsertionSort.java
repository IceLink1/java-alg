package org.example;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};

        System.out.println("before:");
        printArray(data);

        insertionSort(data);

        System.out.println("\nafter:");
        printArray(data);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}