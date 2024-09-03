public class Person {

    private String _lastName;
    private String _firstName;
    private int _age;


    public Person(String lastName , String firstName , int age) {
        _lastName  = lastName;
        _firstName  = firstName;
        _age     = age;
    }
    public void display() {
        System.out.print("   Last name: " + _lastName);
        System.out.print(",   First name: " + _firstName);
        System.out.println(",   Age: " + _age);
    }
    public String getLastName() {
        return _lastName;
    }

}
