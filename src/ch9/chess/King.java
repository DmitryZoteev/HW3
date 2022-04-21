package ch9.chess;

import java.util.ArrayList;

public class King extends ChessPiece{
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        if (x < 8) {
            move.add(ordinateX.get((x - 1) + 1).toString() + y);
            if (y < 8) {
                move.add(ordinateX.get((x - 1) + 1).toString() + (y + 1));
            }
            if (y > 1) {
                move.add(ordinateX.get((x - 1) + 1).toString() + (y - 1));
            }
        }
        if (x > 1) {
            move.add(ordinateX.get((x - 1) - 1).toString() + y);
            if (y < 8) {
                move.add(ordinateX.get((x - 1) - 1).toString() + (y + 1));
            }
            if (y > 1) {
                move.add(ordinateX.get((x - 1) - 1).toString() + (y - 1));
            }
        }
        if (y < 8) {
            move.add(ordinateX.get(x - 1).toString() + (y + 1));
        }
        if (y > 1) {
            move.add(ordinateX.get(x - 1).toString() + (y - 1));
        }

        return move;
    }
}
