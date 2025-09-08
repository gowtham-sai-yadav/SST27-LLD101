package com.example.game;

public abstract class CharacterDecorator implements Character {
    protected final Character base;

    public CharacterDecorator(Character base) {
        this.base = base;
    }

    @Override
    public void move() { base.move(); }

    @Override
    public void attack() { base.attack(); }

    @Override
    public int getSpeed() { return base.getSpeed(); }

    @Override
    public int getDamage() { return base.getDamage(); }

    @Override
    public String getSprite() { return base.getSprite(); }
}


