package com.peacemakergamedevelopment.ninjawarrior;

import java.util.List;

import com.peacemakergamedevelopment.framework.Game;
import com.peacemakergamedevelopment.framework.Graphics;
import com.peacemakergamedevelopment.framework.Input.TouchEvent;
import com.peacemakergamedevelopment.framework.Screen;

public class MainMenuScreen extends Screen {

	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) { Graphics g = game.getGraphics();
    List<TouchEvent> touchEvents = game.getInput().getTouchEvents();

    int len = touchEvents.size();
    for (int i = 0; i < len; i++) {
        TouchEvent event = touchEvents.get(i);
        if (event.type == TouchEvent.TOUCH_UP) {

            if (inBounds(event, 50, 350, 250, 450)) {
                game.setScreen(new GameScreen(game));
            }

        }
    }}
	
	 private boolean inBounds(TouchEvent event, int x, int y, int width,
	            int height) {
	        if (event.x > x && event.x < x + width - 1 && event.y > y
	                && event.y < y + height - 1)
	            return true;
	        else
	            return false;
	    }

	@Override
	public void paint(float deltaTime) {
		Graphics g = game.getGraphics();
        g.drawImage(Assets.menu, 0, 0);
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
