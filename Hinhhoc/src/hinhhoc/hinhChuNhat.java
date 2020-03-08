/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

/**
 *
 * @author ASUS
 */
public class hinhChuNhat extends Hinhhoc {

    double chieudai, chieurong;
    public hinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        
        this.ten="hinh 4 goc vuong nhung cac canh k bang nhau ";
    }

    @Override
    void chuVi() {
        chuVi = 2 * chieudai + 2 * chieurong;
    }

    @Override
    void dienTich() {
        dienTich = chieudai * chieurong;
    }

    @Override
    void hienThi() {
    }

}
