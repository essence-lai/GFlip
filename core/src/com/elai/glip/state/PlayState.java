package com.elai.glip.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.elai.glip.Gflip;
import com.elai.glip.sprites.Robot;

/**
 * Created by essen on 2017-07-12.
 */

public class PlayState extends State {
    private Robot robot;
    private Texture bg;
    private Texture gradient;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        robot = new Robot(50,200);
        cam.setToOrtho(false, Gflip.WIDTH/2, Gflip.HEIGHT/2);
        bg = new Texture("Menu.png");
        gradient = new Texture("Gradient.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched())
            robot.jump();

    }

    @Override
    public void update(float dt) {
        handleInput();
        robot.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x -(cam.viewportWidth/2),0);
        sb.draw(gradient, cam.position.x - (cam.viewportWidth/2),cam.position.y );
        sb.draw(robot.getTexture(), robot.getPosition().x, robot.getPosition().y,34,46);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
