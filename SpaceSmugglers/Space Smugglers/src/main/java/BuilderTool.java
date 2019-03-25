import nl.han.ica.oopg.objects.Sprite;

public class BuilderTool extends SpaceObject{
	
	String type;
	
	BuilderTool(SpaceSmugglers p, Sprite sp, int health, int size, int value, String type) {
		super(p, sp, health, size, value);
		
		this.type = type;
		
	}



	
	
	if(type == 1) {
		Sprite sp = new Sprite("src/main/data/textures/Engine1.png");
		Engine e = new Engine(app, sp, 100, 100, 100, 1);
		app.addGameObject(e, x, y);
		
	}else if(type == 2) {
		Sprite sp = new Sprite("src/main/data/textures/Machinegun1.png");
		Machinegun m = new Machinegun(app, sp, 100, 100, 100, 1, 1, 12, 15);
		app.addGameObject(m, x, y);
		
	}else if(type == 3) {
		Sprite sp = new Sprite("src/main/data/textures/Laser1.png");
		Laser l = new Laser(app, sp, 100, 100, 100, 1, 1, 12, 15);
		app.addGameObject(l, x, y);
		
	}else if(type == 4) {
		Sprite sp = new Sprite("src/main/data/textures/Rocket1.png");
		Rocket r = new Rocket(app, sp, 100, 100, 100, 1, 1, 12, 15);
		app.addGameObject(r, x, y);
		
	}else if(type == 5) {
		Sprite sp = new Sprite("src/main/data/textures/Plasma1.png");
		Plasma p = new Plasma(app, sp, 100, 100, 100, 1, 1, 12, 15);
		app.addGameObject(p, x, y);
	}

	
}
