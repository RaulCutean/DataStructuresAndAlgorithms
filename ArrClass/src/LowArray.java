
class LowArray {


    private long[] arr ;


    public LowArray(int size) {
        arr = new long[size];
    }


    public void setElement(int index , long size){

        arr[index] = size;

    }
    public long getElement(int index) {
        return arr[index];
    }




}