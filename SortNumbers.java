import java.util.Arrays;

public class SortNumbers {
    
    public static void main(String[] args) {
        // Array of numbers to sort
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5, 3, 50};
        
        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        System.out.println("\nSorted array (ascending order):");
        System.out.println(Arrays.toString(numbers));
        
        // Alternative: Manual bubble sort implementation
        System.out.println("\n--- Using Bubble Sort ---");
        int[] numbers2 = {64, 34, 25, 12, 22, 11, 90, 5, 3, 50};
        bubbleSort(numbers2);
        System.out.println("Sorted array using bubble sort:");
        System.out.println(Arrays.toString(numbers2));
    }
    
    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
