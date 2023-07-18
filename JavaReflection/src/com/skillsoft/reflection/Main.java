package com.skillsoft.reflection;

//import java.net.http.HttpClient;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("-- System or Application class loader");
        System.out.println("Employee class loader: " + Employee.class.getClassLoader());
        System.out.println();

        System.out.println("-- Platform class loader");
        System.out.println("ResultSet class loader: " + ResultSet.class.getClassLoader());
//        System.out.println("HttpClient class loader: " + HttpClient.class.getClassLoader());
        System.out.println();

        System.out.println("--Bootstrap class loader");
        System.out.println("Math class loader: " + Math.class.getClassLoader());
        System.out.println("ArrayList class loader: " + ArrayList.class.getClassLoader());
        System.out.println();

    }
}

// https://docs.oracle.com/javase/9/docs/api/java/lang/ClassLoader.html
// Java docs for java.lang.ClassLoader