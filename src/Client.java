import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private List<Reservation> reservations= new ArrayList<>();

    public Client(String name, String email, List<Reservation> reservations) {
        this.name = name;
        this.email = email;
        this.reservations = reservations;
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    public void getAllSeancesForFilmOnDate(Film film, Date date){

    }
    public Reservation reserve(Seance seance, Salle salle, String place){
//        vérifier si la séance n'est pas complète
//        Si la séance est complète, la méthode retourne null
//        crée et retourne une Reservation

        if ( seance.isFull() ){
            return null;
        }
        else {
            Reservation reservation = new Reservation(seance,salle,place);
            return (reservation)  ;
        }
    }

}
