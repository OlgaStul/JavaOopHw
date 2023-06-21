package JavaOopHw5.presenters;

import java.util.Collection;

import JavaOopHw5.models.Table;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);

}
