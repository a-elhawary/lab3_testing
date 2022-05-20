package DigitalClock;

public class Clock {
    private Timer seconds;
    private Timer minutes;
    private Timer hours;

    public Clock(){
        seconds = new Timer(false);
        minutes = new Timer(false);
        hours = new Timer(true);
    }

    public void reset(){
        seconds.setValue(0);
        minutes.setValue(0);
        hours.setValue(0);
    }

    public void secondPassed(){
        if(seconds.increment())
            if(minutes.increment())
                hours.increment();
    }

    public String getTime(){
        return hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue();
    }
}
