package at.rlu.games.wintergame.actors;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<Actor> actors;




    public MainGame(String title) {
        super(title);
    }

    //private List<CircleActor>circleActors;


    @Override
    public void init(GameContainer gc) throws SlickException {
        // wird einmal aufgerufen am anfang

        this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(300,300));
        this.actors.add(new snowflakes(100, 120));
        this.actors.add(new snowflakes(250,110));
        this.actors.add(new snowflakes(450,140));
        this.actors.add(new snowflakes(300,170));
        this.actors.add(new snowflakes(400,110));
        this.actors.add(new snowflakes(150,130));
        this.actors.add(new snowflakes(200,150));
        this.actors.add(new snowflakes(280,120));
        this.actors.add(new CircleActor(350,300));
        this.actors.add(new snowflakes(500, 120));
        this.actors.add(new snowflakes(550,110));
        this.actors.add(new snowflakes(600,140));
        this.actors.add(new snowflakes(650,170));
        this.actors.add(new snowflakes(700,110));
        this.actors.add(new snowflakes(750,130));
        this.actors.add(new snowflakes(800,150));
        this.actors.add(new snowflakes(850  ,120));



    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // delta = Zeit seit letztem Aufruf
        for (Actor actor : this.actors){
            actor.update(gc, delta);
        }
}

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }


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