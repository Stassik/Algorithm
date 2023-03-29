package org.example;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int value = 10;
        int index = binarySearch(array, value, 0, array.length - 1);
        System.out.print("Число " + value + " под индексом "+ index);
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min)/2 + min;
        }

        if (array[midPoint] < value ) {
            return binarySearch(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return  binarySearch(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }

    }
}
