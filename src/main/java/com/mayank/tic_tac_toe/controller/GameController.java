package com.mayank.tic_tac_toe.controller;


import com.mayank.tic_tac_toe.exception.InvalidMoveException;
import com.mayank.tic_tac_toe.models.game.Game;
import com.mayank.tic_tac_toe.models.game.GameState;
import com.mayank.tic_tac_toe.models.player.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        System.out.println(game);
    }
}
