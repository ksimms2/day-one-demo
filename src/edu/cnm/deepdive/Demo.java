package edu.cnm.deepdive;

import java.lang.*;


public class Demo {


  public static void main(String[] args) {

    System.out.println("Hello, World!"); //system is the name of the class, out is an object in system, println is a method

    // green triangle to program is an entry point of the code, can run triangle separately

    long msSinceStartOfTime =  System.currentTimeMillis();
    double secondsSinceStartOfTime = msSinceStartOfTime / 1000.0; // literal int value with floating point(decimal)
    long truncated = (long) secondsSinceStartOfTime; // cast
    long rounded = Math.round(secondsSinceStartOfTime); //class is upper camel case



    System.out.println(secondsSinceStartOfTime);
    System.out.println(truncated);
    System.out.println(rounded);
  }
}
