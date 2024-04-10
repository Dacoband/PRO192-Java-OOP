package levelthree;

/**
 *
 * @author Sword Lake
 */
interface SortAlgorithm {
       public void sort(int array[]);
}
//-----------------------------------------------------------------------------
class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        // TODO: Add your logic here
        System.out.println("Đã sắp xếp bằng thuật toán  BubbleSort");
        for (int item : array) {
            System.out.format("%5d",item);
        }
        System.out.println("");
    }
}
//-----------------------------------------------------------------------------
class SelectionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        // TODO: Add your logic here
          System.out.println("Đã sắp xếp bằng thuật toán SelectionSort");
        for (int item : array) {
            System.out.format("%5d",item);
        }
        System.out.println("");
    }
}
//-----------------------------------------------------------------------------
class VeryComplexService {
    private SortAlgorithm sortAlgorithm;
     public VeryComplexService(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }
    public void complexBusiness(int array[]){
        sortAlgorithm.sort(array);
        // TODO: more logic here
    }
}
//-----------------------------------------------------------------------------
public class LevelThree {
    public static void main(String[] args) {       
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm selectionSortAlgorithm = new SelectionSortAlgorithm();
        VeryComplexService service1 = new VeryComplexService(bubbleSortAlgorithm);
        VeryComplexService service2 = new VeryComplexService(selectionSortAlgorithm);
        int[]  a = {1,2,3};
        service1.complexBusiness(a);
        service2.complexBusiness(a);        
    }
}
