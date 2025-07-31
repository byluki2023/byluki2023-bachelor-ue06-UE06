package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A05_ConnectFour {// utility vars
    // utility vars
    public static final char EMPTY_CHAR = ' ';
    public static final char X_PLAYER = 'X';
    public static final char O_PLAYER = 'O';
    public static final String ROW_DELIMITER = " +---+---+---+---+---+---+---+";
    public static final String COL_DELIMITER = " | ";

    public static char[] row1 = new char[7];
    public static char[] row2 = new char[7];
    public static char[] row3 = new char[7];
    public static char[] row4 = new char[7];
    public static char[] row5 = new char[7];
    public static char[] row6 = new char[7];

    public static char currentPlayer = X_PLAYER;

    public static void main(String[] args) {
        //TODO: Hier Code einfügen
    }

    /**
     * Fills an entire array with the empty character and returns the array.
     */
    public static char[] fillArrayEmptyChar(char[] arr) {
        //TODO: Hier Code einfügen
        return new char[]{'X', 'X'}; //Änderbar
    }

    /**
     * Places the currentPlayer character into the respective column on the ConnectFour grid.
     */
    public static void makeMove(int userColumn) {
        //TODO: Hier Code einfügen
    }

    /**
     * Switches the currentPlayer variable to X, if O is currently playing and vice versa.
     */
    public static void switchPlayer() {
        //TODO: Hier Code einfügen
    }

    /**
     * Checks, whether the ConnectFour game board is filled entirely.
     * If it is full, this function returns true.
     */
    public static boolean isBoardFull() {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }

    /**
     * Checks, if the column specified by a user input is already full.
     * Method returns true, if the column is full.
     */
    public static boolean isColumnFull(int userColumn) {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }


    /**
     * Checks, whether the user input column is on the board.
     * Returns true, if the column is in range.
     */
    public static boolean isMoveInRange(int userColumn) {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }

    /**
     * Prints out the entire game board.
     */
    public static void printBoard() {
        //TODO: Hier Code einfügen
    }


    /**
     * Checks, whether a player won and returns the winning character (PLAYER_X or PLAYER_O).
     * In case neither of them won, the empty character shall be returned.
     */
    public static char getWinner() {
        //TODO: Hier Code einfügen
        return 'X'; //Änderbar
    }
}
