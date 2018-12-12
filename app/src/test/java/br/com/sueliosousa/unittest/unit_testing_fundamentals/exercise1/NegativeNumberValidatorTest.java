package br.com.sueliosousa.unittest.unit_testing_fundamentals.exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */
public class NegativeNumberValidatorTest {

    private NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void testWithOne() {
        boolean result = SUT.isNegative(1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void testWithZero() {
        boolean result = SUT.isNegative(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void testWithMinusOne() {
        boolean result = SUT.isNegative(-1);
        Assert.assertThat(result, is(true));
    }
}