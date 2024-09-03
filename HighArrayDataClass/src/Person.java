public class Person {


    private String _lastName;
    private String _firstName;
    private int _age;

    public Person(String firstName, String lastName, int age) {
        _lastName = lastName;
        _firstName = firstName;
        _age = age;
    }

    public void displayPerson() {

        System.out.print("   Last Name:  " + _lastName);
        System.out.print(",   First Name:  " + _firstName);
        System.out.println(",  Age:  " + _age);
    }

    public String getLastName() {
        return _lastName;
    }


}
