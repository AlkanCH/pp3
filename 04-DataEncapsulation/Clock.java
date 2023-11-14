public class Clock {
    private int hour;
    private  int minute;

    public void setHour(int hour) {
        if(hour>=0&&hour<=23) {
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if(minute>=0&&minute<=59) {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public void addMinute() {
        this.minute++;
        if(minute==60){
            this.hour++;
            this.minute=0;
            
        }
       if(hour==24){
                hour=0;
            }
    }
}
