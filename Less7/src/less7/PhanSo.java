/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less7;

/**
 *
 * @author ASUS
 */
public class PhanSo {

    private int tu, mau;

    public PhanSo() {

    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void cong(PhanSo p) {
        this.tu = this.tu * p.mau + this.mau * p.tu;
        this.mau = this.mau * p.mau;
    }

    public void rutgon(PhanSo p) {
        int uoc = 1;
        int ts = Math.abs(tu);
        int ms = Math.abs(mau);
        for (int i = ms; i >0; i--) {
            if(ts%i==0&&ms%i==0){
            uoc=i;
            break;
            }
            tu=tu/i;
            mau=mau/i;
            

        }
    }

}
