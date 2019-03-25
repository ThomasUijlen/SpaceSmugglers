import nl.han.ica.oopg.objects.Sprite;

public class HoldingBay extends SpaceObject {

	protected int id;
	protected int lvl;
	protected int maxCapacity;
	protected int amount;
	
	HoldingBay(SpaceSmugglers p, Sprite sp, int health, int size, int value, int id, int lvl, int maxCapacity, int amount){
		super(p, sp, health, size, value);
		this.id = id;
		this.lvl = lvl;
		this.maxCapacity = maxCapacity;
		this.amount = amount;
	}
}
