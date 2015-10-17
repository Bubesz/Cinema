package iit.cinema.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Attila on 2015.09.28..
 */
@Component
public class ServiceFacade {
    @Autowired
    private ICinemaLogic cinemaLogic;
    @Autowired
    private IReservationLogic reservationLogic;
    @Autowired
    private IUserLogic userLogic;

    public ICinemaLogic getCinemaLogic() {
        return cinemaLogic;
    }

    public void setCinemaLogic(ICinemaLogic cinemaLogic) {
        this.cinemaLogic = cinemaLogic;
    }

    public IReservationLogic getReservationLogic() {
        return reservationLogic;
    }

    public void setReservationLogic(IReservationLogic reservationLogic) {
        this.reservationLogic = reservationLogic;
    }

    public IUserLogic getUserLogic() {
        return userLogic;
    }

    public void setUserLogic(IUserLogic userLogic) {
        this.userLogic = userLogic;
    }
}
