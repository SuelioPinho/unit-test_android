package br.com.sueliosousa.unittest.unit_testing_fundamentals.example3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */
public class IntervalsOvelapDetectorTest {

    private IntervalsOvelapDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalsOvelapDetector();
    }

    // interval1 is before interval2

    @Test
    public void isOverlap_interval1BeforeInterval2_falseReturned() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(8, 12);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval1 overlaps interval2 on start

    @Test
    public void isOverlap_interval1OverlapsInterval2OnStart_trueReturned() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval1 is contained within interval2

    @Test
    public void isOverlap_interval1ContainedWithinInterval2_trueReturned() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 12);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval1 contains interval 2

    @Test
    public void isOverlap_interval1ContainedInterval2_trueReturned() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(0, 3);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval1 overlaps interval2 on end

    @Test
    public void isOverlap_interval1OverlapsInterval2OnEnd_trueReturned() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 4);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval1 is after interval 2

    @Test
    public void isOverlap_interval1AfterInterval2_trueReturned() throws Exception {
        Interval interval1 = new Interval(5, 6);
        Interval interval2 = new Interval(-4, 4);

        boolean result = SUT.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }
}