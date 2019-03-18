
import java.util.ArrayList;

import nl.han.ica.oopg.dashboard.Dashboard;
import nl.han.ica.oopg.engine.GameEngine;
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
	//ArrayList<BlueprintSlot> slot = new ArrayList<BlueprintSlot>();
	@Override
	public void setupGame() {

        int worldWidth = 1204;
        int worldHeight = 903;
        
        View view = new View(worldWidth, worldHeight);
        PImage background = loadImage("src/main/data/textures/background.png");
        background.resize(worldWidth, worldHeight);
        view.setBackground(background);
        setView(view);
        size(worldWidth, worldHeight);
        
        //GameObject g = new GameObject(this, 100, 100, 100);
        //addGameObject(g, 200, 200);
    }
	
	@Override
    public void update() {
    }
	
	public void mousePressed() {
		if(mouseButton == LEFT) {
//		GameObject g = new GameObject(this, 100, 100, 100);
//        addGameObject(g, mouseX, mouseY);
//			for()
//			if (go instanceof BlueprintSlot) {				
//				
//			}
		}
        
        if(mouseButton == RIGHT) {
        BlueprintSlot s = new BlueprintSlot(this, mouseX, mouseY);
        addGameObject(s, mouseX, mouseY);
        }
	}
}
