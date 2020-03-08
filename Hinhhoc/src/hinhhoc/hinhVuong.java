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
public class hinhVuong extends Hinhhoc {

    double canh;

    public hinhVuong(double canh) {
        this.canh = canh;
        this.ten = "hinh 4 goc vuong va cac canh bang nhau";
    }

    @Override
    void chuVi() {
        chuVi = 4 * canh;
    }

    @Override
    void dienTich() {
        dienTich = canh * canh;
    }

    @Override
    void hienThi() {
    }

}
