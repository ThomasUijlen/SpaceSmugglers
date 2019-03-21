import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class SpaceObject extends SpriteObject {
	SpaceSmugglers app;
	Sprite sp;
	protected int health, startingHealth, size, value;
	
	SpaceObject(SpaceSmugglers p, Sprite sp, int health, int size, int value) {
		super(sp);
		app = p;
		this.sp = sp;
		this.health = health;
		this.startingHealth = health;
		this.size = size;
		this.value = value;
	}
	
	@Override
	public void update() {
		
	}
	
	public boolean removeHealth(int amount) {
		health -= amount;
		if(health < 0) {
			return true;
		} else {
			return false;
		}
	}
}
