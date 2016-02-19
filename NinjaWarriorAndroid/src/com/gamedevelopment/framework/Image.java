package com.gamedevelopment.framework;

import com.gamedevelopment.framework.Graphics.ImageFormat;



public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
