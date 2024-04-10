/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package re_abstractclass;

import java.util.Date;

abstract class Milk extends MatHang {
    private Date mNgaySanXuat;
    private Date mHanSuDung;
    private String mDonViTinh;

    public Milk(String maHang, String tenHang, float donGia, int soLuong, Date ngaySanXuat, Date hanSuDung, String donViTinh) {
        mMaHang = maHang;
        mTenHang = tenHang;
        mDonGia = donGia;
        mSoLuong = soLuong;
        mNgaySanXuat = ngaySanXuat;
        mHanSuDung = hanSuDung;
        mDonViTinh = donViTinh;
    }

    public Date getmNgaySanXuat() {
        return mNgaySanXuat;
    }

    public void setmNgaySanXuat(Date mNgaySanXuat) {
        this.mNgaySanXuat = mNgaySanXuat;
    }

    public Date getmHanSuDung() {
        return mHanSuDung;
    }

    public void setmHanSuDung(Date mHanSuDung) {
        this.mHanSuDung = mHanSuDung;
    }

    public String getmDonViTinh() {
        return mDonViTinh;
    }

    public void setmDonViTinh(String mDonViTinh) {
        this.mDonViTinh = mDonViTinh;
    }

    @Override
    public abstract void XemChiTiet();

    @Override
    public abstract float ThanhTien();

    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getSoLuong() {
        return super.getSoLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDonGia(float donGia) {
        super.setDonGia(donGia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public float getDonGia() {
        return super.getDonGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTenHang(String tenHang) {
        super.setTenHang(tenHang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTenHang() {
        return super.getTenHang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMaHang(String maHang) {
        super.setMaHang(maHang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMaHang() {
        return super.getMaHang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}


    

    

    