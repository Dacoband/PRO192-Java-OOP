
package models;


public class Flower {
    private String FlowerId;
    private String name;
    private double unitprice;
    private String importDate;

    public Flower(String FlowerID, String name, double unitprice, String importDate) {
        this.FlowerId = FlowerID;
        this.name = name;
        this.unitprice = unitprice;
        this.importDate = importDate;
    }

    public String getFlowerID() {
        return FlowerId;
    }

    public void setFlowerID(String FlowerID) {
        this.FlowerId = FlowerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }
    
}
