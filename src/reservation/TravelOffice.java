package reservation;

public class TravelOffice {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jan Kowalski");
        Trip t1 = new Trip(new Date(2021,2,1), new Date(2021,2,3), "Kreta");
        c1.assignTrip(t1);
        c1.setAddress("katowice");

        System.out.println( c1.getInfo());
    }

}
