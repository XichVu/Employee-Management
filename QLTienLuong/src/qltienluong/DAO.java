/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltienluong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class DAO {
    private Connection conn;
    
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://CHIEN-20210609J\\SQLEXPRESS:1433;databaseName=QuanLyNhanVien;user=sa;password=123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean themNhanVien(ttNhanVien nv){
        
        String sql = "INSERT INTO QuanLyNhanVien(MaNV, HoTen, SDT, GioiTinh, NgaySinh, ChucVu, DiaChi)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getSDT());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getNgaySinh());
            ps.setString(6, nv.getChucVu());
            ps.setString(7, nv.getDiaChi());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean xoaNhanVien(String manv) {
        try {
            Statement comm = conn.createStatement();
 
            String del = "DELETE FROM QuanLyNhanVien "
                    + "WHERE MaNV = '" 
                    + manv + "'";

            return comm.executeUpdate(del) > 0;
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return false;
    }
    
    public boolean capNhatTTNV(ttNhanVien nv) {
        try {
            
            String upd = "UPDATE QuanLyNhanVien SET MaNV=?, HoTen=?, SDT=?,"
                    + "GioiTinh=?, NgaySinh=?, ChucVu=?, DiaChi=? WHERE MaNV = ?";
            
            PreparedStatement ps = conn.prepareStatement(upd);
 
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getSDT());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getNgaySinh());
            ps.setString(6, nv.getChucVu());
            ps.setString(7, nv.getDiaChi());
            ps.setString(8, nv.getMaNV());
            
            return ps.executeUpdate() > 0;
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<ttNhanVien> getDSNhanVien(){
        ArrayList<ttNhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM QuanLyNhanVien";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ttNhanVien nv = new ttNhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setSDT(rs.getString("SDT"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setNgaySinh(rs.getString("NgaySinh"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setDiaChi(rs.getString("DiaChi"));
                
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
