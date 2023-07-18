package com.skillsoft.reflection;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

//        System.out.println("******* Application class loader");
//
//        ClassLoader applicationClassLoader = Employee.class.getClassLoader();
//        System.out.println("Application class loader: " + applicationClassLoader);
//
//        applicationClassLoader.loadClass("com.skillsoft.reflection.Department");

        System.out.println("******* Application and platform class loader");

        ClassLoader applicationClassLoader = Employee.class.getClassLoader();
        System.out.println("Application class loader: " + applicationClassLoader);

        ClassLoader platformClassLoader = applicationClassLoader.getParent();
        System.out.println("Platform class loader: " + platformClassLoader);

        System.out.println();

        System.out.println("******* Loading an application class");

        Class<?> someApplicationClass = applicationClassLoader.loadClass("org.json.JSONObject");
        System.out.println("JSONObject: " + someApplicationClass);

        System.out.println();

//        someApplicationClass = platformClassLoader.loadClass("org.json.JSONObject");
//        System.out.println("JSONObject: " + someApplicationClass);
//
//        System.out.println();

        System.out.println("**** Loading a platform class");

        Class<?> somePlatformClass = platformClassLoader.loadClass("java.sql.ResultSet");
        System.out.println("ResultSet (using platform class loader): " + somePlatformClass);

        System.out.println();

        somePlatformClass = applicationClassLoader.loadClass("java.sql.ResultSet");
        System.out.println("ResultSet (using application class loader): " + somePlatformClass);

        System.out.println();

    }
}

// https://docs.oracle.com/javase/9/docs/api/java/lang/ClassLoader.html
// Java docs for java.lang.ClassLoader