package at.rlu.games.wintergame.actors;

import at.rlu.games.wintergame.move.MoveRight;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.List;

public class CircleActor implements Actor{
    private MoveRight mr;


    public CircleActor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta) {
       mr.update(delta);

    }
    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y, 50, 50);

    }

}
