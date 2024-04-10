
package demoarraylist;

public class MyArrayList extends ArrayList<Product> implements IProduct {

    @Override
    public void printAllProduct() {
        for(Product p : this){
            System.out.println(p);
        }
    }

    @Override
    public void addProduct(Product p) {
        this.addProduct(p);
    }

    @Override
    public void removeProduct(Product p) {
        this.removeProduct(p);
    }

    @Override
    public Product getProductById(int id) {
        Product pro = this.stream();
        .filter(p -> p.getId() == id )
                
    }
        
}
