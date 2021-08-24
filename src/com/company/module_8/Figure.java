package com.company.module_8;

public abstract class Figure {
    int numberParties;
    int oneSide;
    int secondSide;

    public Figure() {
    }

    public Figure(int numberParties, int oneSide, int secondSide) {
        this.numberParties = numberParties;
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    public abstract void printInfoFigure();
}
