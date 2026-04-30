package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TicTacToeTest{

    @Test
    void gameStart(){
        TicTacToe game = new TicTacToe();

        assertEquals('X', game.getCurrentPlayer());
    }

    @Test
    void turnChanges(){
        TicTacToe game = new TicTacToe();

        game.play(0, 0);
        assertEquals('O', game.getCurrentPlayer());

    }

    @Test
    void takenSquare(){
        TicTacToe game = new TicTacToe();

        game.play(0, 0);

        assertThrows(IllegalArgumentException.class, () -> {
            game.play(0, 0);
        });

    }
}