package org.example.test9;

public class NhanVien {
    private String maNV;
    private String ten;
    private Integer tuoi;
    private float diemTB;
    private Integer kiHoc;
    private String chuyenNganh;

    public NhanVien(String maNV, String ten, Integer tuoi, float diemTB, Integer kiHoc, String chuyenNganh) {
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTB(diemTB);
        setKiHoc(kiHoc);
        setChuyenNganh(chuyenNganh);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if (maNV == null || maNV.isEmpty()) {
            throw new IllegalArgumentException("maNV is null or empty");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Integer getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(Integer kiHoc) {
        this.kiHoc = kiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
