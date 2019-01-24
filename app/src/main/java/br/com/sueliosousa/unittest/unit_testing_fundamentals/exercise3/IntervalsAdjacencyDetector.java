package br.com.sueliosousa.unittest.unit_testing_fundamentals.exercise3;

import br.com.sueliosousa.unittest.unit_testing_fundamentals.example3.Interval;

/**
 * Created by sueliosousa on 23/01/19.
 * Copyright © 2019 Suelio Pss. All rights reserved.
 */

public class IntervalsAdjacencyDetector {

    /**
     * @return true if the intervals are adjacent, but don't overlap
     */
    public boolean isAdjacent(Interval interval1, Interval interval2) {
        return (interval1.getEnd() == interval2.getStart() || interval1.getStart() == interval2.getEnd())
                && !isSameIntervals(interval1, interval2);
    }

    private boolean isSameIntervals(Interval interval1, Interval interval2) {
        return interval1.getStart() == interval2.getStart() && interval1.getEnd() == interval2.getEnd();
    }
}
