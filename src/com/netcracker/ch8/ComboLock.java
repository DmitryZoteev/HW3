package com.netcracker.ch8;

public class ComboLock {
    private int[] code = new int[3];
    private int[] attempt = new int[3];
    private int[] direction = new int[3];
    private int pos;
    private int count;

    public ComboLock(int secret1, int secret2, int secret3) {
        code[0] = secret1;
        code[1] = secret2;
        code[2] = secret3;
        pos = 0;
        count = 0;
    }

    public void reset() {
        attempt[0] = 0;
        attempt[1] = 0;
        attempt[2] = 0;
    }

    public void turnLeft(int ticks) {
        pos = (pos - ticks) + 39;
        attempt[count] = pos;
        direction[count] = 1;
        count++;

    }

    public void turnRight(int ticks) {
        pos = pos + ticks;
        attempt[count] = pos;
        direction[count] = 0;
        count++;

    }

    public boolean open() {
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            if (attempt[i] == code[i]) {
                correct++;
            }

        }

        if (direction[0] == 0 && direction[1] == 1 && direction[2] == 0) {
            correct++;
        }
        return correct == 4;
    }
}
