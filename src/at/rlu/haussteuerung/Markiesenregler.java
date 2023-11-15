package at.rlu.haussteuerung;

public class Markiesenregler {
    private Boolean open;

    public void openMarkiese(){
        this.open = true;
    }
    public void closeMarkiese(){
        this.open = false;
    }
}
