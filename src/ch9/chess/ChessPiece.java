package ch9.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ChessPiece {
    protected List<Character> ordinateX = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
    protected String position;
    protected int x;
    protected int y;

    public void setPosition(String position) {
        this.position = position;
        getXY();
    }

    protected void getXY(){
        x = 1 + ordinateX.indexOf(position.charAt(0)); // 1 ... 8
        y = position.charAt(1) - 48; // 1 ... 8
    }

    public abstract ArrayList<String> canMoveTo();
}
