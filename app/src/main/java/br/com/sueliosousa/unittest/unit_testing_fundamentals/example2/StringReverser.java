package br.com.sueliosousa.unittest.unit_testing_fundamentals.example2;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */

public class StringReverser {

    public String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1 ; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }
}
