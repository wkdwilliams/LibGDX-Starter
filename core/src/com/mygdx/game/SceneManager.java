package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class SceneManager {

    private static Game game;

    public static void LoadScene(Screen screen){
        if(game == null){
            game = new Game() {
                @Override
                public void create() {
                    //Not needed but must be kept...
                }
            };
        }
        game.setScreen(screen);
    }

    public static void render(){
        game.render();
    }
}
