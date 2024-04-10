package leveltwo;


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
        System.out.println("Đã sắp xếp bằng thuật toán sắp xếp nổi bọt");
        for (int item : array) {
            System.out.format("%5d",item);
        }
        System.out.println("\n");
    }
}
//-----------------------------------------------------------------------------
class VeryComplexService {
    private SortAlgorithm sortAlgorithm;
    public VeryComplexService(){
        sortAlgorithm = new BubbleSortAlgorithm();
    }
    public void complexBusiness(int array[]){
        sortAlgorithm.sort(array);
        // TODO: more logic here
    }
}
//-----------------------------------------------------------------------------
public class LevelTwo {
    public static void main(String[] args) {
        VeryComplexService service = new VeryComplexService();
        int[]  a = {1,2,3};
        service.complexBusiness(a);
    }
}
