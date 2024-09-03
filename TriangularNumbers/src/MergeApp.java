public class MergeApp {

    public static void main(String[] args) {
        int[] arrA = {23 , 47 ,81 , 95};
        int[] arrB = {7 , 14 ,38 , 55 ,62 ,74};
        int[] arrC = new int[arrA.length + arrB.length];

        merge(arrA, arrA.length , arrB , arrB.length , arrC);
        display(arrC , arrC.length);






    }




    public static void merge(int[] arrA , int sizeA , int[] arrB , int sizeB , int[] arrC){
        int aDex =0 , bDex =0 , cDex =0;

        while(aDex < sizeA && bDex < sizeB){
            if(arrA[aDex] < arrB[bDex]){
                arrC[cDex++] = arrA[aDex++];
            }else {
                arrC[cDex++] = arrB[bDex++];
            }
        }
        while(aDex < sizeA){
            arrC[cDex++] = arrA[aDex++];
        }
        while(bDex < sizeB) {
            arrC[cDex++] = arrB[bDex++];
        }
    }
    public static void display(int[] arr , int size) {
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
