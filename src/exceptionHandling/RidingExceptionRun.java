package exceptionHandling;

import java.util.Scanner;

public class RidingExceptionRun {

    public void demoCustomExp() throws RidingException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome Riding Application :");
        System.out.println("Enter Your Age :");
        int age=scanner.nextInt();
        if (age<20){
            throw new RidingException("You are not eligible for Riding.");
        }
        if (age>45){
            throw new RidingException("Your age is more than Require Criteria.");
        }
        else {
            System.out.println("Welcome You are eligible for Riding.");
        }
    }
    public static void main(String[] args) throws RidingException {
        RidingExceptionRun object=new RidingExceptionRun();
        object.demoCustomExp();

    }
}
