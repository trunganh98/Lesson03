package Buoi4;

public class Time3 {
    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }

    }
    public void setTime3(int second, int minute, int hour) {
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }
    public Time3(int second, int minute, int hour){
        this.setTime3(second, minute, hour);
    }
    public Time3() {
        this.second = 0;
        this.minute = 0;
        this.hour =0;
    }
    public int getSecond() {
        return this.second;
    }
    public  int getMinute() {
        return this.minute;
    }
    public  int getHour() {
        return this.hour;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time3 nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}
