package com.mygdx.game.Core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.Level1;

public class MainGame extends ApplicationAdapter {
	
	@Override
	public void create () {
		SceneManager.LoadScene(new Level1());
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		SceneManager.render();
	}
	
	@Override
	public void dispose () {

	}
}
