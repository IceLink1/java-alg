package org.example;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("before:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        bubbleSort(data);

        System.out.println("\n after:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}