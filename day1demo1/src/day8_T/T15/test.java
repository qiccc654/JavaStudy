package day8_T.T15;
import java.util.*;
/*
* treeMap如果自定义类比较只能自然比较,通过自定义继承comparable接口,重写compareTo方法来比较
* 否则第一个键类型不能为自定义类
* */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Student15, Integer> hash = new TreeMap<>();
        while (true){
            String s = sc.nextLine();
            if ("quit".equals(s))break;
            String[] split = s.split("\\$");
            Student15 stu = new Student15(Integer.parseInt(split[0]), split[1], Double.parseDouble(split[2]));
            hash.put(stu,stu.getId());
        }
/*
1$m$88.4
2$a$44.7
3$c$55.3
4$f$88.4
*/
        System.out.println(hash);
    }
}
