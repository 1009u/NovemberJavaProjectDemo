package scannerDemos;

import java.util.Scanner;

public class ScannerSurveyApp {
    public static void main(String[] args) {
        System.out.println("Please Take Survey : What kind Weather do you like most ? ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter 1 for Winter, 2 for Summer , 3 for Rainy Season , 4 for Autumn..");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Lovely You Like Winter. Thanks for Vote.");
                break;

            case 2:
                System.out.println("Lovely You Like Summer. Thanks for Vote.");
                break;

            case 3:
                System.out.println("Lovely You Like Rainy. Thanks for Vote.");
                break;

            case 4:
                System.out.println("Lovely You Like Autumn. Thanks for Vote.");
                break;
            default:
                System.out.println("You are out of Survey. Please Enter");
        }
    }
}
