package at.rlu.games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private CircleActor ca1;
    private CircleActor ca2;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        // wird einmal aufgerufen am anfang
        this.ca1 = new CircleActor(0,100);
        this.ca2 = new CircleActor(0,250);



    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // delta = Zeit seit letztem Aufruf
        this.ca1.update(gc, delta);
        this.ca2.update(gc, delta);
}

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ca2.render(graphics);

    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(1920,1080,true);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

