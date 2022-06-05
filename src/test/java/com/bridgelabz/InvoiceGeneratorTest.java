package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator;
    @Before
    public void setUp() throws Exception {
        invoiceGenerator=new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnFare(){
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals("fare",25,fare,0.0);

    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare(){
        double distance=0.1;
        int time=1;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals("fare",5,fare,0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
        Ride[] rides={new Ride(2.0,5),
                      new Ride(0.1,1)
                      };
        double fare=invoiceGenerator.calculateFare(rides);
        Assert.assertEquals("fare",30,fare,0.0);
    }

}
