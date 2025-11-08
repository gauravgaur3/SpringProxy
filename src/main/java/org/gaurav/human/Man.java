package org.gaurav.human;

public class Man implements Person {
    @Override
    public void eat(String food) {
        IO.println("I am eating" + food);
    }

    @Override
    public void sleep(String sleep) {
        IO.println("I am sleeping" + sleep);
    }

    @Override
    public void work(String work) {
        IO.println("I am working" + work);
    }
}
