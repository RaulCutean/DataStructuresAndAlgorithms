import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input ;

        while(true){
            System.out.print("Enter a string that you want reversed(press enter to exit): ");

            input = scanner.nextLine();
            System.out.println("");
            if(input.equals("")){
                break;
            }


            Reverser reverser = new Reverser(input);
            String output = reverser.reverseStack();
            System.out.println("Reversed string: " + output);
        }








    }
}