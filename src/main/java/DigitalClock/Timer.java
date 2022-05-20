package DigitalClock;

public class Timer {
    private int maxValue;
    private int currentValue = 0;

    public Timer(boolean isHours){
        maxValue = 60;
        if(isHours)
            maxValue = 24;
    }

    public boolean increment(){
       if(++currentValue == maxValue) {
           currentValue = 0;
           return true;
       }
       return false;
    }

    public void setValue(int value){
       if(value >= 0 && value < maxValue)
           currentValue = value;
    }

    public int getValue(){
        return currentValue;
    }
}
