package at.rlu.haussteuerung;

public class haussteuerung implements observer{
    private Termometer termometer;


    private void init(){

        termometer = new Termometer();
    }


    @Override
    public void update() {
        float temp = termometer.getTemp();
    }
}
