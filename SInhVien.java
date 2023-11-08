import java.util.Objects;
import java.util.Scanner;

public class SInhVien implements Comparable<SInhVien> {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public SInhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public SInhVien (String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien=maSinhVien;
        this.hoVaTen=hoVaTen;
        this.namSinh=namSinh;
        this.diemTrungBinh=diemTrungBinh;
    }
    public String getMaSinhVien() {
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien=maSinhVien;
    }

    public String getHoVaTen() {
       return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen){
        this.hoVaTen=hoVaTen;
    }

    public int getNamSinh () {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh=namSinh;
    }

    public float getDiemTrungBinh() {
        return this.diemTrungBinh;
    }

    public void setHoVaTen(float diemTrungBinh) {
        this.diemTrungBinh=diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SInhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    @Override
    public int compareTo(SInhVien o) {

        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SInhVien other = (SInhVien) o;
        return Objects.equals(maSinhVien, other.maSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diemTrungBinh,hoVaTen,maSinhVien,namSinh);
    }
}
