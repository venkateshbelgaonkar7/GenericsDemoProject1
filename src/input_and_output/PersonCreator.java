package input_and_output;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name, age and phone number of the person");
        String name = scn.next();
        int age = scn.nextInt();
        Long phoneNumber = scn.nextLong();

        Person person1 = new Person(name, age, phoneNumber);
    }
}
