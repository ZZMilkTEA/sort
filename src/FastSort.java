public class FastSort extends AbstractSort {

    @Override
    public void sort() {
        fastSort(sortArray, 0, sortArray.length - 1);
    }
    private int[] fastSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            fastSort(arr, left, partitionIndex - 1);
            fastSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition (int[] arr,int left,int right){
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
