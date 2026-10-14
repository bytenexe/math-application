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


    }
}
