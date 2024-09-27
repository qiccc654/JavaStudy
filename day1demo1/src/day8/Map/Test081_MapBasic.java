package day8.Map;

import sun.applet.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test081_MapBasic {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //注意，使用put方法添加键值对
        map.put(1, "zs");
        map.put(5, "zs");
        map.put(2, "ls");
        map.put(4, "rose");
        map.put(3, "jack");
        map.put(2, "lucy"); //lucy 会把 ls覆盖掉
        //2.输出集合元素个数
        System.out.println(map);

        //3.判断key和value是否存在
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("zs"));
        //4.根据key获取value
        System.out.println(map.get(4));
        //5.根据key删除键值对
        System.out.println(map.remove(3, "jack"));
        System.out.println(map);

        //遍历集合
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = integers.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("----------------");
        entries.forEach(key -> {
            System.out.println(key);
        });


    }
}
