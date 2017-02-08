
package net.encode.Recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lootable {

    @SerializedName("creature")
    @Expose
    private String creature;
    @SerializedName("rarity")
    @Expose
    private String rarity;

    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }

    public Lootable withCreature(String creature) {
        this.creature = creature;
        return this;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Lootable withRarity(String rarity) {
        this.rarity = rarity;
        return this;
    }

}
