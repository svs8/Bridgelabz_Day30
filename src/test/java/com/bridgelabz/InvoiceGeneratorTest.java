package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals("fare",25,fare,0.0);

    }

}
