package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilTest
{

    @Test
    void isHappyHour()
    {
        LocalDateTime notHappyHour = LocalDateTime.of(2019, 2, 13, 11, 0);
        LocalDateTime happyHour = LocalDateTime.of(2019, 2, 13, 17, 0);

        assertFalse(DateTimeUtil.isHappyHour(notHappyHour));
        assertTrue(DateTimeUtil.isHappyHour(happyHour));
    }
}