package day8_T;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T13 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("香蕉",5.6);
        map.put("樱桃",25.0);
        map.put("桃子",5.6);
        map.put("苹果",2.3);
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s+map.get(s));
        }
        map.put("香蕉",10.9);
        map.remove("桃子");
        System.out.println("---------entrySet");
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry);
        }
    }
}
