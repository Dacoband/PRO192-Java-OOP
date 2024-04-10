package ioc;

import java.lang.reflect.InvocationTargetException;
import javax.management.InstanceNotFoundException;

interface SortAlgorithm {
    public void sort(int array[]);
}
//-----------------------------------------------------------------------------

class BubbleSortAlgorithm implements SortAlgorithm {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(int[] array) {
        bubbleSort(array);
        // TODO: Add your logic here
        System.out.println("Using BubbleSort Algorithm !");
        for (int item : array) {
            System.out.format("%5d", item);
        }
        System.out.println("");
    }
}
//-----------------------------------------------------------------------------

class SelectionSortAlgorithm implements SortAlgorithm {

    void selectionSort(int arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    @Override
    public void sort(int[] array) {
        // TODO: Add your logic here
        selectionSort(array);
        System.out.println("Using SelectionSort Algorithm !");
        for (int item : array) {
            System.out.format("%5d", item);
        }
        System.out.println("");
    }
}
//-----------------------------------------------------------------------------

class AlgorithmService {

    private SortAlgorithm sortAlgorithm;

    public AlgorithmService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int array[]) {
        sortAlgorithm.sort(array);      
    }
}
//-----------------------------------------------------------------------------

public class UsingIoC {

    public static void main(String[] args) throws InvocationTargetException {
        try {
            SortAlgorithm sortAlgorithm = (SortAlgorithm) Injector.
                    getInstance("sortAlgorithmName");
            AlgorithmService service = new AlgorithmService(sortAlgorithm);
            //
            int[] a = {5, 1, 2, 4, 3};
            service.complexBusiness(a);
        } catch (IllegalArgumentException | NoSuchMethodException
                | InstanceNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
