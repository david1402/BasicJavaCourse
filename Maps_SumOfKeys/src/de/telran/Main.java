package de.telran;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("a", "Hi");
        m1.put("b", "There");
        String[] str = {"a", "b", "f", "c", "d", "e", "c", "f"};

        System.out.println(getAB(m1));
        System.out.println(get(str));
    }

    public static Map<String, String> getAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    public static Map<String, Boolean> get (String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if(map.containsKey(strings[i])==false) {
                map.put(strings[i], false);
            }
            else {
                map.put(strings[i], true);
            }
        }
        return map;
    }

    public static Map<String, Boolean> get2 (String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if(map.containsKey(s)==false) {
                map.put(s, false);
            }
            else {
                map.put(s, true);
            }
        }
        return map;
    }
    public static Map<String, Boolean> get3 (String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if(!map.containsKey(s)) {
                map.put(s, false);
            }
            else {
                map.put(s, true);
            }
        }
        return map;
    }
}
