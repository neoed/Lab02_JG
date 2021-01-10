package reservation;

public class Trip {
    Date start;
    Date end;
    String destination;
    public Trip(Date start, Date end, String destination){
        this.start = start;
        this.end = end;
        this.destination = destination;
    }
    public String getInfo(){
        return "rozpoczęcie "+start.getInfo()+", zakończenie "+end.getInfo()+", miejsce docelowe "+destination+"\n";

    }
}
