/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
* Author: Saiyon
 * Class: ICS3U
 *
 * Program: Assignment: Array Question 4
 * Input: - Ask user for how long the array will be
 *        - Ask user for numbers for arrays
 * Processing: - Fill array with user's numbers 
 * Output: - Print array backwards
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.lang.reflect.Array;

/**
 *
 * @author Admin
 */
public class Tictactoe {

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
        char[][]board = new char[3][3];
        int i = 0;
        char player1 = 'X';
        char player2 = 'O';
        String message = " ";
        //Play game until it is over
        for(i=0;i<6;i++) {
        printTTT(board,c);
        //Ask player where he wants to place X
        c.println("Which row do you want to put X");
        int row1 = c.readInt();
        c.println("Which column do you want to put X");
        int column1 = c.readInt();
        //Place the X according to the user
        board[row1][column1] = player1;
        printTTT(board,c);
        //Checker whether player X wins the game
        message = whoWon(board, player1, player2);
        //When a player wins
        if ((message.length())>2) {
            c.println(message);
            break;
        }
        //Ask player where he wants to place O
        c.println("Which row do you want to put O");
        int row2 = c.readInt();
        c.println("Which column do you want to put O");
        int column2 = c.readInt();
        //Place the O according to the user
        board[row2][column2] = player2;
        c.println("---------------------------------------------------------");
        //Checker whether player O wins the game
        message = whoWon(board, player1, player2);
        //When a player wins
        if ((message.length())>2) {
            c.println(message);
            break;
        }
        if (i == 5) {
            c.println("It's a tie.");
        }
        }
    }
    public static void printTTT(char[][] board, Console c) {
        //Print board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                c.print(board[row][col] + " ");
            }
            c.println();
        }
    }
    public static boolean winThroughHorizontal(char[][]board, char player) {
    boolean playerwin = false;
    int playercounter = 0;
    int row = 0;
    int column = 0;
    for(column=0;column<3;column++)
    {
        playercounter = 0;
        for(row=0;row<3;row++)
        {
            if(board[row][column] == player) {
                playercounter++;
            }
        }
        if(playercounter == 3)
            playerwin = true;
            break;
    }
    return playerwin;
}
    public static boolean winThroughVertical(char[][]board, char player) {
    boolean playerwin = false;
    int playercounter = 0;
    int row;
    int column;
    for(row=0;row<3;row++)
    {
        playercounter=0;
        for(column=0;column<3;column++)
        {
            if(board[row][column] == player)
                playercounter++;
        }
        if(playercounter == 3) {
            playerwin = true;
            break;
        }
    }
    return playerwin;
}
    public static boolean winThroughDiagonal(char[][]board, char player) {
    boolean playerwin = false;
    if(board[1][1] == player) {
        if((board[0][0] == player &&  board[2][2] == player) || (board[0][2] == player && board[2][0] == player)) {
            playerwin = true;
        }
        else {
            playerwin = false;
        }
    }
    return playerwin;
}
    public static String whoWon(char[][]board, char player1, char player2) {
    boolean player1Win=false;
    boolean player2Win=false;
    String message = " ";

    if(player1Win==false) {
        player1Win = winThroughVertical(board,player1);
    }
    if(player1Win==false) {
        player1Win = winThroughHorizontal(board, player1);
    }
    if(player1Win==false) {
        player1Win = winThroughDiagonal(board, player1);
    }
    if(player2Win==false) {
        player2Win = winThroughVertical(board, player2);
    }
    if(player2Win==false) {
        player2Win = winThroughHorizontal(board, player2);
    }
    if(player2Win==false) {
        player2Win = winThroughDiagonal(board, player2);
    }
    if(player1Win==true) {
        message = "X wins!!!";
    }
    if(player2Win==true) {
        message = "O wins!!!";
    }
    return message;
    }
}