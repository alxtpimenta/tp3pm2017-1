/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author alex
 */
public class Clock {
    private long passingRate;
    
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock()
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    
    public String getCurrentTime()
    {
        return Integer.toString(this.hours)+":"+Integer.toString(this.minutes)+":"+Integer.toString(this.seconds);
    }
    
    public void setCurrentTime(int hr, int mins, int secs)
    {
        this.hours = hr;
        this.minutes = mins;
        this.seconds = secs;
    }
    
    public void setPassingRate(long rate)
    {
        this.passingRate = rate;
    }
    
    public long getPassingRate()
    {
        return this.passingRate;
    }
    
    public void tick()
    {
        this.seconds++;
        if(this.seconds > 59)
        {
            this.seconds = 0;
            this.minutes++;
            if(this.minutes > 59)
            {
                this.minutes = 0;
                this.hours++;
                if(this.hours > 23)
                {
                    this.hours = 0;
                    this.minutes = 0;
                    this.seconds = 0;
                }
            }
        }
    }
}
