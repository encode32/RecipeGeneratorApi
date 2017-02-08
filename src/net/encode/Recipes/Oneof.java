
package net.encode.Recipes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Oneof {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("list")
    @Expose
    private List<Ingredient> list = null;

    /**
     * 
     * (Required)
     * 
     */
    public List<Ingredient> getList() {
        return list;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setList(List<Ingredient> list) {
        this.list = list;
    }

    public Oneof withList(List<Ingredient> list) {
        this.list = list;
        return this;
    }

}
