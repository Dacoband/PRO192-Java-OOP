
package models;


public class Staff {
    private String StaffId;
    private String name;
    private String address;
    private String phone;

    public Staff(String StaffId, String name, String address, String phone) {
        this.StaffId = StaffId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
