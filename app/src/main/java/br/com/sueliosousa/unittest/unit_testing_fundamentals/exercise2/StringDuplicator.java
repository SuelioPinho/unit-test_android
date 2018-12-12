package br.com.sueliosousa.unittest.unit_testing_fundamentals.exercise2;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */

public class StringDuplicator {

    /**
     * @return concatenation of the argument with itself e.g. "hi" -> "hihi"
     */
    public String duplicate(String string) {
        // the bug is triplication instead of duplication
        return string + string;
    }
}
