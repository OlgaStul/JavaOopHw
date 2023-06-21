package JavaOopHw5.presenters;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Date;

import JavaOopHw5.models.Table;

public interface Model {


    // Получение списка всех столиков
    ArrayList<Table> loadTables();

   
    //Бронирование столика
    
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
