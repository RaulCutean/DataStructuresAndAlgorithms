public class Stack {
    private int maxSize;
    private int top;
    private char[] arr;

    public Stack(int size){
        maxSize = size;
        arr = new char[maxSize];
        top = -1;
    }

    public void push(char c){
        arr[++top] = c ;
    }

    char pop(){
       return  arr[top--];
    }

   public char peek(){
        return arr[top] ;
    }

    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }



}
