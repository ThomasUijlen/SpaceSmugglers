import processing.core.PImage;

public class Background {
	SpaceSmugglers app;
	PImage image;
	int x;
	Background(SpaceSmugglers p, PImage image) {
		this.app = p;
		this.image = image;
	}
	
	public void draw() {
		app.image(image,x,0);
	}
	
	public void move() {
		x -= 5;
	}
}
