package com.company.module_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Triangle extends Figure implements CountingSquare, CountingDate {
    int corner;

    public Triangle(int numberParties, int oneSide, int secondSide, int corner) {
        super(numberParties, oneSide, secondSide);
        this.corner = corner;
    }

    @Override
    public double Square() {
        double S = 0.5 * (Math.pow(oneSide, 2)) * (Math.sin(corner));
        return S;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("The area of an isosceles triangle is  " + Square());
        printDate();
    }

   @Override
    public void printDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
    }
}
