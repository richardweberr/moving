package com.moving;

public class Main {

    public static void main(String[] args) {
        Move move = new Move(34, 9);
        move.moveBoxes();

        System.out.println("othermove");

        Move otherMove = new Move(20, 10);
        otherMove.moveBoxes();
    }
}
