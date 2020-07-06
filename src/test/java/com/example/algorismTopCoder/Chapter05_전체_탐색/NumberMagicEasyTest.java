package com.example.algorismTopCoder.Chapter05_전체_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMagicEasyTest {

    @Test
    void theNumberTest1() {
        NumberMagicEasy m = new NumberMagicEasy();
        int theNumber = m.theNumber("YNYY");
        assertEquals(5, theNumber);
    }

}