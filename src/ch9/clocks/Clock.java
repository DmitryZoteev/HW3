package ch9.clocks;

public class Clock {
    protected int hours;
    protected int minutes;
    protected boolean setAlarm;

    public String getTime(){
        if (setAlarm && Integer.parseInt(getHours()) >= hours && Integer.parseInt(getMinutes()) >= minutes){
            System.out.println("\u23F0");
            setAlarm = false;
        }
        return getHours() + ":" + getMinutes();
    }

    public String getHours(){
        String time = java.time.LocalTime.now().toString();
        return time.substring(0, time.indexOf(".")).split(":")[0];
    }

    public String getMinutes(){
        String time = java.time.LocalTime.now().toString();
        return time.substring(0, time.indexOf(".")).split(":")[1];
    }

    public void setAlarm(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
        setAlarm = true;
    }
}
