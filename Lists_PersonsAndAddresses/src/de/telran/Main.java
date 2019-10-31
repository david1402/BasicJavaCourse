package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Bob", new Address("Firststr.", 12)));
        personList.add(new Person("Bill", new Address("Secondstr.", 3)));
        personList.add(new Person("Ivan", new Address("Thirdstr.", 44)));

        AddressSetter addressSetter = new AddressSetter();
        List<Address> addresses = addressSetter.getAddresses(personList);

        for (int i = 0; i < addresses.size(); i++) {
            System.out.println(addresses.get(i));
        }
    }
}
