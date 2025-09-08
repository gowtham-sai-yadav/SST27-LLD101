package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int bonus;

    public SpeedBoost(Character base, int bonus) {
        super(base);
        this.bonus = bonus;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return base.getSpeed() + bonus;
    }
}


