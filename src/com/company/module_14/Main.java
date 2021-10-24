package com.company.module_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strings instrument with stream : ");
        streamSolution();
        System.out.println("Strings instrument without stream : ");
        solutionsWithoutStream();
    }

    public static void streamSolution() {
        List<String> stringsInstrument = Arrays.asList("Viola", "Cello", "Violin", "Piano");
        stringsInstrument
                .stream()
                .filter(x -> x.toLowerCase(Locale.ROOT).startsWith("v"))
                .sorted()
                .forEach(System.out::println);
    }

    public static void solutionsWithoutStream() {
        List<String> stringsInstrument = Arrays.asList("Viola", "Cello", "Violin", "Piano");
        List<String> newStringsInstrument = new ArrayList<>();
        for (String instrument : stringsInstrument) {
            if (instrument.toLowerCase(Locale.ROOT).charAt(0) == 'v') {
                newStringsInstrument.add(instrument);
                System.out.println(instrument);
            }
        }
    }
}
