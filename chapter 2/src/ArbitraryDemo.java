
public class ArbitraryDemo {
    public double sum (double... group){
        double s = 0;
        for (double x: group) s+=x;
        return s;
    }
    public String concate(String...group){
        String s="";
        for(String x: group) s+=x + " ";
        return s;
    }
    public static void main(String[] args) {
        ArbitraryDemo obj= new ArbitraryDemo();
        double total = obj.sum(5.4,3.2, 9.08, 4);
        System.out.println(total);
        String line = obj.concate("I", "love", "you", "!");
        System.out.println(line);
        
    }
}
    
