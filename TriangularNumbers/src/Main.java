import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int number ;
    public static void main(String[] args) throws IOException {

        System.out.print("Enter a positive integer: ");
        number = getInt();
        int answer = factorial(number);
        System.out.println("Triangular number is: " + answer);
    }
    public static int triangle(int n) {
        System.out.println("Entering: n= " + n);
        if(n== 0){
            System.out.println("Returning: 1");
            return 1;
        }
        else {
            int temp = n + triangle(n-1);
            System.out.println("Returning: " + temp);
            return temp;
        }
    }
    public static int factorial(int n) {
        System.out.println("Entering: n= " + n);
        if(n == 1){
            System.out.println("Returning: 1");
            return 1;
        }else {
            int temp = n * factorial(n-1);
            System.out.println("Returning: " + temp);
            return temp;
        }
    }
//    public static void doAnagrams(int size) {
//        if(size == 1) {
//            return;
//        }
//        for(int i = 0 ; i< size ; i++) {
//            doAnagrams(size - 1);
//            if(size == 2)
//                displayWord();
//            rotate(size);
//        }
//    }


    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}