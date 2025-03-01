package org.example.test9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService nhanVienService = new NhanVienService();
    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void addNhanVien() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        assertTrue(nhanVienService.addNhanVien(nhanVien));
    }
    @Test
    void addNhanViennull() {
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.addNhanVien(null);});
    }
    @Test
    void addNhanVienkhongtimthayma() {
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.addNhanVien(new NhanVien("","dungdz",19,9,5,"IT"));});
    }

    @Test
    void updateNhanVien() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        nhanVienService.addNhanVien(nhanVien);
        NhanVien nhanVien1 = new NhanVien("hh01","dungdz22",19,9,5,"IT");
        assertTrue(nhanVienService.updateNhanVien(nhanVien1));
    }
    @Test
    void updateNhanViennull() {
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.updateNhanVien(null);});
    }
    @Test
    void updateNhanVienkhongtimthayma() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        nhanVienService.addNhanVien(nhanVien);
        NhanVien nv = new NhanVien("hh","dungdz22",19,9,5,"IT");
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.updateNhanVien(nv);});
    }

    @Test
    void deleteNhanVien() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        nhanVienService.addNhanVien(nhanVien);
        assertTrue(nhanVienService.deleteNhanVien("hh01"));
    }
    @Test
    void deleteNhanViennull() {
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.deleteNhanVien(null);});
    }
    @Test
    void deleteNhanVienkhongtimthayma() {
        assertFalse(nhanVienService.deleteNhanVien("hh"));
    }

    @Test
    void getNhanVien() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(nhanVien,nhanVienService.getNhanVien("hh01"));
    }
    @Test
    void getNhanViennull() {
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.getNhanVien(null);});
    }
    @Test
    void getNhanVienkhongtimthayma() {
        NhanVien nhanVien = new NhanVien("hh01","dungdz",19,9,5,"IT");
        nhanVienService.addNhanVien(nhanVien);
        assertThrows(IllegalArgumentException.class, () -> {nhanVienService.getNhanVien("hh");});
    }
}