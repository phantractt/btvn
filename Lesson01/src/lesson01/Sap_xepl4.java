/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Sap_xepl4 {

    public static void main(String[] args) {
        int a[] = {4, 2, 5, 1, 35, 325, 1, 4, 123, 12, 42, 5, 35, 64, 123, 67};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));
        Phanso ps1= new Phanso();
        ps1.tuso=3;
        ps1.mauso=5;
        Phanso ps2 = new Phanso();
        ps2.tuso=4;
        ps2.mauso=5;
        Phanso psArray[] = {ps1,ps2};
        for (int i = 0; i < psArray.length; i++) {
            for (int j = i + 1; j < psArray.length; j++) {
                int hieuso=psArray[i].mauso*psArray[j].tuso-psArray[j].mauso*psArray[i].tuso;
                if (hieuso>0) {
                    Phanso temp = psArray[i];
                    psArray[i] = psArray[j];
                    psArray[j] = temp;
                }

            }

        }
       
        
    }

}

class Phanso {

    int tuso;
    int mauso;
}
