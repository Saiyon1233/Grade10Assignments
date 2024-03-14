/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Saiyon Jeyakumar 
 * Class: ICS3U
 *
 * Program: Assignment 13 Question 3
 * Input: 
 *     3 - Ask user for key to clear art
 *     3 - Ask user for number
 *     4 - Ask user for coordinates
 *     5 - Ask user for numbers
 *     6 - Ask user for words
 *     9 - Ask user for numbers
 *    10 - Ask user for numbers
 * Process: 
 *     3 - The color of the art
 *     4 - Solve Distance, Slope of Line, Equation of Line and Midpoint of Line Segment
 *     5 - Determine if the first number can be divisible by the second
 *       - Find Odd or Even Numbers
 *       - Find Positive or Negative Numbers
 *       - Find the Highest Numbers
 *     6 - Find the number of vowels in the word
 *       - Group students by their first name
 *     9 - Find the sum of integers in the number
 *       - Find investment value
 *       - Find distance to nearest airports
 *    10 - Find number of numbers entered
 *       - Find the sum of the numbers entered
 *       - Find the average of the numbers entered
 * Output: 
 *     1 - ASCII art
 *     3 - Function Options
 *     4 - Print Distance, Slope of Line, Equation of Line and Midpoint of Line Segment
 *     5 - Print if the first number can be divisible by the second
 *       - Print Odd or Even Numbers
 *       - Print Positive or Negative Numbers
 *       - Print the Highest Numbers
 *     6 - Print the number of vowels in the word
 *       - Print the group the student is in
 *     9 - Print the sum of integers in the number
 *       - Print investment value
 *       - Print distance to nearest airports
 *    10 - Print number of numbers entered
 *       - Print the sum of the numbers entered
 *       - Print the average of the numbers entered
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class SuperCalculator {
    
    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Starting...");
        Console c = new Console();
        //Set color to red
        c.setTextColor(Color.RED);
        //Print ASCII art
        c.println("*********************************************************");
        c.println("**          ******* * ******* ************* *******  ****");
        c.println("****    ********** **** ****** *********** ******* ** ***");
        c.println("****    ********* ******* ***** ********* ******* **** **");
        c.println("****    *********           **** ****** *********      **");
        c.println("****    ******** ********** ***** ***** ******** ****** *");
        c.println("****    *** **** ********** ****** *** ********* ****** *");
        c.println("****        **** ********** ******* * *********  ****** *");
        c.println("*****      ***** ********** ******** *********** ****** *");
        c.println("******* *************************************************");
        //Ask user to clear the art
        c.println("Press p to clear the screen");
        char clear = c.readChar(); 
        //Clear art
        if (clear == 'p') {
            c.clear();
        }
        //Print function options
        c.println("1)Linear Equation");
        c.println("2)Boolean Logic");
        c.println("3)Number Fun");
        c.println("4)Word Math");
        c.println("5)Quadratic Equations");
        c.println("6)Statistics");
        //Ask for number
        c.println("Enter the number to activate your desired function here");
        int num = c.readInt();
        //When the user chooses linear equation
        if (num == 1) {
            //Ask user for numbers
            c.println("Enter the first x-coordinate here:");
            double x1 = c.readInt();
            c.println("Enter the first y-coordinate here:");
            double y1 = c.readInt();
            c.println("Enter the second x-coordinate here:");
            double x2 = c.readInt();
            c.println("Enter the second y-coordinate here:");
            double y2 = c.readInt();
            //Find Distance, Slope of Line, Equation of Line and Midpoint of Line Segment
            double d = Math.sqrt(((y2 - y1)*(y2 - y1)) + ((x2 - x1)*(x2 - x1)));
            double m = (y2 - y1) / (x2 - x1);
            double b = y1 - m*x1;
            double Mx = ((x1 + x2) / 2);
            double My = ((y1 + y2) / 2);
            //Print Points, Distance, Slope of Line, Equation of Line and Midpoint of Line Segment
            c.print("Equations for points " + "(" + x1 + "," + y1 + ")");
            c.println("(" + x2 + "," + y2 + ")");
            c.println("Distance between Points: " + d);
            c.println("Slope of Line: The slope of the given line is " + m);
            c.print("Equation of Line: The equation of the line is ");
            if (b >= 0) {
                c.println("y = " + m + "x" + "+" + b);  
            }
            else if (b < 0) {
               c.println("y = " + m + "x" + "-" + b);  
            }
            c.print("Midpoint: The midpoint of the line segment is: ");
            c.print("(" + Mx + "," + My + ")");
    }
    //When user chooses Boolean Logic
    else if (num == 2) {
        
    }
    //When user chooses Number Fun
    else if (num == 3) {
        //Print Function Options
        c.println("1)Factors");
        c.println("2)Odd or Even");
        c.println("3)Positive / Negative");
        c.println("4)Highest Number");
        c.println("5)Adding Digits");
        c.println("6)Investment Value");
        c.println("7)Distance");
        //Ask for number
        c.println("Enter the number to activate your desired function here:");
        int NumberFunnum = c.readInt();
        //When user chooses Factors
        if (NumberFunnum == 1) {
            //Ask user for input
            c.println("Enter first number here:");
            int a = c.readInt();
            c.println("Enter second number here:");
            int b = c.readInt();
            //Find if the first number is divisible by the second
            factor(a,b);
        }
        //When user chooses Odd or Even
        else if (NumberFunnum == 2) {
            //Ask user for input
            c.println("Enter number here:");
            int oddeven = c.readInt();
            //Find if number is odd or even
            oddoreven(oddeven);
        }
        //When user chooses Positive / Negative
        else if (NumberFunnum == 3) {
            //Ask user for input
            c.println("Enter number here:");
            int positivenegative = c.readInt();
            //Find if number is positive or negative
            positiveornegative(positivenegative);
        }
        //When user chooses Highest Number
        else if (NumberFunnum == 4) {
            //Ask user for input
            c.println("Enter five number here:");
            int hn1 = c.readInt();
            int hn2 = c.readInt();
            int hn3 = c.readInt();
            int hn4 = c.readInt();
            int hn5 = c.readInt();
            //Find highest number
            highestnumber(hn1,hn2,hn3,hn4,hn5);
        }
        //When user chooses Adding Digits
        else if (NumberFunnum == 5) {
            //Ask user for input
            c.println("Enter a three digit number here:");
            int threedigit = c.readInt();
            //Find the sum of integers in the number
            adddigits(threedigit);
        }
        //When user chooses Investment Value
        else if (NumberFunnum == 6) {
            //Ask user for investment value
            c.println("Enter investment amount here:");
            double investmentamount = c.readDouble();
            //Ask user for interest rate
            c.println("Enter yearly interest rate here:");
            double interestrate = c.readDouble();
            //Ask user for the number of years they will hold their investment
            c.println("Enter number of years here:");
            int years = c.readInt();
            //Find future investment value
            findfutureinvestmentvalue(investmentamount,interestrate,years);

        }
        //When user chooses Distance
        else if (NumberFunnum == 7) {
            //Ask user for altitude
            c.println("Enter altitude here:");
            int altitude = c.readInt();
            //Ask user for angle between them and the airport
            c.println("Enter degree of angle between you and the airport here:");
            double degrees = c.readDouble();
            //Find distance between airplane and nearest airport
            finddistance(altitude,degrees);
        }
    }
    //When user chooses Word Math
    else if (num == 4) {
        c.println("1)Vowel Count");
        c.println("2)Group Students");
        //Ask for number
        c.println("Enter the number to activate your desired function here:");
        int wordmath = c.readInt();
        if (wordmath == 1) {
            //Ask user for input
            c.println("Enter letter here:");
            String word = c.readString();
            //Find number of vowels
            vowelcount(word);
        }
        if (wordmath == 2) {
            //Ask user for input
            c.println("Enter letter here:");
            String name = c.readString();
            //Find the group of the student
            groupstudents(name);
        }
    }
    //When user chooses Quadratic Equations
    else if (num == 5) {
        
    }
    //When user chooses Statistics
    else if (num == 6) {
        //Print Function Options
        c.println("1)Average");
        //Ask for number
        c.println("Enter the number to activate your desired function here:");
        int statnum = c.readInt();
        if (statnum == 1){
            findaverage();
        }
        
    }
}
    public static void factor(int first, int second){
        Console c = new Console();
        //When the first number is divisible by the second
        if (first%second == 0) {
            c.println("Yes, " + first + " is divisible by " + second);
        }
        //When the first number is not divisible by the second
        else {
            c.println("No, " + first + " is not divisible by " + second);
        }
    }
    public static void oddoreven(int first){
        Console c = new Console();
        //When the number is Even
        if (first % 2 == 0) {
            c.println("The number " + first + " is even.");
        } //When the number is Odd
        else {
            c.println("The number " + first + " is odd.");
        }
    }
    public static void positiveornegative(int first){
        Console c = new Console();
        //When the number is positive
        if (first > 0) {
            c.println("The number " + first + " is positive.");
        } //When the number is negative
        else if (first < 0) {
            c.println("The number " + first + " is negative.");
        }
    }
    public static void highestnumber(int first, int second, int third, int fourth, int fifth) {
        Console c = new Console ();
        //When the first number is the highest number
        if (first > second && first > third && first > fourth && first > fifth) {
            c.println("The highest number is " + first);
        } //When the second number is the highest number
        else if (second > first && second > third && second > fourth && second > fifth) {
            c.println("The highest number is " + second);
        } //When the third number is the highest number
        else if (third > first && third > second && third > fourth && third > fifth) {
            c.println("The highest number is " + third);
        } //When the fourth number is the highest number
        else if (fourth > first && fourth > second && fourth > third && fourth > fifth) {
            c.println("The highest number is " + fourth);
        } //When the fifth number is the highest number
        else if (fifth > first && fifth > second && fifth > third && fifth > fourth) {
            c.println("The highest number is " + fifth);
        }
    }
    public static void vowelcount(String word){
        Console c = new Console();
        //Initializing variables
        int vowel = 0;
        char first = word.charAt(0);
        char second = word.charAt(1);
        char third = word.charAt(2);
        char fourth = word.charAt(3);
        //When the first letter is a vowel
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
            vowel++;
        }
        //When the second letter is a vowel
        if (second == 'a' || second == 'e' || second == 'i' || second == 'o' || second == 'u' || second == 'A' || second == 'E' || second == 'I' || second == 'O' || second == 'U') {
            vowel++;
        }
        //When the third letter is a vowel
        if (third == 'a' || third == 'e' || third == 'i' || third == 'o' || third == 'u' || third == 'A' || third == 'E' || third == 'I' || third == 'O' || third == 'U') {
            vowel++;
        }
        //When the fourth letter is a vowel
        if (fourth == 'a' || fourth == 'e' || fourth == 'i' || fourth == 'o' || fourth == 'u' || fourth == 'A' || fourth == 'E' || fourth == 'I' || fourth == 'O' || fourth == 'U') {
            vowel++;
        }
        //Print output
        c.println("The number of vowels in the word: " + vowel);
}
    public static void groupstudents(String name){
        Console c = new Console();
        //Initializing variable
        char first = name.charAt(0);
        //When their name begins between A and H
        if ((first == 'A' || first > 'A') && (first == 'K' || first < 'K') || (first == 'a' || first > 'a') && (first == 'k' || first < 'k')) {
            c.println("You are in Group 1");
        }  
        //When their name begins between L and P
        else if ((first == 'L' || first > 'L') && (first == 'P' || first < 'P') || (first == 'l' || first > 'l') && (first == 'p' || first < 'p')) {
            c.println("You are in Group 2");
        }
        //When their names begin between Q and Z
        else if ((first == 'Q' || first > 'Q') && (first == 'Z' || first < 'Z') || (first == 'q' || first > 'q') && (first == 'z' || first < 'z')) {
            c.println("You are in Group 3");
        }
    }
    public static void adddigits(int x){
        Console c = new Console();
        int ones = x % 10;
        int tens = ((x - ones) % 100) / 10;
        int hundreds = ((x - (tens*10 + ones) % 1000)) / 100;
        int sum = ones + tens + hundreds;
        c.println(sum);
    }
    public static void findfutureinvestmentvalue(double amount, double interest, int time) {
        Console c = new Console();
        DecimalFormat df = new DecimalFormat("#.##");
        double investmentvalue = amount*(Math.pow((1+(interest/1200)),(time*12)));
        investmentvalue = (int) (investmentvalue*100);
        investmentvalue = (double) (investmentvalue/100);
        c.println(df.format(investmentvalue));
        
        
    }
    public static void finddistance(int altitude, double degrees){
        Console c = new Console();
        degrees = Math.toRadians(degrees);
        double distance = altitude/Math.tan(degrees);
        c.println(distance);
    }
    public static void findaverage(){
        Console c = new Console();
        int num = 0;
        double sum = 1;
        int count = -1;
        while (num != -1){
            //Ask user for input
            c.println("Enter number here: ");
            num = c.readInt();
            sum = sum + num;
            count++;
        }
        double average = sum/count;
        c.println("The numbers of numbers entered: " + count);
        c.println("The total of numbers entered: " + sum);
        c.println("The average of numbers entered: " + average);
        
    }
}
