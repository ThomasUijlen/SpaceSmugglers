import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import processing.core.PGraphics;

public class Button extends SpriteObject {
	SpaceSmugglers app;
	Sprite sp;
	boolean hover = false;
	int timeClicked = 0;
	
	Button(SpaceSmugglers app, Sprite sp) {
		super(sp);
		this.sp = sp;
		this.app = app;
	}
	
	@Override
	public void update() {
		if(app.mouseX > x && app.mouseX < x+width && app.mouseY > y && app.mouseY < y+height) {
			hover = true;
		} else {
			hover = false;
		}
	}
	
	@Override
    public void draw(PGraphics g) {
		if(hover) {
			g.tint(255);
		} else {
			g.tint(200);
		}
        g.image(sp.getPImage(),x,y);
    }
	
	public boolean clicked() {
		if(hover && app.mousePressed && app.millis()-timeClicked > 200) {
			timeClicked = app.millis();
			return true;
		} else {
			return false;
		}
	}
}
