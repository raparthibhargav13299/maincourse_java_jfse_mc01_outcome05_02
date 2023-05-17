package com.stackroute.commonjavaclasses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Period;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankDepositTests {

    BankDeposit bankDeposit;

    @BeforeEach
    void setUp() {
        bankDeposit = new BankDeposit();
    }

//    @Test
//    void getMaturityDateTest () {
//        assertEquals("6/06/2020", bankDeposit.getMaturityDate("06/01/2020", Period.ofMonths(5)));
//    }

    @Test
    void getMaturityDateFailTest () {
        assertNotEquals("7/06/2020", bankDeposit.getMaturityDate("06/05/2020", Period.ofMonths(5)));
    }

    @Test
    void getMaturityDateNullTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getMaturityDate(null, Period.ofMonths(2));
        });
    }
    @Test
    void getMaturityDateEmptyTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getMaturityDate("", Period.ofMonths(2));
        });
    }

//    @Test
//    void getInvestmentDurationTest () {
//        String expected = "Years 1 Months 1 Days 1";
//        assertEquals(expected, bankDeposit.getInvestmentDuration("5/01/2020", "6/02/2021"));
//    }
//
//    @Test
//    void getInvestmentDurationFailTest () {
//        String unexpected = "Years 2 Months 7 Days 3";
//        assertNotEquals(unexpected, bankDeposit.getInvestmentDuration("5/05/2020", "6/12/2021"));
//    }

    @Test
    void getInvestmentDurationNullEmptyTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getInvestmentDuration("", null);
        });
    }

    @Test
    void getInvestmentDurationNullEmpty1TestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bankDeposit.getInvestmentDuration(null, "");
        });
    }
}
/* Write test cases for positive and negative scenarios*/
