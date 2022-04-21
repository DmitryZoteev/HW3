package ch9.clocks;

public class WorldClock extends Clock{
    private int timeOffset;

    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    @Override
    public String getHours(){
        return String.valueOf(Integer.parseInt(super.getHours()) + timeOffset);
    }
}
