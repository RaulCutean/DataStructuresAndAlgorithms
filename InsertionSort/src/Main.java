public class Main {

    public static void main(String[] args) {
        int maxSize = 100 ;

        ArrObj persons = new ArrObj(maxSize);

        persons.insertPerson("Mondek" , "Raul" , 19);
        persons.insertPerson("Simon"  , "Daria" , 19);
        persons.insertPerson("Chirila" , "Andrei" , 19);
        persons.insertPerson( " Catana" , "Rares" , 19);
        persons.insertPerson( "Popa" , "David", 17);
        persons.insertPerson("Tomoiaga" , "Rares" , 20);

        persons.Display();
        System.out.println("");

        persons.insertionSort();

        persons.Display();

    }
}