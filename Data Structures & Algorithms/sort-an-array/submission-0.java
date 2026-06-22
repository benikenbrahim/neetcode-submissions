class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void quickSort(int[] arr, int bas, int haut) {
        if (bas < haut) {
            int indexPivot = partition(arr, bas, haut);
            quickSort(arr, bas, indexPivot - 1);
            quickSort(arr, indexPivot + 1, haut);
        }
    }
    private int partition(int[] arr, int bas, int haut) {
        int pivot = arr[haut];  
        int i = bas - 1; 

        for (int j = bas; j < haut; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[haut];
        arr[haut] = temp;

        return i + 1;
    }
}