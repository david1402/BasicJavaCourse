package de.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {

		populateMap();
		System.out.println("---------------------------");
		System.out.println(anagrams("anna"));

        System.out.println(getWordsCount2());

    }

    public static String[] voc = {"ivan", "piotr", "vani" , "anna","nana", "nnaa", "sasha", "sahsa"};
    public static Map<String, List<String>> map = new HashMap<>();


    public static String[] voc2 = {"ivan", "piotr", "ivan" , "anna","ivan","anna","sasha","ivan", "ivan", "ivan", "ivan", "ivan", "ivan", "ivan"};
    public static Map<String,Integer>map2 = new HashMap<>();


    public static void populateMap() {
        for (String s: voc) {
            String sorted = sortString(s);
            System.out.println(sorted);
            if(!map.containsKey(sorted)){
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(sorted, l);
            }
            else {
                List<String> list = map.get(sorted);
                list.add(s);
            }
        }
        System.out.println(map);

    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static List<String> anagrams(String s){
        String res = sortString(s);
        return map.get(res);

    }



    public static Map<String, Integer> getWordsCount1(String[] string) {
        for (String s: voc2) {
            if(!map2.containsKey(s)){

                map2.put(s, 1);
            }
            else {
                int count = map2.get(s);
                map2.put(s, count+1);
            }

        }
        return map2;
    }

    public static Map<String, Integer> getWordsCount2() {
        for (String s: voc2) {
            int count = !map2.containsKey(s) ? 1 : map2.get(s)+1;
            map2.put(s,count) ;
        }
        return map2;
    }
}
