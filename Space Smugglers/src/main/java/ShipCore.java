import nl.han.ica.oopg.objects.Sprite;
import processing.core.PGraphics;

public class ShipCore extends SpaceObject {
	
	ShipCore(SpaceSmugglers p, Sprite sp, int health, int size, int value) {
		super(p, sp, health, size, value);
	}
	
	@Override
    public void draw(PGraphics g) {
		g.tint(255);
        g.image(sp.getPImage(),x,y);
    }
}
