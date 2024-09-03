

public class PriorityQueue {

    private int  maxSize ;
    private int[] arr;
    private int nElements ;


    public PriorityQueue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        nElements = 0;
    }

    public void insert(int key) {
        int i ;
        if( nElements == 0 ) {
            arr[nElements++] = key;
        }else{
            for(i = nElements - 1; i >= 0; i--)
            {
                if(key > arr[i]) {
                    arr[i+1] = arr[i];
                }
                else
                    break;
            }
            arr[i+1] = key;
            nElements++;
        }
    }

    public int remove() {
        return arr[--nElements];
    }
    public int peekMin() {
        return arr[nElements-1];
    }
    public boolean isEmpty() {
        return nElements == 0;
    }
    public int size() {
        return nElements-1;
    }
    public boolean isFull() {
        return nElements == maxSize;
    }


}
