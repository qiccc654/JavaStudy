package day8_T;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 统计字符串中每个字符出现的次数，String s = "aabbddccaefdd";
* 提示：可使用Map<Character, Integer>集合，键存放字符，值存放出现的次数*/
public class T14 {
    public static void main(String[] args) {
        String s =  "aabbddccaefdd";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            /*if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else map.put(s.charAt(i),1);*/
            Integer i1 = map.containsKey(s.charAt(i)) ? map.put(s.charAt(i), map.get(s.charAt(i)) + 1) : map.put(s.charAt(i), 1);
        }

        System.out.println(map);
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry+",  ");
        }
        System.out.println("  ");
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.print(character+"="+map.get(character)+"  ");
        }


    }
}
