/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less10;

/**
 *
 * @author ASUS
 */
public class Sinhvien {

    String ten;
    int tuoi, mssv,toan,anh,van;

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }
    

    public Sinhvien() {
    }

    public Sinhvien(String ten, int mssv, int tuoi,int toan, int anh,int van) {
        this.ten=ten;
        this.mssv=mssv;
        this.tuoi=tuoi;
        this.toan=toan;
        this.anh=anh;
        this.van=van;
    }
    void Hienthi(){
        System.out.println("ten: " + this.ten + " mssv: " + this.mssv + " tuoi: " + this.tuoi);}

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }


}
