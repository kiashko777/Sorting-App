package org.roman;

import java.util.Scanner;

/**
 * Simple Sorting Application
 */

class GetInputFromUser {
  public static void main(String[] args) {
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter your value: ");
    String s = in.nextLine();
    System.out.println("You entered string: " + s);

    int a = in.nextInt();
    System.out.println("You entered integer: " + a);

    float b = in.nextFloat();
    System.out.println("You entered float: " + b);

    // closing scanner
    in.close();
  }
}