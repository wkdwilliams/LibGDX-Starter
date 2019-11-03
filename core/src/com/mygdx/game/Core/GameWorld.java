package com.mygdx.game.Core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;

public abstract class GameWorld implements Screen {

    public static SpriteBatch spriteBatch;
    public static OrthographicCamera camera;
    public static ArrayList<GameObject> gameObjects;

    public GameWorld()
    {
        camera = new OrthographicCamera(30, 30 * ((float)Gdx.graphics.getHeight() / Gdx.graphics.getWidth()));
        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
        camera.update();

        spriteBatch = new SpriteBatch();
        gameObjects = new ArrayList<>();

        start();
    }

    @Override
    public void render(float delta) {
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();

        for(GameObject o : gameObjects)
        {
            o.render();
            o.update(delta);
        }

        update(delta);
        spriteBatch.end();
    }

    public abstract void start();
    public abstract void update(float deltaTime);

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = 30f;
        camera.viewportHeight = 30f * height/width;
        camera.update();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}
