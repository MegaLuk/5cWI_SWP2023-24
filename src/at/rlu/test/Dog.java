package at.rlu.test;

public class Dog implements Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return name;

    }
}
