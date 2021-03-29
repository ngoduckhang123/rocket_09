package com.vti.academy.fontend;

import java.util.Scanner;

import com.vti.academy.backend.ManagerDocument;
import com.vti.academy.entity.Newpaper;
import com.vti.academy.entity.Sach;
import com.vti.academy.entity.TaiLieu;
import com.vti.academy.entity.TapChi;

public class QLTV {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {
            System.out.println("Quản lý thư viện");
            System.out.println("Enter 1: Thêm mới tài liệu:");
            System.out.println("Enter 2: Tìm kiếm tài liệu theo loại: ");
            System.out.println("Enter 3: Hiển thị thông tin về tài liệu:");
            System.out.println("Enter 4: Xóa tài liệu theo id:");
            System.out.println("Enter 5: Thoát khỏi chương trình:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Thêm Sách");
                    System.out.println("Enter b: Thêm Newspaper");
                    System.out.println("Enter c: Thêm Tạp Chí");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("Enter author: ");
                            scanner.nextLine();
                            String tenTacGia = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            int soTrang = scanner.nextInt();
                            TaiLieu Sach = new Sach(id, nxb, soBanPhatHanh, tenTacGia, soTrang);
                            managerDocument.addDocument(Sach);
                            System.out.println(Sach.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter so ban phat hanh: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("Enter ngay phat hanh: ");
                            int ngayPhatHanh = scanner.nextInt();
                            TaiLieu newspaper = new Newpaper(id, nxb, soBanPhatHanh, ngayPhatHanh);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter issue number : ");
                            int soPhatHanh = scanner.nextInt();
                            System.out.print("Enter issue month : ");
                            int thangPhatHanh = scanner.nextInt();
                            TaiLieu TapChi = new TapChi(id, nxb, number, soPhatHanh, thangPhatHanh);
                            managerDocument.addDocument(TapChi);
                            System.out.println(TapChi.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

	

}
