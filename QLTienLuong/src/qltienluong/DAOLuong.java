/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltienluong;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOLuong {
    private Connection conn;
    
    public DAOLuong(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://CHIEN-20210609J\\SQLEXPRESS:1433;databaseName=QuanLyLuong;user=sa;password=123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean themLuong(ttNhanVien nv){
        
        String sql = "INSERT INTO QuanLyLuong(MaNV, HoTen, SDT, ChucVu, NgayLam, GioLam)"
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getSDT());
            ps.setString(4, nv.getChucVu());
            ps.setString(5, nv.getNgayLam());
            ps.setString(6, nv.getGioLam());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean xoaLuong(String manv, String ngaylam) {
        try {
            Statement comm = conn.createStatement();
 
            String del = "DELETE FROM QuanLyLuong "
                    + "WHERE MaNV = '" 
                    + manv + "' AND NgayLam = '"
                    + ngaylam + "'";

            return comm.executeUpdate(del) > 0;
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return false;
    }
    
    public boolean capNhatLuong(ttNhanVien nv) {
        try {
            
            String upd = "UPDATE QuanLyLuong SET GioLam=? WHERE MaNV = ? AND NgayLam = ?";
            
            PreparedStatement ps = conn.prepareStatement(upd);
 
            ps.setString(1, nv.getGioLam());
            ps.setString(2, nv.getMaNV());
            ps.setString(3, nv.getNgayLam());
            
            return ps.executeUpdate() > 0;
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<ttNhanVien> getDSLuong(){
        ArrayList<ttNhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM QuanLyLuong";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ttNhanVien nv = new ttNhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setSDT(rs.getString("SDT"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setNgayLam(rs.getString("NgayLam"));
                nv.setGioLam(rs.getString("GioLam"));
                
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public boolean themVaoBLuong(ttNhanVien nv){
        
        String sql = "INSERT INTO QuanLyBangLuong(MaNV, HoTen, Thang, Luong)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getThangLam());
            ps.setString(4, nv.getLuong());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
