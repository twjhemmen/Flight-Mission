import java.util.HashMap;

public class Office extends Room
{
    public Office(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
