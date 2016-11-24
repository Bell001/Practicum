package com.mygdx.game;

public class Scene {
    
	public static int start = -1;
	public static int scene1 = 1;
	public static int scene2 = 2;
	public static int scene3 = 3;
	public static int Lose = 0;
	public static int Win = 4;
	
	public static int UpScene = -1;  
	
	public Scene(Box box) {
		
	}
	
    public void update() {
		Scene_update();
	}	
    
    public int Scene_update() {
    	return UpScene;
    }
}
