package org.example.models;

public class Wizard extends Player{
    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void increaseHelath(){
        setHealth(getHealth() + 5);
    }
}
