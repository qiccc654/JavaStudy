package day5.T.T11;

public class Duration {
    private int hour;
    private int min;
    private int sec;
    public Duration(){}

    public Duration(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public Duration(int seconds) {
        this.hour = seconds/3600;
        this.min = (seconds%3600)/60;
        this.sec = ((seconds%3600)%60);
    }
    public int getTotalSeconds(){
        int seconds=this.hour*3600+this.min*60+this.sec;
        return seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Duration{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                ", 总秒数="+getTotalSeconds()+
                '}';
    }
}
