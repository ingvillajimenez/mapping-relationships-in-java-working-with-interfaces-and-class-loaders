package com.skillsoft.reflection;

import org.json.JSONObject;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

//        System.out.println("-- System or Application class loader");
//        System.out.println("JSONObject class loader: " + JSONObject.class.getClassLoader());
//        System.out.println();

//        System.out.println("****** Bootstrap root of class loader hierarchy");
//        ClassLoader bootstrapClassLoader = String.class.getClassLoader();
//        System.out.println("Bootstrap class loader: " + bootstrapClassLoader);
//
//        System.out.println();
//
//        System.out.println("****** Platform class loader hierarchy");
//        ClassLoader platformClassLoader = ResultSet.class.getClassLoader();
//        System.out.println("Platform class loader: " + platformClassLoader);
//
//        System.out.println("Platform class loader (parent): " + platformClassLoader.getParent());
//
//        System.out.println();
//
//        System.out.println("****** Application class loader hierarchy");
//        ClassLoader applicationClassLoader = Employee.class.getClassLoader();
//        System.out.println("Application class loader: " + applicationClassLoader);
//
//        System.out.println("Application class loader (parent): " +
//                applicationClassLoader.getParent());
//        System.out.println("Application class loader (parent -> parent): " +
//                applicationClassLoader.getParent().getParent());

        Class<?> someClass = Class.forName("com.skillsoft.reflection.Department",
                true, Employee.class.getClassLoader());

    }
}

// https://docs.oracle.com/javase/9/docs/api/java/lang/ClassLoader.html
// Java docs for java.lang.ClassLoader

// https://github.com/stleary/JSON-java
// URL for an external JAR file that we will try to load