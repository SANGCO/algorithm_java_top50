package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoystickTest {

    @Test
    void solution1() {
        Joystick j = new Joystick();
        int answer = j.solution("JEROEN");
        assertEquals(56, answer);
    }

    @Test
    void solution2() {
        Joystick j = new Joystick();
        int answer = j.solution("JAN");
        assertEquals(23, answer);
    }
}