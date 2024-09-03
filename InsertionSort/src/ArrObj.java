public class ArrObj {

    private Person[] arr;
    private int nElements ;

    public ArrObj(int maxSize) {

        arr = new Person[maxSize];
        nElements = 0;

    }

    public void insertPerson(String lastName, String firstName, int age) {

        arr[nElements] = new Person(lastName, firstName, age);
        nElements++;
    }

    public void Display() {

        for(int i = 0 ; i < nElements ; i++) {

            arr[i].displayPerson();
            System.out.println(" ");

        }
    }
    void insertionSort() {
        Person key;
        for(int i = 1 ; i < nElements ; i++) {

            key = arr[i];
            int j  = i;

            while(j > 0 && key.getFirstName().compareTo(arr[j-1].getFirstName()) < 0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }

        }
    }



