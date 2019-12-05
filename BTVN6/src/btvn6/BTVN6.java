/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

/**
 *
 * @author ASUS
 */
public class BTVN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Complex x = new Complex() ;
        x.shows();
        Complex cp1= new Complex(1);
        cp1.shows();
        Complex cp2 = new Complex(2,3);
        cp2.shows();
        Complex cp3=new Complex(3,4);
        cp3.shows();
        Complex kq1=cp2.cong(cp3);
        kq1.shows();
        Complex kq2=cp2.tru(cp3);
        kq2.shows();
        Complex kq3=cp2.nhan(cp3);
        kq3.shows();
        Complex kq4=cp2.chia(cp3);
        kq4.shows();
    }
    
}
