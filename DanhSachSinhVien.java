import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SInhVien> danhSach;
    public DanhSachSinhVien() {
            this.danhSach=new ArrayList<SInhVien>();
    }

    public DanhSachSinhVien(ArrayList<SInhVien> danhSach) {
        this.danhSach=danhSach;
    }
    //1. them sinh vien vao trong danh sach.
    public void themSinhVien (SInhVien sv) {
        this.danhSach.add(sv);
    }
    //2. In danh sach sinh vien ra man hinh.
    public void inDanhSachSinhVien() {
        for (SInhVien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }
    // 3. kiem tra xem danh sach co rong hay khong
    public boolean kiemTraDanhSachRong() {
       return this.danhSach.isEmpty();
    }
    // 4 lay ra so luong sinh vien trong danh sach

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }
    // 5. lam rong danh sach sinh vien
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }
    //6 Kiem Tra Sinh Vien Co Ton tai Trong Danh Sach hay Khong, Dua tren ma sinh vien
    public boolean kiemTraDTonTai(SInhVien sv) {
        return this.danhSach.contains(sv);
    }
    // 7 xoa mot sinh vien ra khoi danh sach

    public boolean xoaSinhVien(SInhVien sv) {
        return this.danhSach.remove(sv);
    }

    // 8tim kiem tat ca sinh vien tu ban phim
    public void timSinhVien(String ten) {
        for (SInhVien sinhVien: danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten)>=0) {
                System.out.println(sinhVien);
            }

        }
    }
    // 9 sap xep nhan vien tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SInhVien>() {
            @Override
            public int compare(SInhVien sv1, SInhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;

                } else {
                    return 0;
                }
            }
        });
    }
}
