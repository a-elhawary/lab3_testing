package DigitalClock;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ClockTest  {
    @Test
    public void ClockTimePass(){
        Clock clock = new Clock();
        for(int i = 0; i < 3639; i++){
            clock.secondPassed();
        }
        assertEquals("1:0:39", clock.getTime());
    }
}