package com.example.tests;

import com.example.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by nicosimo on 23/12/2014.
 */

@RunWith(RobolectricGradleTestRunner.class)
public class MyAndroidClassTest {

    @Test
    public void testShouldFail() {
        assertTrue(true);
    }
}
