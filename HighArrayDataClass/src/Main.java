public class Main {
    public static void main(String[] args) {

        int maxSize = 10;
        classDataArray data = new classDataArray(maxSize);

        data.insert("Raul" , "Mondek" , 19);
        data.insert("Raul" , "Cutean" , 19);
        data.insert("Andrei" , "Chirila" , 19);
        data.insert("Rares" , "Catana" , 19);


        String searchKey = "Mondek";

        Person found ;

        found = data.find(searchKey);

        if(found != null){
            System.out.println("Found ");
            found.displayPerson();
        }
        else {
            System.out.println("Can't find" + searchKey);
        }
        System.out.println("Deleting Mondek and Cutean");
        data.deletePerson("Mondek");
        data.deletePerson("Cutean");

        data.Display();


    }
}