package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.Core.GameObject;
import static com.mygdx.game.Core.GameWorld.spriteBatch;

public class BadLogic extends GameObject {

    private Sprite image;

    public BadLogic()
    {
        image = new Sprite(new Texture("badlogic.jpg"));
        image.setBounds(0, 0, 5, 5);
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render() {
        image.draw(spriteBatch);
    }
}
