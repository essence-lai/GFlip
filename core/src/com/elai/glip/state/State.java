package com.elai.glip.state;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by essen on 2017-07-12.
 */

public abstract class State {

    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    //constructor

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    //methods

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract  void dispose();
}