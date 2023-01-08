public class ArrayAlgorithms {
    public
    void BubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++){
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }
    int max(int[] arr) {
        int maximum = arr[0];
        long before =System.nanoTime();
        for (int i = 1; i < arr.length; i++) {
            if (maximum < arr[i])
                maximum = arr[i];
        }
        long after =System.nanoTime();
        System.out.println("Time Taken = " +(after-before)+" ns\n");
        return maximum;
    }
    int min(int[] arr) {
        int minimum = arr[0];
        long before =System.nanoTime();
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i])
                minimum = arr[i];
        }
        long after =System.nanoTime();
        System.out.println("Time Taken = " +(after-before)+" ns\n");
        return minimum;
    }
    int binarySearch(int arr[], int key)
    {
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
        int low = 0, high = arr.length - 1;
        long before =System.nanoTime();
        while (high - low > 1) {
            int mid = (high + low) / 2;
            if (arr[mid] < key)
                low = mid + 1;
            else {
                high = mid;
            }
        }
        if (arr[low] == key) {
            long after =System.nanoTime();
            System.out.println("Time Taken = " +(after-before)+" ns\n");
            return  low;
        }
        else if (arr[high] == key) {
            long after =System.nanoTime();
            System.out.println("Time Taken = " +(after-before)+" ns\n");
            return  high;
        }
        else {
            long after =System.nanoTime();
            System.out.println("Time Taken = " +(after-before)+" ns\n");
            return -1;
        }
    }
}