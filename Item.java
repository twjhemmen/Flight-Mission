
public class Item
{
    private String itemName;
    private int itemWeight;

    public Item(String item){
        this.itemName = item;
    }

    public String getName(){
        return this.itemName;
    }
    
    public String getWeight(){
        return this.itemWeight;
    }

}
