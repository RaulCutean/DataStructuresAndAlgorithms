import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input ;

        input = scanner.nextLine();

        BracketChecker test = new BracketChecker(input);

        test.check();



    }
}