package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class SelectionSort extends GenericAlgorithm {



    public SelectionSort() {
        super("Sorting", "description", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < b.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < b.length; j++)
                if (b[j] < b[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = b[min_idx];
            b[min_idx] = b[i];
            b[i] = temp;
        }
    }
}
