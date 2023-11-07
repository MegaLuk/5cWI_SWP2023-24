package at.rlu.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.List;
import java.util.ListIterator;

public class CircleActor implements Actor{
    private int x,y;
    private List<CircleActor> circleActors;


    public CircleActor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta) {
       this.x++;

    }
    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y, 50, 50);

    }

}
