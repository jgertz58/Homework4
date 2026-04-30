package com.example.project;

public class TicTacToe{

    private char currentPlayer = 'X';
    private char [][] board = new char [3][3];

    public char getCurrentPlayer(){
        return currentPlayer;
    }

    public void play(int row, int col){
        if (board[row][col] != '\0') {
            throw new IllegalArgumentException("Square is Taken");
        }

        board[row][col] = currentPlayer;
        if (currentPlayer == 'X'){
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

}