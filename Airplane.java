import java.util.HashMap;

public class Airplane
{
   private HashMap<String, Object> accessories;

    /**
     * constructor crerate the memory and storage for the accessories to store
     */
   public Airplane(){

       this.accessories = new HashMap<String, Object>();

       this.accessories.put("key", null);
       this.accessories.put("propeller", null);
       this.accessories.put("flight schedule", null);
       this.accessories.put("socket wrench", null);
    }
}
