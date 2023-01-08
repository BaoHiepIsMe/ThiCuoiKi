 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import DatabaseConnect.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author hiep1
 */
public class KhachHangDao {
    public KhachHang checkLogin(String sodienthoai,String matkhau) throws Exception{
        String sql = " select sodienthoai, matkhau form KhachHang"
                + " where sodienthoai=? and matkhau=?";
        try(
               Connection con = DatabaseHelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, sodienthoai);
            pstmt.setString(2, matkhau);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    KhachHang kh = new KhachHang();
                    kh.setSodienthoai(sodienthoai);
                    return kh;
                    
                }
                    
            }
            
        }
        return null;
    }
}
