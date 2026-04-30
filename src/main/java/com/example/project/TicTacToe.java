package com.example.project;

public class TicTacToe{

    private char currentPlayer = 'X';

    public char getCurrentPlayer(){
        return currentPlayer;
    }

    public void play(int row, int col){
        currentPlayer = 'O';
    }

}