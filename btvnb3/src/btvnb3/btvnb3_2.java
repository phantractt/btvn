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
public class btvnb3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println("nhap vao do dai cua mang: " + d);
        int[] arr = new int[d];
        for (int i = 0; i < d; i++) {
            while (true) {

                arr[i] = sc.nextInt();
                if (arr[i] <= 0) {
                    System.out.println("nhap sai");
                } else {
                    break;
                }

            }
        }
        for (int i = 0; i < d; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -1;
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < d; i++) {
            if (max < arr[i]) {
                max = arr[i];
           }
/////////////
        }
        System.out.println("phan tu lon nhat: " + max);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < d; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }
        }
        for (int i = 0; i < d; i++) {
            if (min == arr[i]) {
                arr[i] = -1;
            }
///                
        }
        System.out.println(min);
        int x = sc.nextInt();
        System.out.println("nhap x: " + x);
        for (int i = 0; i < d; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + "  ");
            }

        }
        //////////////////////////
        int x1 = sc.nextInt();
        System.out.println("nhap x1: " + x1);
        
        int check = 0;
        for (int i = 0; i < d; i++) {
            if (arr[i] == arr[d - i - 1]) {
                check = 1;
                break;
            }

        }
        if (check == 1) {
            System.out.println(" k doi xung ");
        } else {
            System.out.println(" doi xung ");
        }
    }

}
