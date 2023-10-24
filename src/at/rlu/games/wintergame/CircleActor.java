package at.rlu.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor {
    private int x,y;

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
