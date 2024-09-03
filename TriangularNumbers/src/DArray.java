//public class DArray {
//    private int[] arr ;
//    private int nElements ;
//
//    public DArray(int maxSize) {
//        arr = new int[maxSize];
//        nElements = 0;
//    }
//    public void insert(int value){
//        arr[nElements++] = value;
//    }
//    public void diplay() {
//        for(int i = 0; i < nElements; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public void mergeSort() {
//        int[] workSpace = new int[nElements];
//        recMergeSort(workSpace , 0 , nElements - 1);
//    }
//    private void recMergeSort(int[] workSpace, int lowerBound, int uppperBound) {
//        if(lowerBound == uppperBound) {
//            return;
//        }
//        else {
//            int mid = lowerBound + (uppperBound - lowerBound)/2;
//
//            recMergeSort(workSpace, lowerBound, mid);
//
//            recMergeSort(workSpace, mid + 1, uppperBound);
//
//            merge(workspace , lowerBound , mid + 1 , uppperBound )
//        }
//    }
//    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
//        int j = 0 ;
//        int lowerBound = lowPtr;
//        int mid = highPtr - 1;
//        int n = upperBound - lowerBound + 1;
//
//        while(lowPtr <= mid && highPtr <= upperBound) {
//            if(arr[lowPtr] < arr[highPtr])
//        }
//    }
//}
