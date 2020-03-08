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
public class tron extends Hinhhoc {
    double bankinh;
    double pi=3.14;
    public tron(double bankinh) {
        this.bankinh = bankinh;
        this.ten="hinh tron";
        
    }
    @Override
    void chuVi(){
    chuVi=2*pi*bankinh;
    }
    void đienTich(){
    dienTich=2*pi*bankinh*bankinh;
    }
    @Override
    void hienThi(){}
    
    
}
