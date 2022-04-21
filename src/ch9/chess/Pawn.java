package ch9.chess;

import java.util.ArrayList;

public class Pawn extends ChessPiece{
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        if (y < 8) move.add(ordinateX.get(x - 1).toString() + (y + 1));
        return move;
    }
}
