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
public class Lessons2 {

    public static void main(String[] args) {
//        int i = 1;
////        while (i < 10) {
////            System.out.print("i");
////            i = i + 1;
//
//        do {
//            System.out.println("i");
//        } while (i < 2);
//        nhap vao 1 so in ra tat ca so chan nho hon so do
//        int i;
//        for (i = 0; i < 20; i = i + 2) {
//            System.out.print(" " + i);
//        }
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 0;
        int tang = 0;
//        
//nhap 1 so neu la snt in ra true con lai in ra false
        System.out.println("Day la i: " + i);
        int f;
        for (f = 1; f <= i; f++) {
            if (i % f == 0) {
                tang++;
            }
            
            for (int j = 1; j < f; j++) {
                if (f % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(f);
            }

        }

    }
}

// nhap vao 1 so in ra tat ca snt nho hon 

