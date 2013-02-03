import java.util.HashMap;

public class Parking extends Room
{
    public Parking(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
