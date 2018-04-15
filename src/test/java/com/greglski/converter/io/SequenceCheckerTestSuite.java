package com.greglski.converter.io;

import org.junit.Assert;
import org.junit.Test;



public class SequenceCheckerTestSuite {
    @Test
    public void testCheckSequence() {
        //Given
        SequenceChecker sequenceChecker = new SequenceChecker();
        sequenceChecker.getCheckList().add("P");
        sequenceChecker.getCheckList().add("F");

        //When
        String sequence = sequenceChecker.checkSequence("P");

        //Then
        Assert.assertEquals("FPP", sequence);
    }
}
