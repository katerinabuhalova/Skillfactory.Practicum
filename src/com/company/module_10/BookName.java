package com.company.module_10;

import java.util.Scanner;

public class BookName {
    String name;
    String phone;
    String books = "a,b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y,z";

    public void inputName() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name from the letters of the English");
        String name = sc.next();

        for (int i = 0; i < books.length(); i++) {
            if (books.indexOf(name.charAt(i)) != -1) {
                System.out.println("Input phone");
                String phone = sc.next();
                System.out.println("You entered everything correctly");
                break;
            } else {
                throw new InputException("Input correct name");
            }
        }
    }
}
