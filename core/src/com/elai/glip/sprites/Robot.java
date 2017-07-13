package com.elai.glip.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.elai.glip.Gflip;

/**
 * Created by essen on 2017-07-12.
 */

public class Robot {
    private static final int GRAVITY = 15;
    private static final int SPEED = 250;
    private static final int ROBOTHEIGHT = 46;
    private Vector3 position;
    private Vector3 velocity;

    private Texture robot;

    public Robot(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        robot = new Texture("Robot.png");
    }

    public void update(float dt){
        if(position.y > 0){
        if(position.y > Gflip.HEIGHT /4 ){
            velocity.add(0, GRAVITY, 0);
        }else{
            velocity.add(0, -GRAVITY, 0);
        }
        }
        velocity.scl(dt);
        position.add(0, velocity.y, 0);
        if(position.y <0)
                position.y = 0;
        if(position.y > (Gflip.HEIGHT /2 - ROBOTHEIGHT))
                position.y = (Gflip.HEIGHT /2 - ROBOTHEIGHT );

        velocity.scl(1/dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return robot;
    }

    public void jump(){
        if(position.y > Gflip.HEIGHT/4){
            velocity.y = -SPEED;
        }else{
            velocity.y = SPEED;
        }
    }
}
