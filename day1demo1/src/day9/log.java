package day9;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface log {
    String value() default "默认";
    int id() default 0;
    String[] names() default {};
}
