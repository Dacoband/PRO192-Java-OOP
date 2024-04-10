
package collectiondemo;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Vector v = new Vector();
        Random rd = new Random();
        for (int i = 0; i <= 10; i++) {
            ar.add(rd.nextInt(30));
            v.add(rd.nextInt(30));
        }
        /*for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i)+ " ");
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i)+ " ");
        }*/
        //or using Iteractor
        Iterator iter1 = ar.iterator();
        while(iter1.hasNext()){
            System.out.println("["+iter1.next()+ "]");
        }
        Iterator iter2 = v.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
        //System.out.println("ar = "+ ar);
        //System.out.println("v = "+ v);
        // tra ve true neu 2 tap hop khong co phan tu chung
        boolean dis= Collections.disjoint(ar, v);
        System.out.println("ar and v disjunct: "+dis);
        
        Collections.addAll(v, ar.toArray());
        System.out.println("After adding , v = "+v);
        // tim Min Max
        int minVal = (int)Collections.min(v);
        int maxVal = (int)Collections.max(v);
        System.out.println("Min = "+ minVal+"Max = "+maxVal);
        
        int fre = Collections.frequency(v, 8);
        System.out.println("Occurences of 8 : "+fre);
        
        Collections.sort(v);
        System.out.println("After sorting : "+v);
        
        int pos = Collections.binarySearch(v, 8);
        System.out.println("Position of 8 : " + pos);
        
        Collections.shuffle(v);
        System.out.println("After shuffering, v = "+v);
        
        Collections.fill(v, 9);
        System.out.println("After replacing, v = "+v);
    }
    
}
