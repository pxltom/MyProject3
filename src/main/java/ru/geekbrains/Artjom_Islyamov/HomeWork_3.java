package ru.geekbrains.Artjom_Islyamov;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int b = a.length;
        for (int i = 0; i < b; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
        }
        System.out.println(Arrays.toString(a));

        int [] c = new int[100];
        for (int i = 0; i < 100 ; i++) {
            c [i]= i + 1;
            System.out.println("b [" + i + "] = " + c[i]);
//
//
//        }
    }
}}
