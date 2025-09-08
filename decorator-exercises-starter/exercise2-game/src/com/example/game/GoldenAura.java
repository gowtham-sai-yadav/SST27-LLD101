package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character base) {
        super(base);
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura ✨] Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura ✨] Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return base.getSpeed() + 1; // small buff
    }

    @Override
    public int getDamage() {
        return base.getDamage() + 2; // small buff
    }

    @Override
    public String getSprite() {
        return "golden_" + base.getSprite();
    }
}


