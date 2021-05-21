package com.codegym.task.task35.task3513;

class MoveFitness implements Comparable<MoveFitness> {
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveFitness(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    @Override
    public int compareTo(MoveFitness o) {
        if (numberOfEmptyTiles > o.numberOfEmptyTiles) {
            return 1;
        } else if (numberOfEmptyTiles < o.numberOfEmptyTiles) {
            return -1;
        } else {
            if (score > o.score) {
                return 1;
            } else if (score < o.score) {
                return -1;
            }
        }
        return 0;
    }

    public Move getMove() {
        return move;
    }
}