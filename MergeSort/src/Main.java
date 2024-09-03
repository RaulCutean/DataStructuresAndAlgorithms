import java.util.Random;



public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Before sorting : ");
       // printArray(arr);

       mergeSort(arr);

        System.out.println("After sorting : ");
       // printArray(arr);

    }
    private static void merge(int[] arr , int[] leftHalf , int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0 , j = 0  , k = 0;
        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]) {
                arr[k++] = leftHalf[i++];
            }else {
                arr[k++] = rightHalf[j++];
            }
        }
        while(i < leftSize) {
            arr[k++] = leftHalf[i++];
        }

        while(j < rightSize) {
            arr[k++] = rightHalf[j++];
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n < 2){
            return ;
        }
        int mid = n/2;
        int[] leftHalf = new int[mid];
        int[] rigthHalf = new int[n - mid];

        for(int i = 0 ; i < mid ; i++) {
            leftHalf[i] = arr[i];
        }
        for(int i = mid ; i < n ; i++) {
            rigthHalf[i - mid] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rigthHalf);

        merge( arr , leftHalf , rigthHalf);


    }


    private static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}