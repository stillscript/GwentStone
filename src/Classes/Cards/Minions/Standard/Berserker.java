package Classes.Cards.Minions.Standard;

import Classes.Cards.Minions.Minion;

public class Berserker extends Minion {

    public Berserker(int mana, int health, int attackDamage, String description, String[] colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        tank = false;
        frozen = false;
    }

    @Override
    public void execSpecialAbility() {
        // this card doesn't have a special ability, so we leave this method empty
    }
}