import java.util.Scanner;

public class Main {
    //Bob has a lawn service business. Bob estimates that he can mow 40 sq yard of lawn in 2 minutes.
    // Write a program that allow Bob to enter the length and width of a lawn. The program should then compute the square yardage and the time it will take to mow it.
    // Display the length, width, square yardage, and the amount of time to mow it.
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);
        //double length;
       // double width;
       // double squareYardage;
       // double time;
        System.out.println("Enter the length");
        int userLength = sca.nextInt();
        System.out.println("Enter the width");
        int userWidth = sca.nextInt();

        int userArea = calculateArea( userLength, userWidth);
        System.out.println("User area: " + userArea );
        double userTime = calculateTime(userArea);
        System.out.println("User time: " + userTime);

    }
    public static int calculateArea(int length,int width) {
        //name your mathod name meaningful
        //it is the same as main method and instid of the void you put what you wnat to display
        int  lawnArea = (length * width);
        return lawnArea;

    }
    public static double calculateTime(double lawnArea ) {
        double mowingTime = (lawnArea  / 40) * 2;
        return  mowingTime;

    }

    }
