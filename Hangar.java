import java.util.HashMap;

public class Hangar extends Room
{
    public Hangar(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
