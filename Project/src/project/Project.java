/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ASUS
 */
public class Project {
static Scanner sc = new Scanner(System.in);
    static int count=0;
    public static void main(String[] args) {
        // TODO code application logic here  while (true) {

            System.out.println("1.Hien danh sach sinh vien:");
            System.out.println("2.Them sinh vien");
            System.out.println("3.Sua sinh vien");
            System.out.println("4.Xoa sinh vien");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    hienThiSinhVien();
                    break;
                case 2:
                    themSinhVien();
                    break;
                case 3:
                    suaSinhVien();
                    break;
                case 4:
                    xoaSinhVien();
                    break;
            }
        }
    

    public static void hienThiSinhVien() {
        if (count == 0) {
            System.out.println("Khong co sinh vien");
        } else {
            for (int i = 0; i < count; i++) {
                if(!sv[i].isDelete){
                    sv[i].hienthi();
                }
                
            }
        }
    }

    public static void themSinhVien() {
        sc.nextLine();
        System.out.println("ten:");
        String ten = sc.nextLine();
        System.out.println("MSSV:");
        int mssv = sc.nextInt();
        sc.nextLine();
        System.out.println("tuoi:");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("gioi tinh:");
        String gt = sc.nextLine();
        sv[count] = new SinhVien(ten, mssv, tuoi, gt);
        count++;
    }

    public static void xoaSinhVien() {
        System.out.println("nhap mssv can xoa");
        int mssv = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (sv[i].getMssv() == mssv) {
                sv[i].isDelete=true;
            }
        }
    }

    public static void suaSinhVien() {
        System.out.println("nhap mssv can sua");
        int mssv = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (mssv==sv[i].getMssv()) {
                System.out.println("ban muon sua ten thanh gi ?");
                String newName=sc.nextLine();
                sv[i].setTen(newName);
                System.out.println("done");
                
            }
            
        }

    }
    
}
