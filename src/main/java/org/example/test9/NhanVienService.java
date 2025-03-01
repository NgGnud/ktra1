package org.example.test9;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> nhanViens  = new ArrayList<>();
    public boolean addNhanVien(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new IllegalArgumentException("nhanVien is null");
        }
        for (NhanVien nv : nhanViens) {
            if (nv.getMaNV().equals(nhanVien.getMaNV())) {
                throw new IllegalArgumentException("nhanVien is already exist");
            }
        }
        return nhanViens.add(nhanVien);
    }

    public boolean updateNhanVien(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new IllegalArgumentException("nhanVien is null");
        }
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).getMaNV().equals(nhanVien.getMaNV())) {
                nhanViens.set(i, nhanVien);
                return true;
            }
        }
        throw new IllegalArgumentException("nhanVien is already exist");
    }

    public boolean deleteNhanVien(String maNV) {
        if (maNV == null) {
            throw new IllegalArgumentException("maNV is null");
        }
        return nhanViens.removeIf(nv -> nv.getMaNV().equals(maNV));
    }

    public NhanVien getNhanVien(String maNV) {
        if (maNV == null) {
            throw new IllegalArgumentException("maNV is null");
        }
        for (NhanVien nv : nhanViens) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;
            }
        }
        throw new IllegalArgumentException("nhanVien is already exist");
    }
}
