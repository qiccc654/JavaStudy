package day10;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws Exception {
        method1("ss");
    }

public static Void method1(String name) throws Exception {
    if (name.equals("io")) {
        throw new IOException();
    }
    if (name.equals("sql")) {
        throw new SQLException();
    }
    if (name.equals("class")) {
        throw new ClassCastException();
    }

    return null;
}
}