package de.telran;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class NameFilter {

    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan","Maria","Stephan","John","Amalia");

        List<String> strings = filterNames(list);

        System.out.println(strings);

    }

    public static List<String> filterNames(List<String> list) {
        List<String> tmp  = new ArrayList<>();
        for(int i = 0; i < list.size();i++) {
            if(list.get(i).length()!=4) {
                tmp.add(list.get(i));
            }

        }
        return tmp;

    }

}