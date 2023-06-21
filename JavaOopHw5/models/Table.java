package JavaOopHw5.models;

import java.util.ArrayList;
// import java.util.Collection;

public class Table {

    private static int counter = 100;

    private final ArrayList<Reservation> reservations = new ArrayList<>();
    private final int no;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
