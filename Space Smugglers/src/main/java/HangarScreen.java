import java.util.Vector;
import nl.han.ica.oopg.objects.GameObject;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.persistence.FilePersistence;
import nl.han.ica.oopg.persistence.IPersistence;

import java.util.Vector;

public class HangarScreen {
	SpaceSmugglers app;
	boolean active = false;
	int ship = 0;
	Button b1;
	Button b2;
	int shipAmount = 14;
	
	int[] unlocked = new int[shipAmount];
	
	HangarScreen(SpaceSmugglers app) {
		this.app = app;
		Sprite sp1 = new Sprite("src/main/data/textures/buttonLeft.png");
		Sprite sp2 = new Sprite("src/main/data/textures/buttonRight.png");
		b1 = new Button(app, sp1);
		b2 = new Button(app, sp2);
	}
	
	public void load() {
		app.addGameObject(b1, 50,app.height-100);
		app.addGameObject(b2, 200,app.height-100);
	}
	
	public void update() {
		if(ship > 0) {
			if(b1.clicked()) {
				ship--;
				clearBlueprint();
				loadShip();
			}
		}
		if(ship < shipAmount-1) {
			if(b2.clicked()) {
				ship++;
				clearBlueprint();
				loadShip();
			}
		}
	}
	
	public void clearBlueprint() {
		Vector<GameObject> slot = app.getGameObjectItems();
		for(int i = slot.size()-1; i >= 0; i--) {
			GameObject p = slot.get(i);
			if(p instanceof BlueprintSlot || p instanceof Platform || p instanceof ShipCore) {
				app.deleteGameObject(p);
			}
		}
	}
	
	public void loadShip() {
		ShipPattern p = new ShipPattern(app, ship);
		boolean u;
		if(unlocked[ship] == 0) {
			u = false;
		} else {
			u = true;
		}
		p.loadPattern(u);
	}
	
	public void loadSave() {
		for(int i = 0; i < shipAmount; i++) {
			IPersistence save = new FilePersistence("main/data/saves/ship"+i+".txt");
			if (save.fileExists()) {
        		unlocked[i] = Integer.parseInt(save.loadDataString());
        		System.out.println("blub");
        	}
		}
	}
	
	public void saveSave() {
		for(int i = 0; i < shipAmount; i++) {
			IPersistence save = new FilePersistence("main/data/saves/ship"+i+".txt");
			if (save.fileExists()) {
				save.saveData(Integer.toString(unlocked[i]));
			}
		}
	}
}
