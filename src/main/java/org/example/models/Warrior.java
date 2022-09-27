package org.example.models;

public class Warrior extends Player{

    public Warrior(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void increaseAttack(){
        setStrength(getStrength() + 5);
    }
}
