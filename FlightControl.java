import java.util.HashMap;

public class FlightControl extends Room
{
    public FlightControl(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
