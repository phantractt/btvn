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
public class Less3 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int[] arr = new int[10];
////        int min = arr[0];
////        int max = arr[0];
////        for (int i = 0; i < arr.length; i++) {
////            arr[i]=sc.nextInt();
////            if (arr[i] < min) {
////                min = arr[i];
////            }
////            if (arr[i] > max) {
////                max = arr[i];
////            }
////        }
////        System.out.println(max);
////        System.out.println(min);
////        int[] arr = new int[10];
////        int dem = 0;
////        for (int i = 0; i < 10; i++) {
////            arr[i] = sc.nextInt();
////
////        }
////        System.out.println("nhap vao key");
////        int key = sc.nextInt();
////        for (int i = 0; i < 10; i++) {
////            if (arr[i] == key) {
////                dem++;
////            }
////        }
////
////        if (dem == 0) {
////            System.out.println("k thay");
////        }
////
////        System.out.println("dem " + dem);
//
////        Integer i = new Integer(7);
////        Long i2 = new Long(7);
////        char[] c = {'a', 'a'};
////        String s = new String("Viet");
////        System.out.println(s);
////        String v = "viet";
////        System.out.println(v.length());
////        char value = v.charAt(0);
////        System.out.println(value);
////        String value2 = v.substring(3);
////        System.out.println(value2);
////        boolean check=v.contains("vt");
////        System.out.println(check);
//        // viet 1 chuong trinh yeu cau nhap vao 1 chuoi ky tu roi neu chuooi 
//        String str = sc.nextLine();
//        System.out.println("chuoi nhap vao: " + str);
//        char[] kytu = {'!', '@', '#', '$', '%', '^', '&'};
////        boolean check = true;
////        for (int i = 0; i < sosanh.length(); i++) {
////            char temp = sosanh.charAt(i);
////            String doi = String.valueOf(temp);
////            if (str.contains(doi)) {
////                check = false;
////                break;
////            }
//
//        }
//        System.out.println(check);
//        boolean check = true;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; kytu.length; j++) {
//                if (str.charAt(i) == kytu[j]) {
//                    check = false;
//                    break;
//
//                }
//
//                {
//
//                }
//
//            }
//
//        }
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("nhap vao gia tri cua mang");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\r\n");

        }

    }

}
