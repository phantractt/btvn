package lesson01;

import java.util.Scanner;

public class Lesson01 {

    public static void main(String[] args) {
//        System.out.print("Hello world ");
//        System.out.println("5");
//        //variable : int, long, double, float, boolean, char, String
//        // Datatype name = values;
//        int x = 5;
//        float z = 3.5f;
//        boolean bol = false;
//        char c = '#';
//        System.out.println("z");
//        // operator: + - * / % = ;
//        int p = 6;
//        int tong = x + p;
//        System.out.println("tong");
//        System.out.println(tong);
//
//        int a = 10;
//        int b = 5;
//        int d = a + b;
//        System.out.println("Tong:" + d);
//        int f = a - b;
//        System.out.println("Hieu:" + f);
//
//        // IDE intergrated development enviroment
//        // == > < >= <=  && 
//        if (1 == 1) {
//            System.out.println("dung");
//        } else {
//            System.out.println("sai");
//        }
//        int xx = 3;
//        if (xx % 2 == 1) {
//            System.out.println("dung");
//        } else {
//            System.out.println("sai");
//
//        }
//        // ax+ b = 0       
//        int n;
//        int m;
//        if (x == -m / n) {
//            System.out.println("co nghiem");
//        } else {
//            System.out.println("vo nghiem");
//        float a = 5;
//        float b = 12;
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phuong trinh vo so nghiem");
//            } else {
//                System.out.println("phuong trinh vo nghiem");
//            }
//
//        } else {
//            float x;
//            x = -b / a;
//            System.out.println("Nghiem:" + x);
//        }
//        System.out.println("---Scanner---");
//        Scanner sc = new Scanner(System.in);
//        int number;
//        System.out.println("Nhap vao gia tri cua a");
//        number = sc.nextInt();
//        System.out.println("Gia tri cua a la :" + number);
//        // giai phuong trinh bac 2 
//        double can = Math.sqrt(b);
//        double luythua = Math.pow(2, 3);
        Scanner gt = new Scanner(System.in);
        double aa, bb, cc;
        System.out.println("Nhap vao gia tri cua aa bb cc");
        aa = gt.nextDouble();
        System.out.println("Gia tri cua aa la:" + aa);
        bb = gt.nextDouble();
        System.out.println("Gia tri cua bb la:" + bb);
        cc = gt.nextDouble();
        System.out.println("Gia tri cua cc la:" + cc);
        if (aa != 0) {
            double dd = bb * bb - 4 * aa * cc;
            if (dd == 0) {
                double x1 = -bb / 2 * aa;
                System.out.println("Nghiem cua phuong trinh:" + x1);

            } else {
                if (dd <= 00) {
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    double canbac2 = Math.sqrt(bb * bb - 4 * aa * cc);
                    double x2 = (-bb + canbac2) / 2 * aa;
                    double x3 = (-bb - canbac2) / 2 * aa;
                    System.out.println("Nghiem 1 cua phuong trinh:" + x2);
                    System.out.println("Nghiem 2 cua phuong trinh:" + x3);
                }

            }
        } else {
            if (bb == 0) {
                if (cc == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x4 = -bb / aa;
                System.out.println("Phuong trinh co nghiem:" + x4);
            }

        }
    }

}
