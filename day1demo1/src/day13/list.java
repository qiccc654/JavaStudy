package day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> c = new ArrayList<>();
        Class<? extends List> List = c.getClass();
        Method method = List.getMethod("add", Object.class);
        method.invoke(c,"hello");
        method.invoke(c,1111);
        method.invoke(c,22.0);
        System.out.println(c);
    }
}
