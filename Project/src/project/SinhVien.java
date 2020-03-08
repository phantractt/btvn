/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ASUS
 */
public class SinhVien {
     private String ten, gioitinh;
    private int Mssv, tuoi;
    boolean isDelete=false;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getMssv() {
        return Mssv;
    }

    public void setMssv(int Mssv) {
        this.Mssv = Mssv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public SinhVien() {
    }

    public SinhVien(String ten, int Mssv, int tuoi, String gioitinh) {
        this.ten = ten;
        this.Mssv = Mssv;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public void hienthi() {
        System.out.print("ten: " + this.ten + " mssv: " + this.Mssv + " tuoi: " + this.tuoi + " gioitinh: " + this.gioitinh);

    }
}
