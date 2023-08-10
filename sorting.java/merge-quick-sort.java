------------------------------------------------ Merge Sort ----------------------------------------------------------------
public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// output --->
// Original Array:
// 6 3 9 5 2 8 
// Sorted Array:
// 2 3 5 6 8 9 
----------------------------------------------------------------------------------------------------------------------------
------------------------------------------------ Quick Sort ----------------------------------------------------------------
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// output --->
// Original Array:
// 6 3 9 5 2 8 
// Sorted Array:
// 2 3 5 6 8 9 
-----------------------------------------------------------------------------------------------------------------------
------------------------------------------ -------Differnce -----------------------------------------------------------
Quick Sort and Merge Sort are both popular sorting algorithms, but they have different approaches and characteristics. Here's a comparison of the two algorithms:

1. Approach:
Quick Sort: It is a divide-and-conquer algorithm that works by selecting a "pivot" element and partitioning the array into two sub-arrays - elements less than the pivot and elements greater than the pivot. The sub-arrays are then recursively sorted.
Merge Sort: It is also a divide-and-conquer algorithm that divides the array into two halves, recursively sorts each half, and then merges the two sorted halves back together.
    
2. Time Complexity:
Quick Sort: On average, Quick Sort has a time complexity of O(n log n), but it can degrade to O(n^2) in the worst case (e.g., when the array is already sorted or nearly sorted). However, efficient pivot selection methods can significantly reduce the chance of worst-case behavior.
Merge Sort: Merge Sort has a consistent time complexity of O(n log n) in all cases, making it a more reliable choice when worst-case behavior is a concern.

3. Space Complexity:
Quick Sort: Quick Sort is an in-place sorting algorithm, meaning it doesn't require additional memory proportional to the input size. However, the recursive stack can lead to additional memory usage.
Merge Sort: Merge Sort requires additional memory proportional to the input size, as it creates temporary arrays for merging. This can be a concern for large datasets.
 
 4. Stability:
Quick Sort: By default, Quick Sort is not stable, meaning the relative order of equal elements may change after sorting.
Merge Sort: Merge Sort is stable, so the relative order of equal elements remains the same.

5. Partitioning:
Quick Sort: The partitioning step in Quick Sort involves selecting a pivot and rearranging elements around it. This can lead to better cache locality and potentially faster performance on some architectures.
Merge Sort: Merge Sort always divides the array into two equal halves and then merges them. The merging step involves copying elements from both halves to temporary arrays before combining them.

6. Use Cases:
Quick Sort: Quick Sort is often preferred when space is a concern or when average-case performance matters more than worst-case behavior. It's also commonly used in programming languages' built-in sorting functions.
Merge Sort: Merge Sort is useful when worst-case behavior is a concern and when additional memory usage is not an issue. It's commonly used for external sorting (sorting data that doesn't fit into memory) and in stable sorting requirements.
In summary, Quick Sort is generally faster in practice due to its efficient partitioning and cache-friendly behavior, but its worst-case time complexity can be a drawback. Merge Sort is more reliable in terms of worst-case behavior and is preferred when stability and predictability are important. The choice between the two depends on the specific requirements of the problem and the characteristics of the input data.
