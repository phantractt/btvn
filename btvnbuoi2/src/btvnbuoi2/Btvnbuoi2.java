package btvnbuoi2;

import java.util.Random;
import java.util.Scanner;

public class Btvnbuoi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int sln, snn;
        sln = a;
        if (sln < b) {
            sln = b;
        } else if (sln < c) {
            sln = c;
        } else if (sln < d) {
            sln = d;
        } else if (sln < e) {
            sln = e;
        } else {
            sln = a;
        }
        System.out.println("so lon nhat:" + sln);
        snn = a;
        if (b < snn) {
            snn = b;
        } else if (c < snn) {
            snn = c;
        } else if (d < snn) {
            snn = d;
        } else if (e < snn) {
            snn = e;
        } else {
            snn = a;
        }
        System.out.println("so nho nhat" + snn);
        // bai kho
        int doan;
        doan = sc.nextInt();
        Random rd = new Random();
        int so = rd.nextInt();
        if (doan > so) {
            System.out.println("Qua cao, thu lai");
        } else if (doan < so) {
            System.out.println("Qua thap, thu lai");
        } else {
            doan = so;
            System.out.println("Chuc mung ban da doan dung");
        }
    }

}
