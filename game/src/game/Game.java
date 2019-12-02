/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Game {

    static int cotX, cotO, hangX, hangO;
    static char[][] Map = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Map[i][j] = '-';
            }

        }
        while (true) {
            hienThiMap();
            nhapX();
            hienThiMap();
            nhapO();
            hienThiMap();
            boolean check = kiemTraThangThua();
            if (check = true) {
                hienThiMap();
                System.out.println("X thang:");
                break;
                
            } else {
                System.out.println("O thang ");
                break;
            }
        }

    

    public static void hienThiMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Map[i][j] + " ");

            }
            System.out.println("");

        }
    }

    public static void nhapX() {
        System.out.println("nhap X: ");
        while (true) {

            System.out.println("nhap hang :");

            hangX = sc.nextInt() - 1;
            System.out.println("nhap  cot :");
            cotX = sc.nextInt() - 1;
            if (hangX > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (cotX > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (Map[hangX][cotX] == 'O') {
                System.out.println("trung O da nhap, nhap lai: ");
                hienThiMap();
            } else if (Map[hangX][cotX] == 'X') {
                System.out.println("trung X da nhap, nhap lai: ");
                hienThiMap();
            } else {
                Map[hangX][cotX] = 'X';
                break;
            }

        }

    }

    public static void nhapO() {
        System.out.println("nhap toa do O:");
        while (true) {

            System.out.println("nhap hang :");
            hangO = sc.nextInt() - 1;
            System.out.println("nhap  cot :");
            cotO = sc.nextInt() - 1;
            if (hangO > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();

            } else if (cotO > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (Map[hangO][cotO] == 'X') {
                System.out.println("trung X da nhap, nhap lai: ");
                hienThiMap();
            } else if (Map[hangO][cotO] == 'O') {
                System.out.println("trung O da nhap, nhap lai: ");
                hienThiMap();
            } else {
                Map[hangO][cotO] = 'O';
                break;
            }
        }

    }

    private static boolean kiemTraThangThua() {
        boolean check = false;
        if (Map[0][0] == Map[0][1] && Map[0][0] == Map[0][2] && Map[0][0] == 'X') {
            check = true;
        }
        if (Map[1][0] == Map[1][1] && Map[1][0] == Map[1][2] && Map[1][0] == 'X') {
            check = true;
        }
        if (Map[2][0] == Map[2][1] && Map[2][0] == Map[2][2] && Map[2][0] == 'X') {
            check = true;
        }
        if (Map[0][0] == Map[1][0] && Map[0][0] == Map[2][0] && Map[0][0] == 'X') {
            check = true;
        }
        if (Map[0][1] == Map[1][1] && Map[0][1] == Map[2][1] && Map[0][1] == 'X') {
            check = true;
        }
        if (Map[0][2] == Map[1][2] && Map[0][2] == Map[2][2] && Map[0][2] == 'X') {
            check = true;
        }
        if (Map[0][0] == Map[1][1] && Map[0][0] == Map[2][2] && Map[0][0] == 'X') {
            check = true;
        }
        if (Map[0][2] == Map[1][1] && Map[0][2] == Map[2][0] && Map[0][2] == 'X') {
            check = true;
        }
        if (Map[0][0] == Map[0][1] && Map[0][0] == Map[0][2] && Map[0][0] == 'O') {
            check = false;
        }
        if (Map[1][0] == Map[1][1] && Map[1][0] == Map[1][2] && Map[1][0] == 'O') {
            check = false;
        }
        if (Map[2][0] == Map[2][1] && Map[2][0] == Map[2][2] && Map[2][0] == 'O') {
            check = false;
        }
        if (Map[0][0] == Map[1][0] && Map[0][0] == Map[2][0] && Map[0][0] == 'O') {
            check = false;
        }
        if (Map[0][1] == Map[1][1] && Map[0][1] == Map[2][1] && Map[0][1] == 'O') {
            check = false;
        }
        if (Map[0][2] == Map[1][2] && Map[0][2] == Map[2][2] && Map[0][2] == 'O') {
            check = false;
        }
        if (Map[0][0] == Map[1][1] && Map[0][0] == Map[2][2] && Map[0][0] == 'O') {

            check = false;
        }
        if (Map[0][2] == Map[1][1] && Map[0][2] == Map[2][0] && Map[0][2] == 'O') {

            check = false;
        }
        return check;

    }

}
