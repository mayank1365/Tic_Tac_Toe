package com.mayank.tic_tac_toe.models.player;

public final class Bot extends Player {
    private BotDificultyLevel botDificultyLevel;

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDificultyLevel botDificultyLevel) {
        super(name, symbol, playerType);
        this.botDificultyLevel = botDificultyLevel;
    }

    public void setBotDificultyLevel(BotDificultyLevel botDificultyLevel) {
        this.botDificultyLevel = botDificultyLevel;
    }
}
