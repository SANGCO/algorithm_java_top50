package com.example.programmers.a_해시;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncompletePlayerTest {

    @Test
    void solution1() {
        IncompletePlayer i = new IncompletePlayer();
        String answer = i.solution1(new String[]{"kiki", "eden", "leo"}, new String[]{"kiki", "eden"});
        assertEquals("leo", answer);
        answer = i.solution2(new String[]{"kiki", "eden", "leo"}, new String[]{"kiki", "eden"});
        assertEquals("leo", answer);
    }

    @Test
    void solution2() {
        IncompletePlayer i = new IncompletePlayer();
        String answer = i.solution1(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                                    new String[]{"josipa", "filipa", "marina", "nikola"});
        assertEquals("vinko", answer);
        answer = i.solution1(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                             new String[]{"josipa", "filipa", "marina", "nikola"});
        assertEquals("vinko", answer);
    }

    @Test
    void solution3() {
        IncompletePlayer i = new IncompletePlayer();
        String answer = i.solution1(new String[]{"mislav", "stanko", "mislav", "ana"},
                                    new String[]{"stanko", "ana", "mislav"});
        assertEquals("mislav", answer);
        answer = i.solution1(new String[]{"mislav", "stanko", "mislav", "ana"},
                             new String[]{"stanko", "ana", "mislav"});
        assertEquals("mislav", answer);
    }
}