package com.peacemakergamedevelopment.framework;

import com.peacemakergamedevelopment.framework.Graphics.ImageFormat;



public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
