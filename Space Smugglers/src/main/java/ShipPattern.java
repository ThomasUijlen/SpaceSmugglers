
public class ShipPattern {
	SpaceSmugglers app;
	private int[][] pattern = {{0,0},{0,-50},{0,-100},{0,50},{0,100},{-50,0},{-100,0},{-150,0},{-200,0},{50,0},{100,0},{150,0},{150,-50},{100,-50},{50,-50},{50,50},{100,50},{150,50},{-50,50},{-100,50},{-100,-50},{-50,-50},{-50,-100},{-50,100},{0,150},{50,100},{0,200},{50,-100},{0,-150},{0,-200},{200,0},{-50,-200},{-50,200}};
	
	public ShipPattern(SpaceSmugglers p) {
		this.app = p;
	}
	
	public void loadPattern() {
		for(int i = 0; i < pattern.length; i++) {
			pattern[i][0] += app.width/2;
			pattern[i][1] += app.height/2;
			BlueprintSlot s = new BlueprintSlot(app);
    		app.addGameObject(s, pattern[i][0], pattern[i][1]);
		}
	}
}
