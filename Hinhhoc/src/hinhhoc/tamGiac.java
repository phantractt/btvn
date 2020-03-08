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
public class tamGiac extends Hinhhoc {

    double canh1, canh2, canh3, chieucao1;

    public tamGiac(double canh1, double canh2, double canh3, double chieucao1) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.chieucao1 = chieucao1;
        this.ten="hinh co 3 goc hop lai 180";
    }

    @Override
    void chuVi() {
        chuVi = canh1 + canh2 + canh3;
    }

    @Override
    void dienTich() {
        dienTich = (canh1 * chieucao1) / 2;

    }

    @Override
    void hienThi() {
    }
}
