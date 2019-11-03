package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.Core.GameObject;
import com.mygdx.game.Core.GameWorld;

public class Level1 extends GameWorld {

    BadLogic badLogic;

    @Override
    public void start() {
        badLogic = new BadLogic();
    }

    @Override
    public void update(float deltaTime) {
        
    }

}
