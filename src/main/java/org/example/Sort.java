package org.example;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{0, 4, 9, 5, 7, 2, 3, 1, 8, 6};
        insertSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }

    }
    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    public  static void directSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i +1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public  static void insertSort (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
