
package slot10.pkg11.inheritance;


public class Rectangle {
    private int length  ;
    private int width ;

    public Rectangle() {
        length = 0;
        width = 0;
    }
    public Rectangle(int l, int w){
        length = l>0 ? l : 0;
        width = w>0 ? w : 0 ;
    }
    @Override
    public String toString() {
        return "[" + getLength()  + "," + getWidth() + "]}";
    }
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        int l = this.getLength();
        int w= this.getWidth();
        return l*w;  
    }
    
    
}
