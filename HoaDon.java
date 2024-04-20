package Case;

public class HoaDon {
    private int SoHoaDon;
    private int TongGiaTri;
    private String ThoiGianXuatHoaDon;

    public HoaDon(int soHoaDon, int tongGiaTri, String thoiGianXuatHoaDon) {
        SoHoaDon = soHoaDon;
        TongGiaTri = tongGiaTri;
        ThoiGianXuatHoaDon = thoiGianXuatHoaDon;
    }

    public int getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        SoHoaDon = soHoaDon;
    }

    public int getTongGiaTri() {
        return TongGiaTri;
    }

    public void setTongGiaTri(int tongGiaTri) {
        TongGiaTri = tongGiaTri;
    }

    public String getThoiGianXuatHoaDon() {
        return ThoiGianXuatHoaDon;
    }

    public void setThoiGianXuatHoaDon(String thoiGianXuatHoaDon) {
        ThoiGianXuatHoaDon = thoiGianXuatHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "SoHoaDon=" + SoHoaDon +
                ", TongGiaTri=" + TongGiaTri +
                ", ThoiGianXuatHoaDon='" + ThoiGianXuatHoaDon + '\'' +
                '}';
    }
}
