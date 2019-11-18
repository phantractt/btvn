package bt1;

import java.util.Scanner;

public class Bt1 {

    public static void main(String[] args) {
        int a = 111;
        int b = 567;
        int c = 777;
        int d = 666;
        int e = 555;
        int f = 62937;
        System.out.println("Mo phong phep nhan tay ");
        System.out.println("  " + a);
        System.out.println("x " + b);
        System.out.println("-------------");
        System.out.println("     " + c);
        System.out.println("    " + d);
        System.out.println("   " + e);
        System.out.println("-------------");
        System.out.println(f);
        Scanner sc = new Scanner(System.in);
        int g, h, i;
        System.out.println("Nhap vao 3 so nguyen duong");
        g = sc.nextInt();
        System.out.println("Nhap vao so thu nhat" + g);
        h = sc.nextInt();
        System.out.println("Nhap vao so thu hai" + h);
        i = sc.nextInt();
        System.out.println("Nhap vao so thu ba" + i);
        int aa = g + h + i;
        if (aa % 2 == 1) {
            System.out.println("False");

        } else {
            System.out.println("True");
        }
    }

}
