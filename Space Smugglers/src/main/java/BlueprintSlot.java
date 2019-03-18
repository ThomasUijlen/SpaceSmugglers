import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class BlueprintSlot extends SpriteObject {
	int x, y;
	int size;
	SpaceSmugglers app;
	
	public BlueprintSlot(SpaceSmugglers p, int x, int y, int size) {
		super(new Sprite("src/main/data/textures/greenSlot.png"));
		this.app = p;
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	@Override
	public void update() {
	}
	
	void drawSlot() {
		app.stroke(0,0,255);
		app.strokeWeight(5);
		app.fill(0,0,0,0);
		app.rect(x,y,size,size);
	}
	
	void mousePressed() {
		GameObject g = new GameObject(app, 100, 100, 100);
        app.addGameObject(g, x, y);
	}
}
