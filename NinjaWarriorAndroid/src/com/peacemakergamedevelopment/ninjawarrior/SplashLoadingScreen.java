package com.peacemakergamedevelopment.ninjawarrior;

import com.peacemakergamedevelopment.framework.Game;
import com.peacemakergamedevelopment.framework.Graphics;
import com.peacemakergamedevelopment.framework.Graphics.ImageFormat;
import com.peacemakergamedevelopment.framework.Screen;



public class SplashLoadingScreen extends Screen {

	public SplashLoadingScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float deltaTime) {
		 Graphics g = game.getGraphics();
	        Assets.splash= g.newImage("splash.jpg", ImageFormat.RGB565);

	        game.setScreen(new LoadingScreen(game));

		
	}

	@Override
	public void paint(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backButton() {
		// TODO Auto-generated method stub
		
	}

}
