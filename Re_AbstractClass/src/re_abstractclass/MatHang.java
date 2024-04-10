
package re_abstractclass;
import java.util.Date;

abstract class MatHang {
    protected String mMaHang;
    protected String mTenHang;
    protected float mDonGia;
    protected int mSoLuong;

    public String getMaHang() {
        return mMaHang;
    }

    public void setMaHang(String maHang) {
        mMaHang = maHang;
    }

    public String getTenHang() {
        return mTenHang;
    }

    public void setTenHang(String tenHang) {
        mTenHang = tenHang;
    }

    public float getDonGia() {
        return mDonGia;
    }

    public void setDonGia(float donGia) {
        mDonGia = donGia;
    }

    public int getSoLuong() {
        return mSoLuong;
    }

    public void setSoLuong(int soLuong) {
        mSoLuong = soLuong;
    }

    public abstract float ThanhTien();

    public abstract void XemChiTiet();
}

