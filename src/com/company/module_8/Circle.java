package com.company.module_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Circle extends Figure implements CountingSquare,CountingDate {
    int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double Square() {
        double S = 2 * (Math.PI) * radius;
        return S;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Circumference of a circle is " + Square());
        printDate();
    }

    @Override
    public void printDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("K:mm a, z");
        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
    }
}
