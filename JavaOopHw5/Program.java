package JavaOopHw5;

import java.util.Date;

import JavaOopHw5.models.TableModel;
import JavaOopHw5.presenters.BookingPresenter;
import JavaOopHw5.views.BookingView;

public class Program {

    
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTable(new Date(), 103, "Станислав");

        bookingPresenter.showTables();
        bookingView.changeReservationTable(9001, new Date(), 103, "Станислав");

        bookingPresenter.showTables();
    }

}
