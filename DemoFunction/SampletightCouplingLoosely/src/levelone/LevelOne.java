package levelone;
/**
 *
 * @author Sword Lake
 */
class BubbleSortAlgorithm{
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
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
    public VeryComplexService(){
    }
    public void complexBusiness(int array[]){
        bubbleSortAlgorithm.sort(array);
        // TODO: more logic here
    }
}
//-----------------------------------------------------------------------------
public class LevelOne {
    public static void main(String[] args) {
        VeryComplexService service = new VeryComplexService();
        int[]  a = {1,2,3};
        service.complexBusiness(a);
    }
}
