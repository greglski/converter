package com.greglski.converter.io;

import org.junit.Assert;
import org.junit.Test;



public class SequenceCheckerTestSuite {
    @Test
    public void testCheckSequenceFPP() {
        //Given
        SequenceChecker sequenceChecker = new SequenceChecker();
        sequenceChecker.getCheckList().add("P");
        sequenceChecker.getCheckList().add("F");

        //When
        String sequence = sequenceChecker.checkSequence("P");

        //Then
        Assert.assertEquals("FPP", sequence);
        Assert.assertEquals(1, sequenceChecker.getCheckList().size());
    }

    @Test
    public void testCheckSequencePP() {
        //Given
        SequenceChecker sequenceChecker = new SequenceChecker();
        sequenceChecker.getCheckList().add("P");

        //When
        String sequence = sequenceChecker.checkSequence("P");

        //Then
        Assert.assertEquals("PP", sequence);
        Assert.assertEquals(1, sequenceChecker.getCheckList().size());

    }
}
