public class Main {
    public static void main(String[] args) {

        int[] arr = {2 , 3 ,1 , 5 ,8 , 0};
        boolean IsSwapping = true;
        int index = 0 ;
        do{

            IsSwapping = false;

            for(int i = 0 ; i < arr.length - index - 1; i++){
                if(arr[i] > arr[i+1])  {
                    swap(i , i+1 , arr);
                    IsSwapping = true;

                }

            }
            index++;

        }while(IsSwapping);

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 1 ; i  < arr.length ; i++){

            int key = arr[i];
            int j = i - 1;

            while( j >= 0 && key > arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

    public static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}