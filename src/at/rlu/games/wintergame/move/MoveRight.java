package at.rlu.games.wintergame.move;

public class MoveRight {
    private float x,y,speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    public void update(int delta){

        this.x += delta * speed;


    }
}
