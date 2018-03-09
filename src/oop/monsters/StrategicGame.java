package oop.monsters;

public class StrategicGame {
    public static void main(String[] args) {
        Monster[] teamA = {new Angel("abc", 5), new Angel("def", 2)};
        Monster[] teamB = {
                new Zombie("a", 2),
                new Zombie("b", 1.5),
                new Zombie("c", 0.5),
                new Zombie("d", 3.5),
                new Zombie("e", 2),
        };
    }

    public static void showArmy(Monster[] monsters) {
        System.out.println("Army has " + monsters.length + " units");
        System.out.println("Army has " + computeArmyPower(monsters) + " power in total");
    }

    private static int computeArmyPower(Monster[] monsters) {
        int sum = 0;
        for (int i = 0; i < monsters.length; i++) {
            sum += monsters[i].attack();
        }
        return sum;
    }
}
