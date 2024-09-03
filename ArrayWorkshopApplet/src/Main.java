import java.util.Scanner;

public class Main {

     public static void display(int[] nums , int size){

        for(int i = 0 ; i < size ; i++){

            System.out.print(nums[i] + " ");

        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        display(arr , n);


        int searchKey = 4;
        for(int i = 0; i < n; i++) {
            if(arr[i] == searchKey && i != n-1){
                for(int j = i ; j < n-1; j++){
                    arr[j] = arr[j+1];
                }
                n = n-1;
            }
            if(i == n-1 && arr[i] == searchKey){
                for(int k = arr.length-1; k > 0 ; k--){
                    arr[k] = arr[k-1];
                }
            }
        }


        for(int i = 1; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");



    }
}