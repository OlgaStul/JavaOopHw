package JavaOopHw5.models;

// import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Date;

import JavaOopHw5.presenters.Model;

public class TableModel implements Model {

    private ArrayList<Table> tables;

    
    // Получение списка всех столиков
    
    public ArrayList<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                for (Reservation reservation : table.getReservations()){
                    if (reservationTable(reservationDate, tableNo, name) == oldReservation){
                        int index = table.getReservations().indexOf(reservation);
                        table.getReservations().remove(index);
                        break;
                    }
                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        }
        return -1;
    }
}

