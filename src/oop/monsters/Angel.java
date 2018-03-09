package oop.monsters;

public class Angel implements Monster {

    private String name;
    private int bless;
    private int health;

    public Angel(String name, int bless) {
        this.name = name;
        this.bless = bless;
        this.health = 100 * bless;
    }

    @Override
    public int attack() {
        return 5 * bless * bless;
    }

    @Override
    public int defense() {
        return bless * 2;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
