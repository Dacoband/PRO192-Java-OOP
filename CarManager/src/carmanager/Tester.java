
package carmanager;


public class Tester {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.pressStartButton();
        c1.pressAcceleratorButton();
        c1.output();


        Car c2=new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.output();
    }
}
