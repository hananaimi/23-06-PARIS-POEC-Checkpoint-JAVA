import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int capacity;
    private List<String> places = new ArrayList<>();


    public Salle(int capacity, List<String> places) {
        this.capacity = capacity;
        this.places = places;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }
    public int SalleCapacity(Salle salle){
//        La capacité d'une salle est égale à la taille de la liste de places.
        List<String> places= salle.getPlaces();
        return places.size();
    }

}
