package org.example.models;

public abstract class Player {

    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decreaseLives(){
        this.setLives(this.getLives() - 1);
        this.setHealth(100);
    }

    public void attack(Player player){
        player.setHealth(player.getHealth() - this.getStrength());
        if(player.getHealth() <= 0) player.decreaseLives();

    }
}
