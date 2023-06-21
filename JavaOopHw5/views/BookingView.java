package JavaOopHw5.views;

import java.util.Collection;
import java.util.Date;

import JavaOopHw5.models.Table;
import JavaOopHw5.presenters.View;
import JavaOopHw5.presenters.ViewObserver;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    
    // Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

   
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
