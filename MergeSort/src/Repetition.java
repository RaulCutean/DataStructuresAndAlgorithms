import java.util.Random;

public class Repetition {

    public static void main(String[] args) {
        int maxSize = 10 ;
        int[] arr = new int[maxSize] ;

        Random rand = new Random();

        for(int i = 0 ; i < maxSize ; i++){
            arr[i] = rand.nextInt(1000);
        }
        for(int i = 0 ; i < maxSize ; i++){
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr);
        System.out.println();

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void merge(int[] arr , int[] leftHalf, int[] rightHalf) {
        int i  = 0 , j = 0 , k = 0 ;
        int leftLength = leftHalf.length ;
        int rightLength = rightHalf.length;

        while(i < leftLength && j < rightLength){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k++] = leftHalf[i++];
            }else {
                arr[k++] = rightHalf[j++];
            }

        }
        while(i < leftLength) {
            arr[k++] = leftHalf[i++];
        }
        while(j < rightLength) {
            arr[k++] = rightHalf[j++];
        }

    }

    public static void mergeSort(int[] arr) {

        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n / 2;
        int[] leftHalf = new int[mid];
        int[] rigthHalf = new int[ n - mid ];

        for(int i = 0 ; i  < mid ; i++){
            leftHalf[i] = arr[i];
        }
        for(int i = mid ; i < n ; i++) {
            rigthHalf[ i - mid] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rigthHalf);

        merge(arr , leftHalf , rigthHalf );

    }




}
