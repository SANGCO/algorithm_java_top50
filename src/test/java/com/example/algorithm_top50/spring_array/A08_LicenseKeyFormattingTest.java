package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A08_LicenseKeyFormattingTest {

    @Test
    void licenseKeyFormatting() {
        A08_LicenseKeyFormatting l = new A08_LicenseKeyFormatting();
        String answer = l.licenseKeyFormatting("8F3Z-2e-9-w", 4);
        assertEquals("8F3Z-2E9W", answer);
        answer = l.licenseKeyFormatting("8-5g-3-J", 4);
        assertEquals("8-5G3J", answer);
    }

    @Test
    void licenseKeyFormatting_do() {
        A08_LicenseKeyFormatting_do l = new A08_LicenseKeyFormatting_do();
        String answer = l.licenseKeyFormatting("8F3Z-2e-9-w", 4);
        assertEquals("8F3Z-2E9W", answer);
        answer = l.licenseKeyFormatting("8-5g-3-J", 4);
        assertEquals("8-5G3J", answer);
    }
}