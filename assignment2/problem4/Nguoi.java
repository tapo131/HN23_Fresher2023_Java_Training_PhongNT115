package problem4;

class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCMND;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String toString() {
        return "Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Nghề nghiệp: " + ngheNghiep + ", Số CMND: " + soCMND;
    }
}