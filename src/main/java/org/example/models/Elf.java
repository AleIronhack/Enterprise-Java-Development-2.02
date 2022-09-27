package org.example.models;

public class Elf extends Player{
    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void increaseLives(){
        setLives(getLives()+ 1 );
    }
}
