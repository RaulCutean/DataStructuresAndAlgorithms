

public class Main {
    public static void main(String[] args) {

        int maxSize = 100 ;
        HighArray arr = new HighArray( maxSize);
        arr.insert(23);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(5);
        arr.insert(4);
        arr.insert(12312);
        arr.display();
        int arrLength = arr.size() - 1;
        arr.bSearch(7);
        System.out.println();

        System.out.println(arr.getMax());

        arr.display();

        HighArray arr1 = new HighArray(arrLength);

        for(int i = 0; i<arrLength; i++){
            arr1.insert2(arr.getMax());
            arr.display();
        }
        arr1.display();

        System.out.println(arr1.find(11));

        arr1.deleteBinary(1);
        arr1.display();


        HighArray arr2 = new HighArray(arrLength);

        arr2.insertBinary(4);
        arr2.insertBinary(2);
        arr2.insertBinary(123);
        arr2.insertBinary(11);
        arr2.insertBinary(23);
        arr2.BubbleSort();
        arr2.display();

    }



    }

