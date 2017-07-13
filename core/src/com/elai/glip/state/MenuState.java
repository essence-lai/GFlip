package com.elai.glip.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.elai.glip.Gflip;

/**
 * Created by essen on 2017-07-12.
 */

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;
    private Texture duckPic;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("Menu.png");
        playBtn = new Texture("Play.png");
        duckPic = new Texture("Duck.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, Gflip.WIDTH, Gflip.HEIGHT);
        sb.draw(playBtn, (Gflip.WIDTH / 2 - (playBtn.getWidth()/2)),Gflip.HEIGHT/2);
        sb.draw(duckPic, (Gflip.WIDTH /4 -(duckPic.getWidth()/2)+ (duckPic.getWidth()/8)), (Gflip.HEIGHT/4 - (duckPic.getHeight()/2)));
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        duckPic.dispose();
    }
}
