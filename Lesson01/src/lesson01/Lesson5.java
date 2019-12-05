/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lesson5 {

    static int X, Y, ENDX, ENDY;
    static char[][] Map = new char[10][10];
    static Scanner sc = new Scanner(System.in);
    static int enX, enY;

    public static void main(String[] args) {
        X = 2;
        Y = 2;
        ENDX = (int) (Math.random() * 10);
        ENDY = (int) (Math.random() * 10);
        enX = (int) (Math.random() * 10);
        enY = (int) (Math.random() * 10);
        while (X == ENDX && Y == ENDY) {
            ENDX = (int) (Math.random() * 10);
            ENDY = (int) (Math.random() * 10);

        }
        while (enX == ENDX && enY == ENDY || enX == X && enY == Y) {
            enX = (int) (Math.random() * 10);
            enY = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == X && j == Y) {
                    Map[i][j] = 'X';
                } else if (i == ENDX && j == ENDY) {
                    Map[i][j] = 'O';
                } else if (i == enX && j == enY) {
                    Map[i][j] = 'K';
                } else {
                    Map[i][j] = '-';
                }

            }

        }
        while (true) {
            hienThiMap();
            char input = nhapPhimDiChuyen();
            capNhapToaDoMap(input);
            enemy();
            String check=checkThangThua();
            if (check.equals(X)) {
                System.out.println("Thang");
                break;
                capNhapToaDoMap();
        }

    }

    public static void hienThiMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(Map[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static char nhapPhimDiChuyen() {
        System.out.println("Nhap WASD: ");
        String a = sc.nextLine();
        char giaTriVuaNhap = a.charAt(0);
        return giaTriVuaNhap;

    }

    public static void capNhapToaDoMap(char c) {
        switch (c) {
            case 'A':
                if (Y == 0) {
                    Map[X][Y] = '-';
                    Y = 9;
                    Map[X][Y] = 'X';
                } else {
                    Map[X][Y] = '-';
                    Y--;
                    Map[X][Y] = 'X';
                }
                break;
            case 'S':
                if (X == 9) {
                    Map[X][Y] = '-';
                    X = 0;
                    Map[X][Y] = 'X';
                } else {
                    Map[X][Y] = '-';
                    X++;
                    Map[X][Y] = 'X';
                }
                break;

            case 'W':
                if (X == 0) {
                    Map[X][Y] = '-';
                    X = 9;
                    Map[X][Y] = 'X';
                } else {
                    Map[X][Y] = '-';
                    X--;
                    Map[X][Y] = 'X';
                }
                break;
            case 'D':
                if (Y == 9) {
                    Map[X][Y] = '-';
                    Y = 0;
                    Map[X][Y] = 'X';
                } else {
                    Map[X][Y] = '-';
                    Y++;
                    Map[X][Y] = 'X';
                }
                break;
        }
    }

    public static String checkThangThua() {

        if (X == ENDX && Y == ENDY) {
            return "thang";
        } else if (X == enX && Y == enY) {
            return "thua";
        }
        return "tieptuc";
    }

    public static void enemy() {
        int j = (int) (Math.random() * 3);
        switch (j) {
            case 0:
                if (enY == 0) {
                    Map[enX][enY] = '-';
                    enY = 9;
                    Map[enX][enY] = 'K';
                } else {
                    Map[enX][enY] = '-';
                    enY--;
                    Map[enX][enY] = 'K';
                }
                break;
            case 1:
                if (enY == 9) {
                    Map[enX][enY] = '-';
                    enY = 0;
                    Map[enX][enY] = 'K';
                } else {
                    Map[enX][enY] = '-';
                    enY++;
                    Map[enX][enY] = 'K';
                }
                break;
            case 2:
                if (enX == 9) {
                    Map[enX][enY] = '-';
                    enX = 0;
                    Map[enX][enY] = 'K';
                } else {
                    Map[enX][enY] = '-';
                    enX++;
                    Map[enX][enY] = 'K';
                }
                break;
            case 3:
                if (enX == 0) {
                    Map[enX][enY] = '-';
                    enX = 9;
                    Map[enX][enY] = 'K';
                } else {
                    Map[enX][enY] = '-';
                    enX--;
                    Map[enX][enY] = 'K';
                    break;
                }
        }
    }
