package com.company.module_10;

import java.util.Scanner;

public class BookName {
    String  phone = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9";
    String books = "a,b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y,z";

    public void inputName() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name from the letters of the English");
        String name = sc.next();
        for (int i = 0; i < name.length(); i++) {
            if (books.indexOf(name.charAt(i)) == -1) {
                throw new InputException("Input correct name");
            }
        }
        System.out.println("Input phone");
        String ph = sc.next();
        for(int j = 0; j < ph.length(); j++) {
             if(phone.indexOf(ph.charAt(j)) == -1){
              throw new InputException("Input correct phone");
            }
        }
        System.out.println(name +" " + ph);
    }
}
