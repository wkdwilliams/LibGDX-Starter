package com.mygdx.game.Core;

import com.badlogic.gdx.math.Vector3;

public abstract class GameObject {

    public Vector3 position;

    public GameObject() {
        position = new Vector3();
        GameWorld.gameObjects.add(this);
    }

    public GameObject(Vector3 pos) {
        position = pos;
        GameWorld.gameObjects.add(this);
    }

    public abstract void update(float delta);
    public abstract void render();

}
