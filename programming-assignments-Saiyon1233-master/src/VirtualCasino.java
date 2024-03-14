/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  Saiyon Jeyakumar
 * Class:   ICS3U
 *
 * Program: Assignment 6 Question 4
 * Input: 6 - Ask user for name
 *        7 - Ask user for number
 *        8 - Ask user for the answer of a question
 *       10 - Ask user what they want to do in the casino
 * Processing: 7 - Determine if the number the user guessed equals the number randomnly generated
 *             8 - Determine whether the user answered the question correctly
 *            10 - Make a loop until the user wants to exit the casino
 *               - Make a money system
 *               - Find a way to cash out tokens
 * Output: 6 - Print options
 *           - Print a welcome message
 *         7 - Print whether the wins or loses
 *         8 - Print a response to if the user was right or wrong
 *        10 - Print an intro and "good-bye screen" 
 *             Print the number of tokens the user has and that they are being cashed out
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.awt.Color;

/**
 *
 * @author Admin
 */
public class VirtualCasino {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console();
        int token = 1000;
        //Set color to red
        c.setTextColor(Color.BLUE);
        //Print ASCII art
        c.println("*********************************************************");
        c.println("* ********* *********************************************");
        c.println("* ********* *********************************************");
        c.println("* ********* *********************************************");
        c.println("* ********* *********************************************");
        c.println("* ********* *********************************************");
        c.println("*           ******************************* *************");
        c.println("* ********* **      ** ******* ********** **** **********");
        c.println("* ********* ** ******* ******* ********* ***** **********");
        c.println("* ********* **      ** ******* ********* ***** **********");
        c.println("* ********* ** ******* ******* ********* ***** **********");
        c.println("* ********* **      **      **       *** ***** **********");
        c.println("****************************************   *   **********");
        //Ask user to clear the art
        c.println("Press p to clear the screen");
        char clear = c.readChar(); 
        //Clear art
        if (clear == 'p') {
            c.clear();
        }
        //Ask user for name
        c.println("Enter name here: ");
        String name = c.readString();
        //Intializing variables
        int i = 0;
        int answer = 0;
        //Determine whether the user is qualified to gamble
        for (i=1;i<=3;i++){
        c.println("2 + 2 = ?");
        answer = c.readInt();
        //When the user is correct
        if (answer == 4) {
            c.println("You have the skills to gamble!!!");
            break;
        }
        //When the user is incorrect
        else if (answer != 4 && i < 2) {
            c.println("You are wrong, try again...");
        }
        //When the user is incorrect over 3 times
        else if (i == 3) {
            c.println("YOU ARE NOT QUALIFIED TO GAMBLE!!!");
        }
        }
        //When the user is qualified
        if (answer == 4) {
            c.println(name + " ,Welcome to the Virtual Casino!!!");
            int num = 0;
            while (num != 4) {
            //Print options
            c.println("1)Dice");
            c.println("2)Roulette");
            c.println("3)Cash Out");
            c.println("4)Exit");
            //Ask user for number
            c.println("Enter number here: ");
            num = c.readInt();
            String message = " ";
            //When user picks Dice 
            if (num == 1) {
                c.println("Welcome to Dice!");
                //Ask user for input
                c.println("Enter number between 3 to 12");
                int dice = c.readInt();
                //User plays dice
                message = dice(dice);
                c.println(message);
                //When user wins
                if (message.equals ("You Win!!!")) {
                   token = token + 100; 
                }
                else {
                    token = token - 100;
                }
            }    
            //When user picks Roulette 
            else if (num == 2) {
                c.println("Welcome to Roulette!");
            } 
            //When user picks Cash Out 
            else if (num == 3) {
                c.println("Welcome to Cash Out!");
                c.println("You have " + token + " tokens.");
                c.println("They have been cashed out.");
            }
        }
        //Set color to red
        c.setTextColor(Color.BLUE);
        //Print ASCII art
        c.println("*********************************************************");
        c.println("**       ********* ****** ******        *****************");
        c.println("** ***** ********* ****** ****** ************************");
        c.println("** ***** ********* ****** ****** ************************");
        c.println("**        ********        ******        *****************");
        c.println("** **** ************** ********* ************************");
        c.println("**      ************** *********        *****************");
        c.println("********************** **********************************");
        c.println("*********************************************************");
        c.println("*********************************************************");
        c.println("*********************************************************");
        c.println("*********************************************************");
        c.println("*********************************************************");
        c.println("*********************************************************");
        }
    }   

    public static String dice(int num) {
        //Generate two random numbers
        Random Dice1 = new Random();
        Random Dice2 = new Random();
        int first = Dice1.nextInt(6) + 1;
        int second = Dice2.nextInt(6) + 1;
        int total = first + second;
        //When the total of both dices equal the number guessed
        if (num == total) {
            String message = "You Win!!!";
            return message;
        } 
        //When the total of both dices equal 2
        else if (total == 2) {
            first = Dice1.nextInt(6) + 1;
            second = Dice2.nextInt(6) + 1;
            int newtotal = first + second;
            //When the new total of both dices equal the number guessed
            if (num == newtotal) {
                String message = "You Win!!!";
                return message;
            }
            //When the new total of both dices does not equal the number guessed
            else {
                String message = "You Lose!!!";
                return message;
            }
        }
        //When the total of both dices does not equal the number guessed
        else {
            String message = "You Lose!!!";
            return message;
        }
    }
}