import nl.han.ica.oopg.objects.Sprite;
public class ActiveObject extends SpaceObject {
	
	int health;
	int size;
	int value;
	
	ActiveObject(SpaceSmugglers p, Sprite sp, int health, int size, int value){
	super(p, sp, health, size, value);
	this.health = health;
	this.size = size;
	this.value = value;
	}
	protected float rotation;
	
	public void locateTarget() {
		
	}
	
}
