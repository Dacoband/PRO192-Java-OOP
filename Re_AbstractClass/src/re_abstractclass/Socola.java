
package re_abstractclass;
class Socola extends MatHang {
    private String mMauSac;
    private String mDonViTinh;

    public Socola(String maHang, String tenHang, float donGia, int soLuong, String mauSac, String donViTinh) {
        mMaHang = maHang;
        mTenHang = tenHang;
        mDonGia = donGia;
        mSoLuong = soLuong;
        mMauSac = mauSac;
        mDonViTinh = donViTinh;
    }

    public String getMauSac() {
        return mMauSac;
    }

    public void setMauSac(String mauSac) {
        mMauSac = mauSac;
    }

    public String getDonViTinh() {
        return mDonViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        mDonViTinh = donViTinh;
    }

    @Override
    public float ThanhTien() {
        return mDonGia * mSoLuong;
    }

    @Override
    public void XemChiTiet() {
        System.out.println("Mã hàng: " + mMaHang);
        System.out.println("Tên hàng: " + mTenHang);
        System.out.println("Đơn giá: " + mDonGia);
        System.out.println("Số lượng: " + mSoLuong);
        System.out.println("Màu sắc: " + mMauSac);
        System.out.println("Đơn vị tính: " + mDonViTinh);
        System.out.println("Thành tiền: " + ThanhTien());
    }
}