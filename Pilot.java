import java.util.Arraylist;

public class Pilot
{
	private Arraylist<Item> items;
	private int backPackMax;
	private int backPackSize;
	private int getal;
	
	public pilot(int backPackMax){
	items = new Arraylist<Item>();
	this.backPackMax = backPackMax;
	backPackSize = 0
	}

	public void takeItem(Item itemToPickUp)
	if (item.getWeight + backPackSize < backPackMax){
		items.add(itemToPickUp);
		backPackSize = backPackSize + item.getWeight;
		}
	else {
		System.out.println("You can't pick up this item because your backpack is full. Drop off some items first.")
	}
		
	public void dropItem(Item itemToDrop){
		currentRoom.setItem(itemToDrop);
		items.
	}
}
