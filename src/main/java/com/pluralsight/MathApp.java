package com.pluralsight;

// Step 1
public class MathApp {
    // 1
    public static void main (String[] args) {
        double bobSalary = 676767.67;
        double garySalary = 767676.76;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
        
    // 2
        double carPrice = 45000.99;
        double truckPrice = 43000.99;
        double lowestPrice = Math.min(truckPrice, carPrice);
        System.out.println("The lowest price is: " + lowestPrice);
        
    // 3
        double radius = 7.25;
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of a circle is: " + areaOfCircle);
     // 4
        double x = 5.0;
        double squareRoot = Math.sqrt(x);
        System.out.println("The square root is: " + squareRoot);

    // 5
        double distance = Math.hypot(85 - 5, 50 - 10);
        System.out.println("The distance between these two points are: " + distance);

    // 6
        double value = -3.8;
        double absValue = Math.abs(value);
        System.out.println("The absolute value is: " + value);

    // 7
        double randomNum = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomNum);
        
    // 8
        int days = 24;
        int hoursDay = 24;
        int minutes = 60;
        int minsTotal = days * hoursDay * minutes;
        System.out.println("There are " + minsTotal + " minutes in 24 days");
    }
}
