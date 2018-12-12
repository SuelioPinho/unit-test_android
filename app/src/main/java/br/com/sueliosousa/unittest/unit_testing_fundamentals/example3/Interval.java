package br.com.sueliosousa.unittest.unit_testing_fundamentals.example3;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */

public class Interval {

    private final int mStart;
    private final int mEnd;

    public Interval(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("invalid interval range");
        }
        mStart = start;
        mEnd = end;
    }

    public int getStart() {
        return mStart;
    }

    public int getEnd() {
        return mEnd;
    }
}
