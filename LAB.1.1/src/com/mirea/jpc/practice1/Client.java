package com.mirea.jpc.practice1;

final public class Client extends AbstractPerson {
    public Client(String name) {
        super(name);
    }

    @Override
    public String think() {
        return Client.class.getName();
    }
}
