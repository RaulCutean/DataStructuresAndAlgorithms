import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random() ;
        int[] arr = new int[100000000];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = random.nextInt(10000) ;
        }
//        System.out.print("Before: ");
//        display(arr);
        quicksort(arr) ;
//        System.out.print("\nAfter: ");
//        display(arr);

    }
    private static void quicksort(int[] arr) {
        quicksort(arr , 0 , arr.length - 1);
    }
    private static void quicksort(int[] arr , int lowerBound , int upperBound) {
        if(lowerBound >= upperBound) {
            return ;
        }
        int pivotIndex = new Random().nextInt(upperBound - lowerBound) + lowerBound ;
        int pivot = arr[pivotIndex];
        swap(arr , pivotIndex , upperBound) ;
        int left = partition(arr , lowerBound , upperBound , pivot);

        quicksort(arr , lowerBound , left - 1);
        quicksort(arr , left + 1 , upperBound);
    }
    private static int partition(int[] arr , int lowerBound , int upperBound , int pivot) {
        int left = lowerBound;
        int right = upperBound ;
        while(left < right) {
            while(arr[left] <= pivot && left < right) {
                left++;
            }
            while(arr[right] >= pivot && left < right) {
                right-- ;
            }
            swap(arr , left , right);

        }
        swap(arr , left , upperBound);

        return left;
    }

    private static void display(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    private static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}