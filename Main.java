package Case;

import Case.HoaDon;
import Case.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dangnhap = new HashMap<>();
        dangnhap.put("admin", "admin");
        System.out.println("============ Menu ============" +
                "\n1. Dang nhap" +
                "\n2. Dang ki");
        Scanner scanner1 = new Scanner(System.in);
        int choice1 = scanner1.nextInt();
        if (choice1 == 1) {
            System.out.println("Ten dang nhap");
            scanner1.nextLine();
            String TenDangNhap = scanner1.nextLine();
            System.out.println("Mat khau");
            String MatKhau = scanner1.nextLine();
            if (dangnhap.containsKey(TenDangNhap) && dangnhap.get(TenDangNhap).equals(MatKhau)) {
                System.out.println("============ Lua chon che do ===========" +
                        "\n1. Hien thong tin tai khoan" +
                        "\n2. Quan ly phong" +
                        "\n3. Quan ly hoa don" +
                        "\n4. Sua thong tin dang nhap" +
                        "\n5. Thoat");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 5) {
                    return;
                }
                if (choice == 2) {
                    ArrayList<Room> list = new ArrayList<>();
                    list.add(new Room(1, 100, 3, "Phongtrong"));
                    System.out.println("========== QL phong ==========" +
                            "\n1. Hien thi danh sach" +
                            "\n2. Them phong" +
                            "\n3. Sua thong tin phong theo room id" +
                            "\n4. Tim phong theo ID" +
                            "\n5. Tim phong theo khoang gia");
                    Scanner scanner2 = new Scanner(System.in);
                    int choice2 = scanner2.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Danh Sach phong");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i));
                        }
                    }
                    if (choice2 == 2) {
                        System.out.println("Nhap ID muon them:");
                        int roomID = scanner2.nextInt();
                        System.out.println("Nhap gia phong:");
                        int giaphong = scanner2.nextInt();
                        System.out.println("Nhap tang: ");
                        int tang = scanner2.nextInt();
                        String tinhtrangSD = "dangSD";
                        list.add(new Room(roomID, giaphong, tang, tinhtrangSD));
                    }
                    if (choice2 == 3) {
                        int roomIDedit = scanner2.nextInt();
                        boolean found = false;
                        for (Room room : list) {
                            if (room.getRoomID() == roomIDedit) {
                                System.out.println("Nhap gia phong moi");
                                int newGiaPhong = scanner2.nextInt();
                                System.out.println("Nhap so tang moi");
                                int newTang = scanner2.nextInt();
                                room.setGiaphong(newGiaPhong);
                                room.setTang(newTang);
                                found = true;
                                System.out.println("Thong tin moi da duoc cap nhat");
                                break;
                            }
                            if (!found) {
                                System.out.println("Khong hop le");
                            }
                        }
                    }
                    if (choice2 == 4) {
                        int roomIDfind = scanner.nextInt();
                        boolean found = false;
                        for (Room find : list) {
                            if (find.getRoomID() == roomIDfind) {
                                System.out.println("Thong tin phong");
                                System.out.println(find);
                            }
                            if (!found) {
                                System.out.println("Khong hop le");
                            }
                        }
                    }
                    if (choice2 == 5) {
                        int timGiaPhong = scanner2.nextInt();
                        boolean found = false;
                        for (Room price : list) {
                            if (price.getGiaphong() == timGiaPhong) {
                                System.out.println("Thong tin phong");
                                System.out.println(price);
                            }
                            if (!found){
                                System.out.println("Khong tim thay vui long tim lai");
                            }
                        }
                    }
                    if (choice == 3) {
                        ArrayList <HoaDon> list1 = new ArrayList<>();
                        System.out.println("========== QL hoa don ==========" +
                                "\n1. Hien thi danh sach hoa don" +
                                "\n2. Tao hoa don" +
                                "\n3. Sua thong tin hoa don theo so hoa don" +
                                "\n4. Xoa hoa don" +
                                "\n5. Tim va tinh tong tien hoa don theo khoang thoi gian" +
                                "\n6. Xuat file CSV");
                        Scanner scanner3 = new Scanner(System.in);
                        int choice3 = scanner3.nextInt();
                        if (choice3 == 1) {
                            System.out.println("Danh sach hoa don");
                            for (int i = 0; i < list1.size(); i++) {
                                System.out.println(list1.get(i));
                            }
                        }
                        if (choice3 == 2) {
                            System.out.println("Nhap thong tin hoa don moi");
                            System.out.println("Nhap so hoa don");
                            int newSoHoaDon = scanner3.nextInt();
                            System.out.println("Nhap gia tri hoa don");
                            int newGiaTri = scanner3.nextInt();
                            System.out.println("Nhap ngay thang");
                            String newNgayThang = scanner3.nextLine();
                            list1.add(new HoaDon(newSoHoaDon,newGiaTri,newNgayThang));
                        }
                        if (choice3 == 3) {
                            int SoHoaDonEdit =scanner3.nextInt();
                            boolean found = false;
                            for (HoaDon hoadon : list1) {
                                if (hoadon.getSoHoaDon()== SoHoaDonEdit){
                                    System.out.println("Tong gia tri moi");
                                    int newGiaTri = scanner3.nextInt();
                                    System.out.println("Thoi gian xuat hoa don moi");
                                    String newThoiGian = scanner3.nextLine();
                                    hoadon.setTongGiaTri(newGiaTri);
                                    hoadon.setThoiGianXuatHoaDon(newThoiGian);
                                    found = true;
                                    System.out.println("Thong tin moi da duoc cap nhat");
                                }
                                if (!found) {
                                    System.out.println("Khong hop le");
                                }
                            }
                        }
                        if (choice3 == 4) {
                            int xoaHoaDon = scanner3.nextInt();
                            boolean found = false;
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i).getSoHoaDon() == xoaHoaDon) {
                                    list1.remove(i);
                                    found= true;
                                    System.out.println("Hoa don da duoc xoa");
                                    break;
                                }
                                if (!found) {
                                    System.out.println("khong tim thay hoa don");
                                }
                            }
                        }
                        if (choice3 == 5) {
                            System.out.println("Nhap khoang thoi gian (vd: '2024-04-01 2024-04-30'):");
                            Scanner scanner4 = new Scanner(System.in);
                            String startTime = scanner4.next();
                            String endTime = scanner4.next();
                            int totalAmount = 0;
                            boolean found = false;
                            for (HoaDon hoadon : list1) {
                                if (hoadon.getThoiGianXuatHoaDon().compareTo(startTime) >= 0 &&
                                        hoadon.getThoiGianXuatHoaDon().compareTo(endTime) <= 0) {
                                    totalAmount += hoadon.getTongGiaTri();
                                    found = true;
                                }
                            }
                            if (found) {
                                System.out.println("Tong tien cac hoa don trong khoang thoi gian da nhap: " + totalAmount);
                            } else {
                                System.out.println("Khong tim thay hoa don nao trong khoang thoi gian da nhap.");
                            }
                        }
                    }
                    if (choice == 4) {
                        System.out.println("Nhap ten dang nhap can doi");
                        dangnhap.remove(TenDangNhap);
                        System.out.println("Doi ten dang nhap");
                        TenDangNhap = scanner.nextLine();
                        System.out.println("Doi mat khau");
                        MatKhau = scanner.nextLine();
                        dangnhap.put(TenDangNhap,MatKhau);
                        System.out.println("Da cap nhat");

                    }
                    if (choice == 1) {
                        System.out.println("Ten Dang Nhap: " + TenDangNhap);
                        System.out.println("Mat Khau: "+ MatKhau);
                    }
                }
            }
        }
        else if (choice1 == 2) {
            System.out.println("Dang ki Tai khoan moi");
            System.out.println("Ten dang nhap moi");
            String newUSN = scanner1.nextLine();
            System.out.println("Mat khau");
            String newPW = scanner1.nextLine();
            dangnhap.put(newUSN,newPW);

            System.out.println("TK da dang ki thanh cong");
        }
        else {
            System.out.println("Nhap lai di sai roi");
        }
    }
}
