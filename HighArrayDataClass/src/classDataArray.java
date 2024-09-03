public class classDataArray {

    private Person[] arr;
    private int nElements;


    public classDataArray(int size) {
        arr = new Person[size];
        nElements = 0;
    }

    public void insert(String firstName, String lastName, int age) {
        arr[nElements] = new Person(firstName, lastName, age);
        nElements++;

    }

    public Person find(String searchName ) {

        for (int i = 0; i < nElements; i++) {
            if (arr[i].getLastName().equals(searchName)) {
                System.out.println("We found person at index " + i);
                return arr[i];
            }

        }
        System.out.println("We couldn't find the person that you were looking for");
        return null;
    }

    public void Display () {

        for(int i = 0 ; i < nElements ; i++) {
            arr[i].displayPerson();
        }
    }

    public void deletePerson(String searchName) {

        for(int i = 0 ; i < nElements ; i++) {
            if(arr[i].getLastName().equals(searchName) && i < nElements - 1) {
                for(int k = i ; k < nElements-1 ; k++) {
                    arr[k] = arr[k + 1];
                }
            }
        }
        nElements--;
    }


}


























