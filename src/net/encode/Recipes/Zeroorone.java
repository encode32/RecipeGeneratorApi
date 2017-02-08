
package net.encode.Recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Zeroorone {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("list")
    @Expose
    private java.util.List<Ingredient> list = null;

    /**
     * 
     * (Required)
     * 
     */
    public java.util.List<Ingredient> getList() {
        return list;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setList(java.util.List<Ingredient> list) {
        this.list = list;
    }

    public Zeroorone withList(java.util.List<Ingredient> list) {
        this.list = list;
        return this;
    }

}
