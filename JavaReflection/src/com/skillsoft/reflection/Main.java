package com.skillsoft.reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    private final static String filePath =
            "/Users/juan/code/skillsoft/java-novice-to-javanista/track-1-java-novice/mapping-relationships-in-java-working-with-interfaces-and-class-loaders/JavaReflection/outside_project/";

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println("******* load files from outside the project");

        ClassLoader customClassLoader = new FileSystemClassLoader(filePath);

        Class<?> studentClass = customClassLoader.loadClass("com.skillsoft.university.Student");
        System.out.println(studentClass);

        System.out.println();

        System.out.println("**** instantiate Student object not referenced by the project");

        Object student = studentClass.getConstructor(String.class, String.class, String.class)
                .newInstance("Janice", "Columbia", "Computer Science");

        System.out.println(student);

        System.out.println();

        System.out.println("**** instantiate Course object not referenced by the project");

        Class<?> courseClass = customClassLoader.loadClass("com.skillsoft.university.Course");
        System.out.println(courseClass);

        Object course = courseClass.getConstructor(String.class, String.class)
                .newInstance("Data Structures and Algorithms", "Computer Science");

        System.out.println(course);

        System.out.println();
    }
}

// https://docs.oracle.com/javase/9/docs/api/java/lang/ClassLoader.html
// Java docs for java.lang.ClassLoader