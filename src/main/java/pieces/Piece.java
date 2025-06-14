package main.java.pieces;

import main.java.board.Position;

import java.util.ArrayList;

public abstract class Piece {
    private final boolean isWhite;
    protected char type;
    protected Boolean hasMoved = null;

    //Constructor
    protected Piece(boolean isWhite){
        this.isWhite = isWhite;
    }

    //Getters
    public boolean isWhite() { return this.isWhite; }

    abstract public char getType();
    abstract public ArrayList<Integer> possibleMoves(Position pos, int start);
    public boolean validMove(Position pos, int start, int end){
        return this.possibleMoves(pos, start).contains(end) ;
    }

    abstract public Piece clone();


}
