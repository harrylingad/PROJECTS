package com.gamedevelopment.framework.implementation;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Window;
import android.view.WindowManager;

import com.gamedevelopment.framework.Audio;
import com.gamedevelopment.framework.FileIO;
import com.gamedevelopment.framework.Game;
import com.gamedevelopment.framework.Graphics;
import com.gamedevelopment.framework.Input;
import com.gamedevelopment.framework.Screen;

public abstract class AndroidGame extends Activity implements Game {

	public AndroidGame() {
		// TODO Auto-generated constructor stub
	}

}
