package iit.cinema.status;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Attila on 2016.02.23.
 */
public class ReservationStatusTest {

    @Test
    public void testReserved() {
        assertTrue("1", ReservationStatus.RESERVED.isReserved());
        assertTrue("2", ReservationStatus.SOLD.isSold());
        assertFalse("3", ReservationStatus.RESERVED.isSold());
        assertFalse("4", ReservationStatus.SOLD.isReserved());
    }
}