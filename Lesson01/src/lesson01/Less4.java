/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Less4 {

    public static boolean check(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;

            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    // viet 1 ham truyen vao 1 so dau ra la true neu so do la snt
    public static void main(String[] args) {
        int x = 31;
        System.out.println(check(x));
        //// in ra tat ca snt nho hon so do
        System.out.println("input");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        lietKe(input);
    }

    public static void lietKe(int input) {
        for (int i = 2; i <= input; i++) {
            boolean isSnt = checkSnt(i);
            if (isSnt) {
                System.out.print(i+"  ");

            }
        }
    }

    public static boolean checkSnt(int i) {
        int count = 0;
        boolean returnStatemnt;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            returnStatemnt = true;
        } else {
            returnStatemnt = false;
        }
        return returnStatemnt;
    }
}
