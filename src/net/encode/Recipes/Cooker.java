
package net.encode.Recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cooker {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("difficulty")
    @Expose
    private Float difficulty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cooker withId(String id) {
        this.id = id;
        return this;
    }

    public Float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public Cooker withDifficulty(Float difficulty) {
        this.difficulty = difficulty;
        return this;
    }

}
