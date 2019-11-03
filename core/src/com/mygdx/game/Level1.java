package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Level1 extends GameWorld {

    private Sprite image;

    @Override
    public void start() {
        image = new Sprite(new Texture("badlogic.jpg"));
        image.setBounds(0, 0, 5, 5);

    }

    @Override
    public void update(float deltaTime) {
        image.draw(spriteBatch);
    }


}
