/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class he {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so sinh vien: ");
        int n = sc.nextInt();
        Candidate[] Ca = new Candidate[n];

        for (int i = 0; i < n; i++) {
            Ca[i] = new Candidate();
            Ca[i].nhapCa();
        }
        for (int i = 0; i < n; i++) {
            Ca[i].CaTren15d();
        }

    }
}
