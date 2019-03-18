import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class GameObject extends SpriteObject {
	SpaceSmugglers app;
	
	protected int health, startingHealth, size, value;
	
	GameObject(SpaceSmugglers p, int health, int size, int value) {
		super(new Sprite("src/main/data/textures/platform.png"));
		app = p;
		
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
