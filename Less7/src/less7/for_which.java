/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class for_which {

    public static void main(String[] args) {
//        int[] arr = new int[5];
//        for (int i : arr) {
//            System.out.println(arr[i]);

//      
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan so");
        String input=sc.nextLine();
        for (String s : input.split("/")) {
            System.out.println(s);
            
        }
    }

}
