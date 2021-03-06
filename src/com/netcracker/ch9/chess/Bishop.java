package com.netcracker.ch9.chess;

import java.util.ArrayList;

public class Bishop extends ChessPiece {
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            if (i != x) {
                if (y + (i - x) <= 8 && y + (i - x) >= 1)
                    move.add(ordinateX.get(i - 1).toString() + (y + (i - x)));
                if (y - (i - x) <= 8 && y - (i - x) >= 1)
                    move.add(ordinateX.get(i - 1).toString() + (y - (i - x)));
            }
        }
        return move;
    }
}
