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
public class Btvnb3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int[][] arr = new int[a][b];
        int[][] arr1 = new int[c][d];

        for (int i = 0; i < a; i++) {
            System.out.println("hang ma tran 1: " + i);

            for (int o = 0; o < b; o++) {

                System.out.println("cot ma tran 1: " + o);
                arr[i][o] = sc.nextInt();
            }

        }
        for (int j = 0; j < c; j++) {
            System.out.println("hang ma tran 2: " + j);
            for (int k = 0; k < d; k++) {
                System.out.println("cot ma tran 2: " + k);
                arr1[j][k] = sc.nextInt();

            }

        }
        if (a == c) {
            if (b == d) {

                for (int e = 0; e < a; e++) {

                    for (int f = 0; f < b; f++) {

                        arr[e][f] = arr[e][f] + arr1[e][f];
                        System.out.println(arr[e][f] + " ");

                    }
                    System.out.println("\r\n ");

                }
            } else {
                System.out.println("khong cong duoc");
            }
        } else {
            System.out.println("khong cong duoc");
        }

    }

}
