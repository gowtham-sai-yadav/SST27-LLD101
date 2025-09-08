package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int bonus;

    public DamageBoost(Character base, int bonus) {
        super(base);
        this.bonus = bonus;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getDamage() {
        return base.getDamage() + bonus;
    }
}


