

public class Main {
    public static void main(String[] args) {

        StackX arr = new StackX(10) ;

        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(9);
        arr.push(10);

        arr.display();

        while(!arr.isEmpty()) {
            long value = arr.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");



    }
}v