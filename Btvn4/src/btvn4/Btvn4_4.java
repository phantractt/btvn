/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Btvn4_4 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        if (Giam(arr) == 1) {
            System.out.println("-1");
        } else {
            if (Tang(arr) == 1) {
                System.out.println("1");
            } else {
                if (Chuasx(arr) == 1) {
                    System.out.println("0");
                }
            }
        }

    }

    public static int Tang(int[] arr) {
        int count = 0;
        for (int i = 0; i < 9; i++) {

            if (arr[i] > arr[i + 1]) {
                count++;
            }

        }
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int Giam(int[] arr) {
        int count = 0;
        for (int i = 0; i < 9; i++) {

            if (arr[i] < arr[i + 1]) {
                count++;
            }

        }
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int Chuasx(int[] arr) {
        if (Tang(arr) == 0) {
            if (Giam(arr) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

}
