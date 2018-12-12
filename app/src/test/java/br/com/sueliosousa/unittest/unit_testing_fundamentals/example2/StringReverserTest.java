package br.com.sueliosousa.unittest.unit_testing_fundamentals.example2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sueliosousa on 11/12/18.
 * Copyright © 2018 Suelio Pss. All rights reserved.
 */
public class StringReverserTest {

    private StringReverser SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringReverser();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned() throws Exception {
        String result = SUT.reverse("");
        assertThat(result, is(""));
    }

    @Test
    public void reverse_singleCharacter_sameStringReturned() throws Exception {
        String result = SUT.reverse("a");
        assertThat(result, is("a"));
    }

    @Test
    public void reverse_longString_reverseStringReturned() throws Exception {
        String result = SUT.reverse("Vasily Zukanov");
        assertThat(result, is("vonakuZ ylisaV"));
    }
}