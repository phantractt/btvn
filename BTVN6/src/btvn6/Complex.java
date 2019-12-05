
package btvn6;

/**
 *
 * @author ASUS
 */
public class Complex {

    String loai = "SOTHUC";
    String ten;
    int phanthuc;
    int phanao;

    public Complex() {
        ten = "chuadatten";
        phanthuc = 1;
        phanao = 1;
    }

    public Complex(int a) {
        this.phanthuc = a;
    }

    public Complex(int phanthuc, int phanao) {

        this.phanthuc = phanthuc;
        this.phanao = phanao;

    }
     Complex cong(Complex sophuc) {
        Complex ketqua = new Complex();
        ketqua.phanthuc = this.phanthuc + sophuc.phanthuc;
        ketqua.phanao = this.phanao + sophuc.phanao;
        return ketqua;
    }
         Complex tru(Complex sophuc) {
        Complex ketqua = new Complex();
        ketqua.phanthuc = this.phanthuc - sophuc.phanthuc;
        ketqua.phanao = this.phanao - sophuc.phanao;
        return ketqua;
    }
         Complex nhan(Complex sophuc) {
        Complex ketqua = new Complex();
        ketqua.phanthuc = this.phanthuc * sophuc.phanthuc - this.phanao * sophuc.phanao;
        ketqua.phanao = this.phanthuc * sophuc.phanao + this.phanao * sophuc.phanthuc;
        return ketqua;
    }
          Complex chia(Complex sophuc) {
        Complex ketqua = new Complex();
        ketqua.phanthuc = (sophuc.phanthuc * this.phanthuc + this.phanao * sophuc.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        ketqua.phanao = (this.phanthuc * sophuc.phanao - sophuc.phanthuc * this.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        return ketqua;
    }

    void shows() {
        System.out.println(this.ten + " : " + this.phanthuc +" + "+ this.phanao + "*i");
    }

}
