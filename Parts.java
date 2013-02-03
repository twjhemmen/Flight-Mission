import java.util.HashMap;

public class Parts extends Room
{
    public Parts(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
}
