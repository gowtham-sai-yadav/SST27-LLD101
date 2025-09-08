package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // a) Base + SpeedBoost + DamageBoost
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        System.out.println("--- Buffed ---");
        buffed.move();
        buffed.attack();

        // b) Add GoldenAura (sprite change + buffs)
        Character shiny = new GoldenAura(buffed);
        System.out.println("--- Shiny (Golden Aura) ---");
        shiny.move();
        shiny.attack();

        // c) Remove GoldenAura by recomposition
        Character withoutAura = buffed;
        System.out.println("--- Without Aura ---");
        withoutAura.move();
        withoutAura.attack();
    }
}
