package br.com.sueliosousa.unittest.unit_testing_fundamentals.example1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */
public class PositiveNumberValidatorTest {

    private PositiveNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new PositiveNumberValidator();
    }

    @Test
    public void test1() {
        boolean result = SUT.isPositive(-1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test2() {
        boolean result = SUT.isPositive(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test3() {
        boolean result = SUT.isPositive(1);
        Assert.assertThat(result, is(true));
    }

}