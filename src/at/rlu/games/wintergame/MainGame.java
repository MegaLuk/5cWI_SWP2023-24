package at.rlu.games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int x;
    private int y;
    private int decX;
    private int decY;
    private int rectDirection = 0;   //0=rechts, 1=unten, 2=links, 3=oben

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        // wird einmal aufgerufen am anfang
        this.x = 50;
        this.y= 50;

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // delta = Zeit seit letztem Aufruf

        if (this.rectDirection == 0) {
            this.x++;
            if (x > 750) {
                this.rectDirection = 1;
            }
        }
        else if (this.rectDirection == 1) {
            this.y++;
            if (y > 550) {
                this.rectDirection = 2;
            }
        } else if (this.rectDirection == 2) {
            this.x--;
            if (x < 50) {
                this.rectDirection = 3;
            }
        } else if (this.rectDirection == 3) {
            this.y--;
            if (y < 50) {
                this.rectDirection = 0;
            }


        }





}

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 50, 50);

    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

