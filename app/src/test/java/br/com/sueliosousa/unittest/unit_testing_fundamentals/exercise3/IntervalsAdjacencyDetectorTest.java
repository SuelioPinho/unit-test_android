package br.com.sueliosousa.unittest.unit_testing_fundamentals.exercise3;

import org.junit.Before;
import org.junit.Test;

import br.com.sueliosousa.unittest.unit_testing_fundamentals.example3.Interval;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by sueliosousa on 23/01/19.
 * Copyright © 2019 Suelio Pss. All rights reserved.
 */
public class IntervalsAdjacencyDetectorTest {

    private IntervalsAdjacencyDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalsAdjacencyDetector();
    }

    /**
     * Interval 1 overlaps Interval 2 on start
     */

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnStart_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval 1 overlaps Interval 2 on end
     */

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnEnd_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval 1 contains Interval 2
     */

    @Test
    public void isAdjacent_interval1ContainsInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 4);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval 1 contained within Interval 2
     */

    @Test
    public void isAdjacent_interval1ContainedWithinInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-3, 8);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval before Interval 2 with different values
     */

    @Test
    public void isAdjacent_interval1BeforeInterval2WithDifferentValues_falseReturned() {
        Interval interval1 = new Interval(-1, 2);
        Interval interval2 = new Interval(3, 8);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval 1 after Interval 2 with different values
     */

    @Test
    public void isAdjacent_interval1AfterInterval2WithDifferentValues_falseReturned() {
        Interval interval1 = new Interval(9, 10);
        Interval interval2 = new Interval(3, 8);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    /**
     * Interval 1 end equal Interval 2 start
     */

    @Test
    public void isAdjacent_interval1EndEqualInterval2Start_trueReturned() {
        Interval interval1 = new Interval(-1, 2);
        Interval interval2 = new Interval(2, 8);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    /**
     * Interval 1 start equal Interval 2 end
     */

    @Test
    public void isAdjacent_interval1StartEqualInterval2End_trueReturned() {
        Interval interval1 = new Interval(8, 9);
        Interval interval2 = new Interval(2, 8);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    /**
     * Interval 1 equal Interval 2
     */

    @Test
    public void isAdjacent_interval1EqualInterval2_falseReturned() {
        Interval interval1 = new Interval(8, 9);
        Interval interval2 = new Interval(8, 9);

        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

}