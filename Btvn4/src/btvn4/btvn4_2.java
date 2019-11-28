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
public class btvn4_2 {

    public static void main(String[] args) {
        int[] arr = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        Chia(arr);
        System.out.println("tich 2 so chia het cho 3 va 5: " + Chia(arr));

    }

    private static boolean Chia(int[] arr) {
        int sum = 0;
        boolean returnStatement;
        sum = arr[0] * arr[1];

        if (sum % 3 == 0) {
            if (sum % 5 == 0) {
                returnStatement = true;
            } else {
                returnStatement = false;
            }
        } else {
            returnStatement = false;
        }
        return returnStatement;
    }

}
