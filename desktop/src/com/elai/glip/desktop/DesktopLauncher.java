package com.elai.glip.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.elai.glip.Gflip;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Gflip.WIDTH;
		config.height = Gflip.HEIGHT;
		config.title = Gflip.TITLE;
		new LwjglApplication(new Gflip(), config);
	}
}
