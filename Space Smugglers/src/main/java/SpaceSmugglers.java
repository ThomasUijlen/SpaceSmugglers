
import java.util.ArrayList;
import java.util.Vector;

import nl.han.ica.oopg.dashboard.Dashboard;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.objects.GameObject;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.persistence.FilePersistence;
import nl.han.ica.oopg.persistence.IPersistence;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.EdgeFollowingViewport;
import nl.han.ica.oopg.view.View;
import processing.core.PApplet;
import processing.core.PImage;

public class SpaceSmugglers extends GameEngine{

	public static void main(String[] args) {
        String[] processingArgs = {"SpaceSmugglers.java"};
        SpaceSmugglers mySketch = new SpaceSmugglers();

        PApplet.runSketch(processingArgs, mySketch);
    }
	
	String currentScreen = "hangar";
	HangarScreen hs;
	Background b1;
	Background b2;
	@Override
	public void setupGame() {

        int worldWidth = 1000;
        int worldHeight = 1000;
        
        View view = new View(worldWidth, worldHeight);
        setView(view);
        size(worldWidth, worldHeight);
        //fullScreen();
        
        hs = new HangarScreen(this);
        hs.loadSave();
        hs.saveSave();
        hs.load();
        hs.loadShip();
        
        PImage background = loadImage("src/main/data/textures/background.png");
        background.resize(worldWidth, worldHeight);
        
        b1 = new Background(this,background);
        b2 = new Background(this,background);
    }
	
	@Override
	public void update() {
		switch(currentScreen) {
		case "hangar":
			hs.update();
			break;
		}
    }
	
	public void mousePressed() {
		//hs.clearBlueprint();
	}
}
