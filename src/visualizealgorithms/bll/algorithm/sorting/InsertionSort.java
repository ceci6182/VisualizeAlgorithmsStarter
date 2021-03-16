package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;
import visualizealgorithms.bll.algorithm.IAlgorithm;

public class InsertionSort extends GenericAlgorithm {

    public InsertionSort() {
        super("InsertionSort", "description", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();
        for (int i = 1; i < b.length; ++i) {
            int key = b[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && b[j] > key) {
                b[j + 1] = b[j];
                j = j - 1;
            }
            b[j + 1] = key;
        }
    }
}
