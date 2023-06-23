import java.util.HashMap;
import java.util.Map;

public class Place {
    private String number;

    public Place(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    Map<Seance, Boolean> isOccupied = new HashMap<>();
}
