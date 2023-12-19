package at.rlu.test;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
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
