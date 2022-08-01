package input_and_output;

public class Person {
    public String name;
    public int age;
    public Long phoneNumber;

    public Person(String name, int age, Long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Name : "+ name +"\nAge : "+ age +"\nPhone Number : "+phoneNumber);
    }
}
