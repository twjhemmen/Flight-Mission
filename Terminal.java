import java.util.HashMap;

public class Terminal extends Room
{
    public Terminal(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
