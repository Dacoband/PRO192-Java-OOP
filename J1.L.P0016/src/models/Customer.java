
package models;


public class Customer {
    private String CustomerId;
    private String name;
    private String address;
    private String phone;

    public Customer(String CustomerId, String name, String address, String phone) {
        this.CustomerId = CustomerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
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
