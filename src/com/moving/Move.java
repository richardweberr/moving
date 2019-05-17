package com.moving;

public class Move {

    // Attributes
    private int totalOfBoxes;
    private int boxesPerMove;


    //Constructors
    public Move(int TotalOfBoxes, int BoxesPerMove) {
        this.totalOfBoxes = TotalOfBoxes;
        this.boxesPerMove = BoxesPerMove;
    }

    // Methods
    public void moveBoxes() {
        int numberOfMoves = 0;
        int boxesRemaining = this.totalOfBoxes;
        int boxesCharged = 0;

        while (boxesRemaining > 0) {
            while ((boxesRemaining > 0) && (boxesCharged < boxesPerMove)) {
                boxesRemaining--;
                boxesCharged++;
                System.out.println("Camion n° " + numberOfMoves + ": 1 carton chargé; il reste " + boxesRemaining +
                        " cartons à charger; " + boxesCharged + "cartons sont déjà chargés dans le camion");
            }
            boxesCharged = 0;
            numberOfMoves++;
        }
    }
}
