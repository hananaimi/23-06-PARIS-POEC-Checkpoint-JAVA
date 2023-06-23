import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {
    private Film film;
    private Date date;
    private Time hour;
    private Salle salle;
    private List<Reservation> reservations;

    public Seance(Date date, Time hour, Film film, Salle salle, List<Reservation> reservations) {
        this.date = date;
        this.hour = hour;
        this.film = film;
        this.salle = salle;
        this.reservations = reservations;
    }
    public Seance(Date date, Time hour, Film film, Salle salle) {
        this.date = date;
        this.hour = hour;
        this.film = film;
        this.salle = salle;

    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservation addReservation(Reservation reservation){
//        Ajouter une réservation
        reservations.add(reservation);
        return reservation;

    }
    public boolean isFull(){
        List<Place> places = new ArrayList<>();
        //        qui renvoie true si toutes les places de la séance sont réservées, sinon false
        if (reservations.size()==salle.getCapacity()){
            return true;
        }
        return false;
    }
}
