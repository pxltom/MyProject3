package ru.geekbrains.Artjom_Islyamov;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        minAndMax();
        System.out.println(Arrays.toString(getBackMassive(5, 3)));
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
        }
        System.out.println(Arrays.toString(a));
        int[] c = new int[100];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
            System.out.println("b [" + i + "] = " + c[i]);
        }
        int[] d = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < d.length; i++) {
            if (d[i] < 6) {
                d[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(d));
        int[][] e = new int[3][3];
        for (int i = 0; i < e.length; i++) {
            for (int j = 0, x = e[i].length; j < e[i].length; j++, x--) {
                if (i == j || i == x - 1) e[i][j] = 1;
                System.out.print(e[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[] getBackMassive(int len, int initialValue) {
        int[] getBack = new int[len];
        Arrays.fill(getBack, initialValue);
//        for (int i = 0; i < getBack.length; i++) {
//            getBack[i] = initialValue;
//        }
        return getBack;
    }

    public static void minAndMax() {

        int[] numbers = {3, 8, 500, -95, 495, -888, 400, 9};
        int min;
        int max;
        min = max = numbers[0];

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.println("min: " + min + "\nmax: " + max);


    }}













