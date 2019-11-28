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
public class Btvn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        check(a);
        System.out.println("mang doi xung" + check(a));
    }

    public static boolean check(int[] a) {
        boolean statement = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[a.length - i - 1]) {
                statement = true;
                break;
            }

        }

        return statement;
    }
}
