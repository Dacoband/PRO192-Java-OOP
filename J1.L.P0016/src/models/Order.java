
package models;


public class Order {
    private String OrderId;
    private String date;
    private double totalPrice;
    private String FlowerIdx;

    public Order(String OrderId, String date, double totalPrice, String FlowerIdx) {
        this.OrderId = OrderId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.FlowerIdx = FlowerIdx;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFlowerIdx() {
        return FlowerIdx;
    }

    public void setFlowerIdx(String FlowerIdx) {
        this.FlowerIdx = FlowerIdx;
    }
    
    
}
