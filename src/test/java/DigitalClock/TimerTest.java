package DigitalClock;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class TimerTest {
    @Test
    public void testSetValue(){
        Timer t = new Timer(false);
        t.setValue(10);
        assertEquals(10, t.getValue());
    }

    @Test
    public void testIncrement(){
        Timer t = new Timer(false);
        t.setValue(10);
        t.increment();
        assertEquals(11, t.getValue());
    }

    @Test
    public void testIncrementOverflow(){
        Timer t = new Timer(false);
        t.setValue(59);
        assertTrue(t.increment());
        assertEquals(0, t.getValue());
    }

}