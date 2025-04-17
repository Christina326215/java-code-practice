package com.sunnyhsu.practice;

public class Pyramid {

    public static void main(String[] args) {
        printStars(5);
        printStarsTwice(5);
        printStarsTwice2(5,2);
        printPyramid2(5);
        printPyramid(5);
    }

    // -----------------------------------------------------------------------------
    // *
    // **
    // ***
    // ****
    // *****
    public static void printStars(int s) {
        if (s < 1) {
            System.out.println("必須要大於0");
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");
    }

    // -----------------------------------------------------------------------------
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    public static void printStarsTwice(int t) {
        if (t < 1) {
            System.out.println("必須要大於0");
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k < t; k++) {
            for (int m = (t-k); m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");
    }

    // -----------------------------------------------------------------------------
    // printStarsTwice2(int t, int n) => t: 幾層、n:倍數
    // *
    // ***
    // *****
    // *******
    // *********
    // *******
    // *****
    // ***
    // *
    public static void printStarsTwice2(int t, int n) {
        if (t < 1 || n < 1) {
            System.out.println("必須要大於0");
        }
        for (int i = 1; i <= t; i++) {
            int w = n * i - 1;
            for (int j = 1; j <= w; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int k = 1; k < t; k++) {
            int r = n * (t - k) - 1;
            for (int m = r; m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");
    }


    // -----------------------------------------------------------------------------
    // 偶數金字塔
    //     **
    //    ****
    //   ******
    //  ********
    // **********
    public static void printPyramid2(int n) {
        if (n < 1) {
            System.out.println("必須要大於0");
        }
        for(int i = 1; i <= n ; i++) {
            int x =  i;
            for(int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= (2 * x - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");
    }

    // -----------------------------------------------------------------------------
    //奇數金字塔
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
    public static void printPyramid (int n){
        if (n < 1) {
            System.out.println("必須要大於0");
        }

        for (int i = 1; i <= n; i ++){
            for (int j = n; j > i; j --){
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");
    }
}
