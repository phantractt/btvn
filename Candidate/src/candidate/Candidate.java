/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Candidate {
          Scanner sc = new Scanner(System.in);
    int MSSV, Toan, Van, Anh;
    String ten, birth;
     public Candidate() {
        this.ten = "chua co";
        this.MSSV = 00000000;
        this.Anh = 0;
        this.Toan = 0;
        this.Van = 0;
        this.birth = "00/00/0000";
    }
 public Candidate(int MSSV, int Toan, int Van, int Anh, String ten, String birth) {
        this.MSSV = MSSV;
        this.Toan = Toan;
        this.Van = Van;
        this.Anh = Anh;
        this.ten = ten;
        this.birth = birth;
    }
  public void nhapCa() {
        System.out.println("nhap ten: ");
        this.ten = sc.nextLine();
        System.out.println("nhap mssv: ");
        this.MSSV = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        this.birth = sc.nextLine();
        System.out.println("diem toan: ");
        this.Toan = sc.nextInt();
        sc.nextLine();
        System.out.println("diem van: ");
        this.Van = sc.nextInt();
        sc.nextLine();
        System.out.println("diem anh: ");
        this.Anh = sc.nextInt();
        sc.nextLine();
    }

   public boolean check() {
        boolean check = false;
        if (this.Toan + this.Van + this.Anh >= 15) {
            check = true;
        }
        return check;
    }

    void CaTren15d() {
        if (check()) {
            System.out.print("Ten: " + this.ten + ". ");
            System.out.print("MSSV: " + this.MSSV + ". ");
            System.out.print("Ngay sinh: " + this.birth + ". ");
            System.out.print("Diem toan: " + this.Toan + ". ");
            System.out.print("Diem van: " + this.Van + ". ");
            System.out.print("Diem anh: " + this.Anh + ". ");

        }
    } public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public int getToan() {
        return Toan;
    }

    public void setToan(int Toan) {
        this.Toan = Toan;
    }

    public int getVan() {
        return Van;
    }

    public void setVan(int Van) {
        this.Van = Van;
    }

    public int getAnh() {
        return Anh;
    }

    public void setAnh(int Anh) {
        this.Anh = Anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    


}
