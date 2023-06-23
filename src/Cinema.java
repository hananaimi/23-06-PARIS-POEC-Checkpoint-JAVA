import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List <Film> films;
    private List<Seance> seances= new ArrayList<>();
    private List<Salle> salles = new ArrayList<>();

    public Cinema(String name, String address, List<Film> films, List<Seance> seances, List<Salle> salles) {
        this.name = name;
        this.address = address;
        this.films = films;
        this.seances = seances;
        this.salles = salles;
    }

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public void addFilm(Film film){
//        Ajouter un film
        films.add(film);
    }
    public void removeFilm(Film film){
//        Supprimer un film
        films.remove(film);
    }
    public void scheduleSeance(Film film, Date date, Time hour, Salle salle){
//        Programmer une séance
        Seance seance= new Seance(date, hour, film, salle);

    }
    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date){
//        Récupérer toutes les séances d'un film à une date donnée
        List<Seance> seanceForFilmOnDate= new ArrayList<>();
        for (Seance seance : seances){
            if(seance.getFilm().equals(film) && (seance.getDate().equals(date))){
                seanceForFilmOnDate.add( seance);
            }
        }
    return  seanceForFilmOnDate;
    }

    public void addSalle(Salle salle){
        // Ajout des salles au cinéma
        salles.add(salle);
    }



}
