import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class BlueprintSlot extends SpriteObject {
	SpaceSmugglers app;
	
	public BlueprintSlot(SpaceSmugglers p, Sprite s, int x, int y) {
		super(s);
		this.app = p;
		this.x = x;
		this.y = y;
		setWidth(100);
		setHeight(100);
		
	}
	
	@Override
	public void update() {
		mousePressed();
	}
	
//	private void drawSlot() {
//		app.stroke(0,0,255);
//		app.strokeWeight(5);
//		app.fill(0,0,0,0);
//		app.rect(x,y,size,size);
//	}
	
	private void mousePressed() {
		if(app.mousePressed && app.mouseButton == LEFT) {
			if(app.mouseX >= x && app.mouseX < x + width && app.mouseY > y && app.mouseY < y + height) {
				GameObject g = new GameObject(app, 100, 100, 100);
				app.addGameObject(g, x, y);
			}
		}
	}
}
