package ru.java_lessons.lesson15;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NewAnnotation {
    String name() default "n/a";
    int age() default 0;
}
