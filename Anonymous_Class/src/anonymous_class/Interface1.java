
package anonymous_class;


public interface Interface1 {
    void M1();
    void M2();
}
class Anonymous1{
    public static void main(String[] args) {
        Interface1 obj= new Interface1() {
            @Override
            public void M1() {
                System.out.println("M1");
            }

            
            public void M2() {
                System.out.println("M2");
            }
        };
        obj.M1();
        obj.M2();
    }
}
