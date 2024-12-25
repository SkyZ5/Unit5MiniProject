public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString(){
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }

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

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

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
