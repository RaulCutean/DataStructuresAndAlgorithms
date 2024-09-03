import java.util.Scanner;

//LOW ARR APP
public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nElems = 0;
        LowArray arr = new LowArray(100);

        arr.setElement(0, 77);
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 00);
        arr.setElement(8, 66);
        arr.setElement(9, 33);
        nElems = 10;

        for(int i = 0 ; i < nElems ; i++) {
            System.out.print(arr.getElement(i) + " ");
        }
        System.out.println(" ");

        int searchKey = 66 ;

        for(int i = 0 ; i < nElems ; i++) {
            if(arr.getElement(i) == searchKey){
                System.out.println("Found at index " + i);
                break;
            }
            if(i == nElems-1){
                System.out.println("Can't find key: " + searchKey);
            }
        }
        for(int i = 0 ; i < nElems ; i++) {
            if(arr.getElement(i) == 55){
                for(int k = i ; i < nElems -1 ; i++){
                    arr.setElement(k , arr.getElement(k+1));
                }
                nElems--;
            }
        }
        for(int i = 0 ; i < nElems ; i++) {
            System.out.print(arr.getElement(i) + " ");
        }
        System.out.println(" ");


    }

}