package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoystickTest {

    private Joystick j;

    @BeforeEach
    public void setUp() {
        j = new Joystick();
    }

    @Test
    void solution1() {
        int answer = j.solution("JEROEN");
        assertEquals(56, answer);
    }

    @Test
    void solution2() {
        int answer = j.solution("JAN");
        assertEquals(23, answer);
    }

    @Test
    void solution3() {
        int answer = j.solution("JAZ");
        assertEquals(11, answer);
    }

    @Test
    void solution4() {
        int answer = j.solution("ABABAAAAABA");
        assertEquals(11, answer);
    }
}