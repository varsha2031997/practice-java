import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meetings {


    LocalTime StartTime;
    LocalTime endTime;


    @Override
    public String toString() {
        return "Meetings{" +
                "StartTime=" + StartTime +
                ", endTime=" + endTime +
                ",durationofmeeting="+durationOfMeeting()+
                '}';
    }

    Meetings(LocalTime Starttime,LocalTime endTime)
    {
        this.StartTime=Starttime;
        this.endTime=endTime;

    }

    public long durationOfMeeting()
    {
        return Duration.between(endTime,StartTime).toMinutes();
    }

    public static void main(String[] args) {
        List<Meetings> meet = new ArrayList<>();
        meet.add(new Meetings(LocalTime.of(14, 30, 1), LocalTime.of(11, 15, 2)));
        meet.add(new Meetings(LocalTime.of(13, 30, 1), LocalTime.of(10, 14,1)));
        meet.add(new Meetings(LocalTime.of(12, 30, 1), LocalTime.of(9, 13,1)));
        meet.add(new Meetings(LocalTime.of(11, 30, 1), LocalTime.of(8, 12,1)));

        Collections.sort(meet, new Comparator<Meetings>() {
            @Override
            public int compare(Meetings o1, Meetings o2) {
                return Long.compare(o1.durationOfMeeting(),o2.durationOfMeeting());
            }
        });

        for(Meetings meets : meet)
        {
            System.out.println(meets);
        }










    }




}
