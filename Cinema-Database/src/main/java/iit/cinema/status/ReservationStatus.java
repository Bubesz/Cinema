package iit.cinema.status;

/**
 * Created by Attila on 2015.09.27..
 */
public enum ReservationStatus {
    RESERVED,
    SOLD;

    public boolean isReserved() {
        return RESERVED.equals(this);
    }

    public boolean isSold() {
        return SOLD.equals(this);
    }

}
