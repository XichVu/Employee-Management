/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltienluong;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ttNhanVien implements Serializable {
    
    private String manv, hoten, sdt, gioitinh, chucvu, diachi, ngaysinh, ngaylam, giolam, thanglam, luong;
    
    public String getMaNV() {
        return manv;
    }
    public void setMaNV(String manv) {
        this.manv = manv;
    }
    
    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }
    
    public String getSDT() {
        return sdt;
    }
    public void setSDT(String sdt) {
        this.sdt = sdt;
    }
    
    public String getGioiTinh() {
        return gioitinh;
    }
    public void setGioiTinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public String getNgaySinh() {
        return ngaysinh;
    }
    public void setNgaySinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    public String getChucVu() {
        return chucvu;
    }
    public void setChucVu(String chucvu) {
        this.chucvu = chucvu;
    }
    
    public String getDiaChi() {
        return diachi;
    }
    public void setDiaChi(String diachi) {
        this.diachi = diachi;
    }
    
    public String getNgayLam() {
        return ngaylam;
    }
    public void setNgayLam(String ngaylam) {
        this.ngaylam = ngaylam;
    }
    
    public String getGioLam() {
        return giolam;
    }
    public void setGioLam(String giolam) {
        this.giolam = giolam;
    }
    
    public String getThangLam() {
        return thanglam;
    }
    public void setThangLam(String thanglam) {
        this.thanglam = thanglam;
    }
    
    public String getLuong() {
        return luong;
    }
    public void setLuong(String luong) {
        this.luong = luong;
    }
}
