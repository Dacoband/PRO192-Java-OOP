package boxPkg;
import rectPkg.Rectangle;
public class Box extends Rectangle{
        int height ;
        protected int price;
        int weight;
        int volumn(){
            return length*width*height;
        }

    void setSize(int l, int w, int h) {
        super.setSize(l,w);
        
    }
    int volume()
    {
        return length*width*height;
    }
}
