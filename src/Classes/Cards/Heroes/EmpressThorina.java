package Classes.Cards.Heroes;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.awt.*;
import java.util.ArrayList;

@JsonPropertyOrder({"mana", "description", "colors", "name", "health"})
public class EmpressThorina extends Hero{
    public EmpressThorina(int mana, String description, ArrayList<String> colors, String name) {
        super(mana, description, colors, name);
    }
}
