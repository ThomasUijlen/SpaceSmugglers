import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import nl.han.ica.oopg.collision.ICollidableWithGameObjects;
import nl.han.ica.oopg.objects.GameObject;
import java.util.List;
import java.util.Vector;

public class BlueprintSlot extends SpriteObject {
	SpaceSmugglers app;
	boolean available = false;
	boolean occupied = false;
	Sprite sp;
	
	public BlueprintSlot(SpaceSmugglers p, Sprite sp) {
		super(sp);
		this.app = p;
		setWidth(50);
		setHeight(50);
		this.sp = sp;
		
	}
	
	@Override
	public void update() {
		removeSlot();
		mousePressed();
		checkStatus();
	}
	
	private void removeSlot() {
		if(occupied) {
			app.deleteGameObject(this);
		}
	}
	
	public void checkStatus() {
		Vector<GameObject> slot = app.getGameObjectItems();
		for(GameObject p : slot) {
			if(p instanceof BlueprintSlot) {
				BlueprintSlot b = (BlueprintSlot)p;
				
				if(b.occupied == true) {
				if(b.x == x-width && b.y == y
						|| b.x == x+width && b.y == y
						|| b.x == x && b.y == y+height
						|| b.x == x && b.y == y-height) {
					available = true;
				}
				}
			}
		}
		
		if(available) {
			sp.setSprite("src/main/data/textures/greenSlot.png");
		}
	}
	
//	private void drawSlot() {
//		app.stroke(0,0,255);
//		app.strokeWeight(5);
//		app.fill(0,0,0,0);
//		app.rect(x,y,size,size);
//	}
	
	private void mousePressed() {
		if(app.mousePressed && app.mouseButton == LEFT) {
			if(app.mouseX >= x && app.mouseX < x + width && app.mouseY > y && app.mouseY < y + height && available) {
				fillSlot();
			}
		}
	}
	
	public void fillSlot() {
		Sprite sp = new Sprite("src/main/data/textures/platform.png");
		Platform g = new Platform(app, sp, 100, 100, 100);
		app.addGameObject(g, x, y);
		occupied = true;
	}
}
