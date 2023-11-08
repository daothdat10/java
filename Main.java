import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        DanhSachSinhVien dssv= new DanhSachSinhVien();
        int luaChon=0;
        do {
            System.out.println("Menu ---------");
            System.out.println("Vui Long Chon Chuc Nang: ");
            System.out.println(
                    "1.  Them sinh vien vao danh sach. \n "
                            + "2.  In danh sach sinh vien ra man hinh. \n "
                            + "3.  Kiem tra danh sach co rong hay khong. \n "
                            + "4.  Lay ra so luong sinh vien trong danh sach. \n "
                            + "5.  Lam rong danh sach sinh vien. \n "
                            + "6.  Kiem tra sinh vien co ton tai tronh danh sach hay khong, bang ma sinh vien. \n "
                            + "7.  Xoa mot sinh vien ra khoi danh sach bang ma sinh vien. \n "
                            + "8.  Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim. \n "
                            + "9.  xuat ra man hinh sinh vien co diem tu cao den thap. \n "
                            + "0.  thoat chuong trinh. \n ");
                    luaChon = scanner.nextInt();
                    scanner.nextLine();


                    if(luaChon == 1) {
                        System.out.println("nhap ma sinh vien: "); String maSinhVien = scanner.nextLine();
                        System.out.println("nhap ho va ten: "); String hoVaTen = scanner.nextLine();
                        System.out.println("nhap nam sinh: "); int namSinh = scanner.nextInt();
                        System.out.println("nhap diem trung binh" ); float diemTrungBinh = scanner.nextFloat();
                        SInhVien sv = new SInhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                        dssv.themSinhVien(sv);

                    } else if (luaChon == 2) {
                        // in danh sach ra man hinnh
                        dssv.inDanhSachSinhVien();
                    } else if (luaChon == 3) {
                        // kiem tra danh sach rong
                        System.out.println("Danh Sach Rong" + dssv.kiemTraDanhSachRong());
                    } else if (luaChon == 4) {
                        // lay so luong sinh vien
                        System.out.println("so luong sinh vien: "+dssv.laySoLuongSinhVien());
                    }else if (luaChon == 5) {
                        // lam rong danh sach
                        dssv.lamRongDanhSach();
                    }else if (luaChon == 6) {
                        // kiem tra sinh vien ton tai khong
                        System.out.println("nhap ma sinh vien: "); String maSinhVien = scanner.nextLine();
                        SInhVien sv = new SInhVien(maSinhVien) ;
                        System.out.println("kiem tra ma sinh viem: "+dssv.kiemTraDTonTai(sv));

                    }else if (luaChon == 7) {
                        // xoa 1 sinh vien khoi danh sach
                        System.out.println("nhap ma sinh vien: "); String maSinhVien = scanner.nextLine();
                        SInhVien sv = new SInhVien(maSinhVien) ;
                        System.out.println("xoa sinh vien trong danh sach: "+dssv.xoaSinhVien(sv));

                    }else if (luaChon == 8) {
                        // 8 tim kiem tat ca sinh vien dua tren ten nhap tu ban phim
                        System.out.println("nhap ho va ten: "); String hoVaTen = scanner.nextLine();
                        System.out.println("ket qua tim kiem: ");
                        dssv.timSinhVien(hoVaTen);

                    }else if (luaChon == 9) {
                        dssv.sapXepSinhVienGiamDanTheoDiem();
                        dssv.inDanhSachSinhVien();
                    }
        } while (luaChon !=0);
    }
}