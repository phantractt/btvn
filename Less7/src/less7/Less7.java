/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Less7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo(4, 5);
        p.hienThi();
        p.getTu();
        p.cong(new PhanSo(5, 4));
        PhanSo[] phansoArray = new PhanSo[10];
        PhanSo sum = new PhanSo(0, 01);
        // cho nguoi dung nhập vào phân số ltuc cho đến khi nhập vào -1 và in ra phân số tổng 
        while (true) {
            System.out.println("nhap phan so :");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("-1")) {
                break;
            }
            String[] value = new String[2];
            value[0] = "";
            value[1] = "";
            int temp = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '/') {
                    temp++;
                    continue;

                }
                value[temp] += input.charAt(i);
            }
            int tu = Integer.parseInt(value[0]);
            int mau = Integer.parseInt(value[1]);
            PhanSo p3 = new PhanSo(tu, mau);
            sum.cong(p3);
            sum.rutgon(p3);

        }

        sum.hienThi();
    }

}
