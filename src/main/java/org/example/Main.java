package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
//        List<Integer> avalibaleDivider = findSimpleNumbers(100);
//        for (Integer integer: avalibaleDivider) {
//            System.out.print(integer + " ");
//        }
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println("Фибоначчи: "+ fib(10, counter) + "\n" + "Counter: " + counter);
    }

    //                                      Алгоритм поиска четных чисел
    public static List<Integer> findAvailableDivider (int number) { // Линейная зависимость (симметричный рост воличества шагов
                                                                    // относительно увеличения объема входных данных)
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) result.add(i);
        }
        return result;
    }


    //                                      Алгоритм поиска простых чисел
    public static List<Integer> findSimpleNumbers (int max) { // Квадратичная зависимость (резкий рост сложности
                                                              // относительно роста размера входных данных)
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) simple = false;
            }
            if(simple) result.add(i);

        }
        return  result;
    }

    //                                       Алгоритм поиска чисел Фибоначчи

    public static  int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) return 0;
        if (position == 2) return 1;
        return fib(position - 1, counter) + fib(position - 2, counter);

    }
}