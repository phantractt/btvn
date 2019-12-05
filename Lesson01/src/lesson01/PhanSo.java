/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

/**
 *
 * @author ASUS
 */
public class PhanSo {

    //properties
    String ten;
    int tuso;
    int mauso;

    PhanSo() {// default constructor
        ten = "chuadatten";
        tuso = 1;
        mauso = 1;
    }

    PhanSo(int x, int y) {// overload
        ten = "khong ten ";
        tuso = x;
        mauso = y;
    }

    public PhanSo(String ten, int tuso, int mauso) {
        this.ten = ten;
        this.tuso = tuso;
        this.mauso = mauso;
    }

    PhanSo(PhanSo k) {
        ten = k.ten;
        tuso = k.tuso;
        mauso = k.mauso;
    }

    //constructor
    //methods
    void hienThi() {
        System.out.println(this.ten + ":" + tuso + "/" + mauso);
    }

    double giaTri() {
        double giatri = tuso / (double) mauso;
        return giatri;
    }

    PhanSo cong(PhanSo x) {
        PhanSo ketqua = new PhanSo();
        ketqua.tuso = x.tuso * this.mauso + this.tuso * x.mauso;
        ketqua.mauso = x.mauso * this.mauso;
        return ketqua;
    }

    void rutGon() {
        int uoc = 1;
        int ts = Math.abs(tuso);
        int ms = Math.abs(mauso);
        for (int i = ms; i > 0; i--) {
            if (ts % i == 0 && ms % i == 0) {
                uoc = i;
                break;
            }

        }
        tuso = tuso / uoc;
        mauso = mauso / uoc;
    }
}
    

