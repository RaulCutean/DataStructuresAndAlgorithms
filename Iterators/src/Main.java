import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LinkList theList = new LinkList();
        ListIterator iter1 = theList.listIterator();
        int value ;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertAfter(60);

        while(true){
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();
            switch(choice)
            {
                case 's': // show list
                    if( !theList.isEmpty() )
                        theList.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r': // reset (to first)
                    iter1.reset();
                    break;
                case 'n': // advance to next item
                    if( !theList.isEmpty() && !iter1.atEnd() )
                        iter1.nextLink();
                    else
                        System.out.println("Can’t go to next link");
                    break;
                case 'g': // get current item
                    if( !theList.isEmpty() )
                    {
                        value = iter1.getCurrent().data;
                        System.out.println("Returned " + value);
                    }
                    else
                        System.out.println("List is empty");
                    break;
                case 'b': // insert before current
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a': // insert after current
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertAfter(value);
                    break;
                case 'd': // delete current item
                    if( !theList.isEmpty() )
                    {
                        value = iter1.deleteCurent();
                        System.out.println("Deleted " + value);
                    }
                    else
                        System.out.println("Can’t delete");
                    break;
                default:
                    System.out.println("Invalid entry");
            } // end switch
        } // end while




    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar()throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}