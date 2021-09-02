package com.company.module_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rectangle extends Figure implements CountingSquare,CountingDate {

    public Rectangle(int numberParties, int oneSide, int secondSide) {
        super(numberParties, oneSide, secondSide);
    }

    @Override
    public double Square() {
        double S = oneSide * secondSide;
        return S;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("The area of a rectangle is " + Square());
        printDate();
    }

    @Override
    public void printDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");
        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
    }
}
