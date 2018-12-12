package br.com.sueliosousa.unittest.unit_testing_fundamentals.example3;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */

public class IntervalsOvelapDetector {

    public boolean isOverlap(Interval interval1, Interval interval2) {
        return interval1.getEnd() > interval2.getStart() && interval1.getStart() < interval2.getEnd();
    }
}
