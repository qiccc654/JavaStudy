package day14;
/*
* 使用反射对类文件的私有方法进行设置操作
* */
import javax.naming.Name;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Teacher t1 = new Teacher();
        Class<? extends Teacher> aClass = t1.getClass();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(t1,"tom");
        System.out.println(t1);

        Class<?> ac = Class.forName("day14.Teacher");
       // Class<? extends Teacher> ac = new Teacher().getClass();
        // Constructor<?>[] dc = ac.getDeclaredConstructors();
        Constructor<?> dc = ac.getDeclaredConstructor(String.class, int.class, int.class);
        dc.setAccessible(true);
        Teacher teacher = (Teacher) dc.newInstance("lisi", 11, 33);
        System.out.println(teacher);


    }
}
