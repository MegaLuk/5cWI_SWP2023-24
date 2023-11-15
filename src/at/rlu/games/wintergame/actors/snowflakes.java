package at.rlu.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class snowflakes implements Actor{
    private int x,y;

    public snowflakes(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta) {
        if (this.y > 1080){
            this.y= y-1000;
        } else{
            this.y++;
        }

    }
    public void render(Graphics graphics){
        graphics.fillOval(this.x, this.y, 30, 30);


    }
}
