/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnb3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class btvnb3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("  ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("  ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("  ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 5 == 1) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("  ");
        int tong = 0;
        for (int i = 0; i < 10; i++) {

            if (arr[i] % 2 == 0) {
                tong = tong + arr[i];
            }

        }
        System.out.println(tong);
    }

}
