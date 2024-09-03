import javax.swing.*;

public class HighArray {

  private  int _nElements;
  private  long[] arr ;


    public HighArray(int size) {
        arr = new long[size];
        _nElements = 0;
    }

    public void insert2(long value) {
        arr[_nElements] = value;
        _nElements++;
    }


    public int size() {
        return _nElements;

    }

    public void display() {
        for (int i = 0 ; i < _nElements ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public int bSearch(int searchKey) {
        int upperBound = _nElements - 1;
        int lowerBound = 0;
        int currIndex;

        while(lowerBound <= upperBound) {

            currIndex = (lowerBound + upperBound) / 2;
            if(arr[currIndex] == searchKey) {
                System.out.print("Found Element at index " + currIndex + " ");
                System.out.println(" ");
                return 0;
            }

            if(arr[currIndex] < searchKey) {
                lowerBound = currIndex + 1;
            }
            else{
                upperBound = currIndex - 1 ;
            }

        }
        System.out.println("Didn't find element");
        return 0 ;
    }
    public boolean find(long value) {
        int lowerBound = 0;
        int upperBound = _nElements - 1 ;
        int curIndex;

        while(lowerBound <= upperBound) {
            curIndex = (lowerBound + upperBound) / 2 ;
            System.out.println("Current index: " + curIndex);
            if(arr[curIndex] == value) {
                return true;
            }
            if(arr[curIndex] < value) {
                upperBound = curIndex -1;
                System.out.println("Current lowerBound: " + lowerBound);
            }
            else {
                lowerBound = curIndex + 1;
                System.out.println("Current upperBound: " + upperBound);
            }
        }

        return false ;



    }
    public boolean deleteBinary(long value) {
        int lowerBound = 0;
        int upperBound = _nElements - 1 ;
        int curIndex;

        while(lowerBound <= upperBound) {
            curIndex = (lowerBound + upperBound) / 2 ;

            if(arr[curIndex] == value) {
                for(int i = curIndex ; i < _nElements-1 ; i++) {
                    arr[i] = arr[i+1] ;
                }
            }
            if(arr[curIndex] < value ) {
                upperBound = curIndex -1;
            }
            else {
                lowerBound = curIndex + 1;
            }

        }
        _nElements--;
        return true;


    }


    public boolean delete(long value) {
        for(int i = 0; i < _nElements ; i++){
            if(arr[i] == value && i != _nElements-1) {
                for(int j = i ; j < _nElements - 1; j++) {
                    arr[j] = arr[j+1];
                }
            }

        }
        _nElements--;
        for(int i = 0 ; i < _nElements ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        return true;
    }
    public void insertBinary(long value ) {
        int lowerBound = 0;
        int upperBound = _nElements - 1;
        int curIndex = (lowerBound + upperBound) / 2  ;
        int j ;

        if(_nElements == 0) {
            arr[curIndex] = value;
            _nElements++;
        }

        while(lowerBound <= upperBound) {
            curIndex = (lowerBound + upperBound) / 2 ;

            if(arr[curIndex] > value) {
                for(j = _nElements ; j > curIndex ; j--) {
                    arr[j] = arr[j-1];
                }
                break;
            }
            if(arr[curIndex] < value) {
                lowerBound = curIndex + 1;
            }
            else {
                upperBound = curIndex - 1;
            }


        }
        if(_nElements != 0){
            arr[curIndex] = value;
            _nElements++;
        }



    }

    public void swap(int i , int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void BubbleSort() {

        boolean swapped = false;
        int i = 0 ;
        do {
            swapped = false;
            for(int j = 0 ;  j < (_nElements - i - 1) ; j++) {
                if(arr[j] < arr[j+1]) {
                    swap(j, j+1);
                    swapped = true;
                }
            }
            i++;
        }while(swapped);

    }




        public void insert(long value) {
        int j ;

        for( j = 0 ; j < _nElements ; j++) {
            if(arr[j] > value ) {
                for(int k = _nElements  ; k > j ; k--) {
                    arr[k] = arr[k-1];
                }
                break;
            }


        }
        arr[j] = value ;
        _nElements++;

    }

    public long getMax() {
        long max = Integer.MIN_VALUE;
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0 ; i < _nElements ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int found = 0 ;
        for(int i = 0 ; i < _nElements ; i++) {
            if(arr[i] == max) {
                found = 1;
                for(int j = i ; j < _nElements-1; j++){
                    arr[j] = arr[j+1];
                }
            }
            if(found == 1 || (i == _nElements - 1 && found == 0)){
                _nElements--;
            }
        }

        return max;
    }

}





















