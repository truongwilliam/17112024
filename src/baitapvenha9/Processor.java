package baitapvenha9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList danhSachSinhVien = new StudentList();
        int luaChon;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Xoa sinh vien theo ma");
            System.out.println("5. Cap nhat sinh vien theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon mot tuy chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1 -> {
                    System.out.print("Nhap so luong sinh vien: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();
                    danhSachSinhVien.nhapDanhSachSinhVien(soLuong);
                }
                case 2 -> danhSachSinhVien.hienThiTatCaSinhVien();
                case 3 -> {
                    System.out.print("Nhap ma sinh vien: ");
                    String idTimKiem = scanner.nextLine();
                    Student svTimKiem = danhSachSinhVien.timSinhVienBangId(idTimKiem);
                    if (svTimKiem != null) {
                        svTimKiem.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay sinh vien co ma " + idTimKiem);
                    }
                }
                case 4 -> {
                    System.out.print("Nhap ma sinh vien: ");
                    String idXoa = scanner.nextLine();
                    danhSachSinhVien.xoaSinhVienBangId(idXoa);
                }
                case 5 -> {
                    System.out.print("Nhap ma sinh vien: ");
                    String idCapNhat = scanner.nextLine();
                    danhSachSinhVien.capNhatSinhVienBangId(idCapNhat);
                }
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le.");
            }
        } while (luaChon != 0);
    }
}
