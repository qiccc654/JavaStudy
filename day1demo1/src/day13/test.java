package day13;

import day5.T.T12.Student;

import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Student s = new Student();
        Class<? extends Student> clazz = s.getClass();
       // Class<?> c = Class.forName("day13/Student");
        Method getName = clazz.getMethod("getName");

    }
}
