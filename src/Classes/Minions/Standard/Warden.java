package Classes.Minions.Standard;

import Classes.Minions.Minion;

public class Warden extends Minion {
    public Warden(int mana, int health, int attackDamage, String description, String colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        type = "Warden";
        tank = true;
        frozen = false;
    }

    @Override
    public void execSpecialAbility() {
        // this card doesn't have a special ability, so we leave this method empty
    }
}
