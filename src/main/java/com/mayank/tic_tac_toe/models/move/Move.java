package com.mayank.tic_tac_toe.models.move;


import com.mayank.tic_tac_toe.models.cell.Cell;
import com.mayank.tic_tac_toe.models.player.Player;


public final class Move {
    private Cell cell;
    private Player player;

    public Move(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
    }



    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
