package de.telran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

        private String name;
        private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

            List<Person> Person = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader (new FileReader("Person.csv"))){

                String line;
                while ((line = reader.readLine()) != null) {
                    Person.add(new Person(line.substring(0, line.indexOf(",")),
                            Integer.valueOf(line.substring(line.indexOf(",")+2))));

                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            List<de.telran.Person>pr1 =Person
                    .stream()
                    .sorted(Comparator.comparing(de.telran.Person::getAge))
                    .collect(Collectors.toList());
            System.out.println(pr1 );


            List<de.telran.Person>pr2 =Person
                    .stream()
                    .sorted(Comparator.comparing(de.telran.Person::getName))
                    .collect(Collectors.toList());
            System.out.println(pr2);

    }
}
