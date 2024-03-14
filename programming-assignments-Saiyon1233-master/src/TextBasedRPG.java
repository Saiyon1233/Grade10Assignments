/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  Saiyon Jeyakumar
 * Class:   ICS3U
 *
 * Program: Assignment 6 Question 5
 * Input: 6 - Ask for the user's name
 *          - Ask user what they are gonna do in each situation
 * Processing: 6 - Determine the user's next situation from their actions
 *             8 - Create a battle
 * Output: 6 - Print the situation
 *         8 - Print the result of the battle
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
public class TextBasedRPG {

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
        //Initializing variables
        String area1 = "You are wandering behind the Vince’s Plaza, when you notice a\nshimmering door behind a dumpster.";
        String area2 = "The door is surprisingly unlocked.  As you turn the handle, an eerie wind builds\nup, stirring the trash around you.  A force lurches the door open taking you\nwith it. You are falling.  You can ‘grab something’ or ‘keep falling’";
        String area3 = "You curse the bad Biggie Burger you had for lunch, write the door off as a\nhallucination.  You turn to walk away, but right behind you is the rabbit from\nDonnie Darko.  He looks mean… real mean. “You have 28 seconds and 12 \nmicroseconds tolive”, he says menacingly.  There is going to be a fight.";
        String area4 = "You frantically wave your hands about until you grab a hold of something soft\nand furry, and bring it close to you.  A Cheshire cat meows furiously at you,\n“Wrong story friend, now would you kindly let go of my tai-“.  You slam into theground hard.  The force of the impact would’ve easily killed you, had the cuddlycat not cushioned the fall.  So much for 9-lives. You are in a small 6-foot roomwith a note lying on the ground.  You pick up the note, and read it to yourself.'I am extremely delicate, sometimes golden.  Merely speaking my name will break me. What am I?";
        String area5 = "You’re not good at these games are you?  You continue falling, until you\neventually decorate the bottom with your entrails.  It was a life, albeit a\nshort one.";
        String area6 = "An ominous, deafening voice breaks the silence.  “Noob!”  It entones.  “I could so pwn your excremental puckerer.  Golum from Lord of the Rings comes from a\ndark corner.  “Don’t worry, I will show you the way to Mordo – no you won’t\nprecious we’re stuck in a 6-foot room – Smeagle doesn’t listens to you”  A few\nyears later you succumb to insanity as you try to guess what’s in his pocketfor the thousandth time.  Some people hold grudges.";
        String area7 = "The walls of the room drop down to reveal library shelves full of paper.  You’renot entirely sure what to do with it, as there’s no App for this situation.\nAfter glancing at a few, you realize that it’s the answers to every exam and\ntest ever given (past or present) at your high school.  You’ve hit the jackpot.";
        //Ask user for name
        c.println("Enter your character's name here: ");
        String name = c.readLine();
        //Print area 1
        c.clear();
        c.println(area1);
        c.println("1)Leave");
        c.println("2)Search");
        c.println("3)Open door");
        c.println("Enter number here: ");
        int num = c.readInt();
        int win = 0;
        int loss = 0;
        //When the user chooses to leave
        if (num == 1) {
            c.clear();
            c.println(area3);
            int i = 0;
            //Determine whether the user wins the battle
            for (i=0;i<=5;i++) {
                Random winloss = new Random();
                int result = winloss.nextInt(1);
                //When the user wins the round
                if (result == 0) {
                    win++;
                }
                //When the user losses the round
                else {
                    loss++;
                }   
            }
            //When the user wins the overall battle
            if ( win > loss) {
                c.println("You Win!!!");
            }
            //When the user looses the overall battle
            else if (win < loss) {
                c.println("You Loss!!!");
            }
            //Ask user to clear the screen
            c.println("Press p to clear the screen");
            char clear = c.readChar();
            //Clear screen
            if (clear == 'p') {
                c.clear();
                c.println(area4);
                c.println("1)China");
                c.println("2)Silence");
                c.println("Enter number here: ");
                int num2 = c.readInt();
                //When user says China
                if (num2 == 1) {
                    c.clear();
                    c.println(area6);
                }
                //When user says Silence
                if (num2 == 2) {
                    c.clear();
                    c.println(area7);
                }
            }
        }
        //When user chooses to search
        else if (num == 2) {
            c.clear();
            c.println("1)Area 2");
            c.println("2)Area 3");
            c.println("Enter number here: ");
            int num5 = c.readInt();
            //When user picks Area 2 
            if (num5 == 1){
                c.println("1)Area 4");
                c.println("2)Area 5");
                c.println("Enter number here: ");
                int num6 = c.readInt();
                //When user picks Area 4
                if (num6 == 1) {
                    c.clear();
                    c.println(area4);
                    c.println("1)China");
                    c.println("2)Silence");
                    c.println("Enter number here: ");
                    int num7 = c.readInt();
                    //When user says China
                    if (num7 == 1) {
                        c.clear();
                        c.println(area6);
                    }
                    //When user says Silence
                    if (num7 == 2) {
                        c.clear();
                        c.println(area7);
                    }
                }
                //When user picks Area 5 
                else if (num6 == 2) {
                    c.clear();
                    c.println(area5);
            }
            }
            //When user picks Area 3
            else if (num5 == 2) {
                c.clear();
                c.println(area3);
                int j = 0;
                //Determine whether the user wins the battle
                for (j=0;j<=5;j++) {
                    Random winloss = new Random();
                    int result = winloss.nextInt(1);
                    //When the user wins the round
                    if (result == 0) {
                        win++;
                    }
                    //When the user losses the round
                    else {
                        loss++;
                    }   
                }
                //When the user wins the overall battle
                if ( win > loss) {
                    c.println("You Win!!!");
                }
                //When the user looses the overall battle
                else if (win < loss) {
                    c.println("You Loss!!!");
                }
                //Ask user to clear the screen
                c.println("Press p to clear the screen");
                char clear = c.readChar();
                //Clear screen
                if (clear == 'p') {
                    c.clear();
                    c.println(area4);
                    c.println("1)China");
                    c.println("2)Silence");
                    c.println("Enter number here: ");
                    int num4 = c.readInt();
                    //When user says China
                    if (num4 == 1) {
                        c.clear();
                        c.println(area6);
                    }
                    //When user says Silence
                    if (num4 == 2) {
                        c.clear();
                        c.println(area7);
                    }
            }
            }
        }
        //When user chooses to open door
        else if (num == 3) {
            c.clear();
            c.println("1)Area 4");
            c.println("2)Area 5");
            c.println("Enter number here: ");
            int num8 = c.readInt();
            //When user picks Area 4
            if (num8 == 1) {
              c.clear();
              c.println(area4);
              c.println("1)China");
              c.println("2)Silence");
              c.println("Enter number here: ");
              int num9 = c.readInt();
              //When user says China
                    if (num9 == 1) {
                        c.clear();
                        c.println(area6);
                    }
                    //When user says Silence
                    if (num9 == 2) {
                        c.clear();
                        c.println(area7);
                    }
            }
            //When user picks Area 5 
            else if (num8 == 2) {
              c.clear();
              c.println(area5);
            }
        }
}
}