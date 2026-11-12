package com.calculator.billcalculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class electricitybilltest {

    electricitybill eb = new electricitybill();

    @Test
    public void testBillFor100Units() {
        assertEquals(150.0, eb.calculateBill(100), 0.01);
    }

    @Test
    public void testBillFor150Units() {
        assertEquals(275.0, eb.calculateBill(150), 0.01);
    }

    @Test
    public void testBillFor200Units() {
        assertEquals(400.0, eb.calculateBill(200), 0.01);
    }

    @Test
    public void testBillFor250Units() {
        assertEquals(600.0, eb.calculateBill(250), 0.01);
    }

    @Test
    public void testBillFor300Units() {
        assertEquals(800.0, eb.calculateBill(300), 0.01);
    }

    @Test
    public void testBillFor350Units() {
        assertEquals(1050.0, eb.calculateBill(350), 0.01);
    }
}