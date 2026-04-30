package com.example.project;

public class TicTacToe{

    private char currentPlayer = 'X';
    private char [][] board = new char [3][3];

    public char getCurrentPlayer(){
        return currentPlayer;
    }

    public void play(int row, int col){
        if (isTaken(row, col)) {
            throw new IllegalArgumentException("Square is Taken");
        }

        board[row][col] = currentPlayer;
        switchPlayer();
    }

    private boolean isTaken(int row, int col){
        return board[row][col] != '\0';
    }

    private void switchPlayer(){
        if (currentPlayer == 'X'){
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

}