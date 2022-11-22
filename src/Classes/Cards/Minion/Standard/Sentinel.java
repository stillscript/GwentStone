package Classes.Cards.Minion.Standard;

import Classes.Cards.Minion.Minion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"mana", "attackDamage", "health", "description", "colors", "name"})

public class Sentinel extends Minion {
    public Sentinel(int mana, int health, int attackDamage, String description, ArrayList<String> colors, String name) {
        super(mana, health, attackDamage, description, colors, name);

    }

    @Override
    public void execSpecialAbility() {
        // this card doesn't have a special ability, so we leave this method empty
    }


}
