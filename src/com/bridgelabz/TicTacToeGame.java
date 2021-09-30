package com.bridgelabz;

import java.io.OptionalDataException;

/**
 * Program on Tic Tac Toe Game
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 30/09/2021
 */

public class TicTacToeGame {
    public static void createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe Game");
        createBoard();
    }
}











