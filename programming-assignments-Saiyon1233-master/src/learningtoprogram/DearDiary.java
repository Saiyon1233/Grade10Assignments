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
 * Program: Assignment 13 Question 1
 * Input: 
 *     3 - The person's name and the title of the entry
 *     6 - Ask user for password
 *     10 - Ask user for what they want to do based on the choices
 *Processing:
 *     7 - Generate a new password
 *     8 - Make a loop of the choices they can do until they want to exit
 * Output: 
 *     1 - A diary entry of my first experience programming in Java
 *     6 - Print menu options
 *     7 - Print a new password
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;

/**
 *
 * @author Admin
 */
public class DearDiary {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Starting...");
        Console c = new Console();
        //Ask user for password
        c.println("Enter password here: ");
        String password = c.readString();
        if ("secret".equals(password)) {
            int num = 0;
            while(num != 4) {
            //Print options
            c.println("1)Making a diary entry");
            c.println("2)Viewing a diary");
            c.println("3)Changing your password");
            c.println("4)Exit");
            //Ask user for number
            c.println("Enter number here: ");
            num = c.readInt();
            //When user picks making a diary entry
            if (num == 1) {
                //Ask user for the name and the title of the entry
                c.println("Enter your name here:");
                String name = c.readLine();
                c.println("Enter the title of the entry here:");
                String title = c.readLine();
                //Print diary entry
                c.println("Name: " + name);
                c.println("Title of Entry: " + title);
                c.printDate();
                c.println();
                c.println("----------------------------------------------------------");
                c.println("I have coded before in Visual Basic and Python. Due to my");
                c.println("experiences with other programming languages,I find Java");
                c.println("very easy to learn. Although it is a different languages");
                c.println("have different forms of syntax, the functions and concept");
                c.println("are relatively similar. I also find the IDE, NetBeans very");
                c.println("helpful. It contains various features that had not existed");
                c.println("in the previous. IDEs that i had coded in. I can't wait to");
                c.println("learn more about Java!");
            }
            //When user picks viewing a diary
            else if (num == 2) {
                
            }
            //When user picks changing your password
            else if (num == 3) {
                password = randompassword();
                c.println(password);
            }
            //When user picks exit
            else if (num == 4) {
                c.println("Goodbye!!!");
            }
            
        }
    }
    }
    public static String randompassword() {
        //generate 6 random numbers used to find generate a type of character
        Random character = new Random();
        int firstchar = character.nextInt(2);
        int secondchar = character.nextInt(3);
        int thirdchar = character.nextInt(3);
        int fourthchar = character.nextInt(3);
        int fifthchar = character.nextInt(3);
        int sixthchar = character.nextInt(2);
        //Generate the first character
        char firstletter = (char)(character.nextInt(26) + 'a');
        String first = "" + firstletter;
        //When the first character is an uppercase letter
        if (firstchar == 1) {
           first = first.toUpperCase();
        }
        //Generate the second character
        String second;
        //When the second character is a number
        if (secondchar == 2) {
            int secondletter = character.nextInt(9)+1;
            second = "" + secondletter;
        }
        //When the second character is a letter
        else {
            char secondletter = (char) (character.nextInt(26) + 'a');
            second = "" + secondletter;
            //When the second character is an uppercase letter
            if (secondchar == 1) {
                second = second.toUpperCase();
            }
        }
        //Generate the third character
        String third;
        //When the third character is a number
        if (thirdchar == 2) {
            int thirdletter = character.nextInt(9)+1;
            third = "" + thirdletter;
        }
        //When the third character is a letter
        else {
            char thirdletter = (char) (character.nextInt(26) + 'a');
            third = "" + thirdletter;
            //When the third character is an uppercase letter
            if (thirdchar == 1) {
                third = third.toUpperCase();
            }
        }
        //Generate the fourth character
        String fourth;
        //When the fourth character is a number
        if (fourthchar == 2) {
            int fourthletter = character.nextInt(9)+1;
            fourth = "" + fourthletter;
        }
        //When the fourth character is a letter
        else {
            char fourthletter = (char) (character.nextInt(26) + 'a');
            fourth = "" + fourthletter;
            //When the fourth character is an uppercase letter
            if (fourthchar == 1) {
                fourth = fourth.toUpperCase();
            }
        }
        //Generate the fifth character
        String fifth;
        //When the fifth character is a number
        if (fifthchar == 2) {
            int fifthletter = character.nextInt(9)+1;
            fifth = "" + fifthletter;
        }
        //When the fifth character is a letter
        else {
            char fifthletter = (char) (character.nextInt(26) + 'a');
            fifth = "" + fifthletter;
            //When the fifth character is an uppercase letter
            if (fifthchar == 1) {
                fifth = fifth.toUpperCase();
            }
        }
        //Generate the sixth character
        char sixthletter = (char)(character.nextInt(26) + 'a');
        String sixth = "" + sixthletter;
        //When the sixth character is an uppercase letter
        if (sixthchar == 1) {
           sixth = sixth.toUpperCase();
        }
        String password = first + second + third + fourth + fifth + sixth;
        return password;
    }
}