// The time class is created to represent a moment in time
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    //Constructor for time class initiates the Time object and requires the user to declare the time in hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    //toString method for time class. Returns a string of the time in the format of a standard digital clock
    public String toString(){
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }
    //tick method that adds one second to the time.
    //If time passes 60 seconds add a minute
    //If time passes 60 minutes add an hour
    //If time passes 24 hours revert to 0 hours
    public void tick(){
        seconds ++;
        if(seconds == 60){
            seconds = 0;
            minutes ++;
            if(minutes == 60){
                minutes = 0;
                hours ++;
                if(hours == 24){
                    hours = 0;
                }
            }
        }
    }
    //GetHours method returns hours
    public int getHours() {
        return hours;
    }
    //GetMinutes method returns minutes
    public int getMinutes() {
        return minutes;
    }
    //GetSeconds method returns seconds
    public int getSeconds() {
        return seconds;
    }
    //Add time gets the hours, minutes, and seconds of a different time object
    public void add(Time additionalTime){
        seconds += additionalTime.getSeconds();
        if(seconds >= 60){
            seconds -= 60;
            minutes ++;
        }
        minutes += additionalTime.getMinutes();
        if(minutes >= 60){
            minutes -= 60;
            hours ++;
        }
        hours += additionalTime.getHours();
        if(hours >= 24){
            hours -= 24;
        }
    }
}
