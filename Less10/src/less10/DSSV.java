/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less10;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DSSV {

    static Scanner sc = new Scanner(System.in);

    private static void themSinhvien() {
        System.out.println("=========== Them moi sinh vien =============");
        System.out.print("Nhap mssv: ");
        int mssv = sc.nextInt();

        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.println("Nhap diem toan: ");
        int toan = sc.nextInt();
        System.out.println("Nhap diem van: ");
        int van = sc.nextInt();
        System.out.println("Nhap diem anh: ");
        int anh = sc.nextInt();
        Sinhvien sv = new Sinhvien(ten, mssv, tuoi, toan, anh, van);
    }

    private static void suaSinhvien() {
    }

    private static void xoaSinhvien() {
    }

    private static void hienThiDiem() {
    }

    public void Ow

   public static void ArrayList<Sinhvien> luuvao() throws IOException {
        File f = new File("danhsach");
        f.mkdir();
        ArrayList<Sinhvien> sv = new ArrayList<Sinhvien>();
        File f2 = new File(f.getAbsolutePath() + "dssv.txt");
        f2.createNewFile();
         FileReader fr = new FileReader(f2);
        BufferedReader br = new BufferedReader(fr);
        
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("1.Hien thi diem");
            System.out.println("2.Them sinh vien");
            System.out.println("3.Sua sinh vien");
            System.out.println("4.Xoa sinh vien");

            int a = sc.nextInt();
            switch (a) {
                case 1:
                    hienThiDiem();
                    break;
                case 2:
                    themSinhvien();
                    break;
                case 3:
                    suaSinhvien();
                    break;
                case 4:
                    xoaSinhvien();
                    break;
            }
        }

    }
}
