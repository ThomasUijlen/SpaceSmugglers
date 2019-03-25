import nl.han.ica.oopg.objects.Sprite;

public class Turret extends ActiveObject {

	protected int type;
	protected int lvl;
	protected int damage;
	protected int range;
	
	Turret(SpaceSmugglers p, Sprite sp, int type, int lvl, int damage, int range, int health, int size, int value) {
		super(p, sp, health, size, value);
		app = p;
		this.sp = sp;
		this.type = type;
		this.lvl = lvl;
		this.damage = damage;
		this.range = range;
		
		
	}
	
	public void update() {
		
		
	}
	
	public void findTarget() {
		
	}
	
}
