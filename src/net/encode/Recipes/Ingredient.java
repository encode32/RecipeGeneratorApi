
package net.encode.Recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredient {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cstate")
    @Expose
    private String cstate;
    @SerializedName("pstate")
    @Expose
    private String pstate;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("realtemplate")
    @Expose
    private String realtemplate;
    @SerializedName("difficulty")
    @Expose
    private Float difficulty;
    @SerializedName("ratio")
    @Expose
    private Float ratio;
    @SerializedName("loss")
    @Expose
    private Float loss;
    @SerializedName("amount")
    @Expose
    private Float amount;

    /**
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public Ingredient withId(String id) {
        this.id = id;
        return this;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public Ingredient withCstate(String cstate) {
        this.cstate = cstate;
        return this;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }

    public Ingredient withPstate(String pstate) {
        this.pstate = pstate;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Ingredient withMaterial(String material) {
        this.material = material;
        return this;
    }

    public String getRealtemplate() {
        return realtemplate;
    }

    public void setRealtemplate(String realtemplate) {
        this.realtemplate = realtemplate;
    }

    public Ingredient withRealtemplate(String realtemplate) {
        this.realtemplate = realtemplate;
        return this;
    }

    public Float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public Ingredient withDifficulty(Float difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }

    public Ingredient withRatio(Float ratio) {
        this.ratio = ratio;
        return this;
    }

    public Float getLoss() {
        return loss;
    }

    public void setLoss(Float loss) {
        this.loss = loss;
    }

    public Ingredient withLoss(Float loss) {
        this.loss = loss;
        return this;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Ingredient withAmount(Float amount) {
        this.amount = amount;
        return this;
    }

}
