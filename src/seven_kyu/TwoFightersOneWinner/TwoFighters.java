package seven_kyu.TwoFightersOneWinner;

/*
* Create a function that returns the name of the winner in a fight between two fighters.

* Each fighter takes turns attacking the other
* and whoever kills the other first is victorious.
* Death is defined as having health <= 0.
*
* Each fighter will be a Fighter object/instance.
* See the Fighter class below in your chosen language.
*
* Both health and damagePerAttack (damage_per_attack for python) will be integers
* larger than 0. You can mutate the Fighter objects.
*
* Your function also receives a third argument, a string,
* with the name of the fighter that attacks first.
* */

public class TwoFighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner;
        while (true) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    System.out.println(fighter1.name + " attacks" + fighter2.name + ": " + fighter2.name + " now has " + fighter2.health + " health and is dead. " + fighter1.name + " wins.\n");
                    break;
                }
                System.out.println(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health + " health.");
                firstAttacker = fighter2.name;
            } else if (firstAttacker.equals(fighter2.name)) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    System.out.println(fighter2.name + " attacks" + fighter1.name + ": " + fighter1.name + " now has " + fighter1.health + " health and is dead. " + fighter2.name + " wins.\n");
                    break;
                }
                System.out.println(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health + " health.");
                firstAttacker = fighter1.name;
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        System.out.println(TwoFighters.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }
}
