/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author hiep1
 */
public class KhachHang {
    private String hovaten;
    private String sodienthoai;
    private String matkhau;
    private String diachi;
    private String ngaysinh; 
    private String gioitinh;

    public KhachHang() {
    }

    public KhachHang(String hovaten, String sodienthoai, String matkhau, String diachi, String ngaysinh, String gioitinh) {
        this.hovaten = hovaten;
        this.sodienthoai = sodienthoai;
        this.matkhau = matkhau;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "hovaten=" + hovaten + ", sodienthoai=" + sodienthoai + ", matkhau=" + matkhau + ", diachi=" + diachi + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + '}';
    }
    
    
    
}
