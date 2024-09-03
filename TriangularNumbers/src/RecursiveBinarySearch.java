import java.util.ArrayList;
import java.util.List;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3,  4, 5 ,6 ,7 ,8 };

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int length = list.size();
        int lowerBound = 0;
        int upperBound = length - 1;
        int key = list.get(4);

        System.out.println(recursiveBinarySearch(lowerBound, upperBound, key ,arr));


    }

//    public static int find(ArrayList<Integer> list , int key) {
//        int lowerBound = 0;
//        int upperBound = list.size() - 1;
//
//        while (lowerBound <= upperBound) {
//            int mid = lowerBound + (upperBound - lowerBound) / 2;
//            if(list.get(mid) == key) {
//                return mid;
//            }
//            if(list.get(mid) < key){
//                lowerBound = mid + 1;
//            }else {
//                upperBound = mid - 1;
//            }
//
//        }
//        return -1;
//    }
    public static int recursiveBinarySearch(int lowerBound , int upperBound , int key , int[] arr) {
        int mid = lowerBound + (upperBound - lowerBound) / 2;

        if(arr[mid] == key){
            return arr[mid];
        }
        if(lowerBound > upperBound){
            return -1;
        }
        if(arr[mid] > key){
            return recursiveBinarySearch(lowerBound , mid - 1 , key , arr);
        }
        else {
            return recursiveBinarySearch(mid + 1 , upperBound , key , arr);
        }
    }

}



