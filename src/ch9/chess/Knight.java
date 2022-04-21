package ch9.chess;

import java.util.ArrayList;

public class Knight extends ChessPiece{
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        if (y < 7 && x < 8 && x > 1) {
            move.add(ordinateX.get((x - 1) - 1).toString() + (y + 2));
            move.add(ordinateX.get((x - 1) + 1).toString() + (y + 2));
        }
        if (y > 2 && x < 8 && x > 1) {
            move.add(ordinateX.get((x - 1) - 1).toString() + (y - 2));
            move.add(ordinateX.get((x - 1) + 1).toString() + (y - 2));
        }
        if (y < 8 && x < 7 && x > 2) {
            move.add(ordinateX.get((x - 1) - 2).toString() + (y + 1));
            move.add(ordinateX.get((x - 1) + 2).toString() + (y + 1));

        }
        if (y > 1 && x < 7 && x > 2) {
            move.add(ordinateX.get((x - 1) - 2).toString() + (y - 1));
            move.add(ordinateX.get((x - 1) + 2).toString() + (y - 1));
        }
        return move;
    }
}
