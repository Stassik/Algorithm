package org.example;

import java.util.Random;
import java.util.Scanner;

/**Реализовать сортировку подсчетом
 Она заключается в подсчете количества вхождений элементов в массив и восстановление по этой информации.
 [1, 3, 1, 5, 7, 7, 3, 2, 5, 7]
 1 -> 2
 2 -> 1
 3 -> 2
 5 -> 2
 7 -> 3
 [1, 1, 2, 3, 3, 5, 5, 7, 7, 7]*/
public class SortCount {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите длинну неотсортированного массива: ");
        int lengthArray = iScanner.nextInt();
        System.out.println("Введите максимальное число диапазона рандомных чисел: ");
        int bound = iScanner.nextInt();
        int[] array = new int[lengthArray];
        int[] sortArray;
        for (int i = 0; i < lengthArray; i++) {
            array[i] = new Random().nextInt(bound+1);
        }

        for (int j: array) {
            System.out.print(j + " ");
        }
        System.out.println();
        sortArray = sort(array, bound);
        for (int k: sortArray) {
            System.out.print(k + " ");
        }
    }

    static public int[] sort (int[] array, int bound) {
        int[] helpArray = new int[bound+1];
        int[] sortArray = new int[array.length];
        for (int num: array) {
            helpArray[num]++;
        }
        int k = 0;
        for (int i = 0; i< helpArray.length; i++) {
            for (int j = 0; j < helpArray[i]; j++) {

                sortArray[k++] = i;
            }

        }
        return sortArray;
    }
}
