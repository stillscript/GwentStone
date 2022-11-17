package Classes.Cards.Minions.Special;

import Classes.Cards.Minions.Minion;

public class Disciple extends Minion {
    public Disciple(int mana, int health, String description, String[] colors, String name) {
        super(mana, health, 0, description, colors, name);
        tank = false;
        frozen = false;
        specialAbility = "God's Plan";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}