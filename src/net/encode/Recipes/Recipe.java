
package net.encode.Recipes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Recipe
 * <p>
 * 
 * 
 */
public class Recipe {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("recipeid")
    @Expose
    private String recipeid;
    @SerializedName("known")
    @Expose
    private Boolean known;
    @SerializedName("nameable")
    @Expose
    private Boolean nameable;
    @SerializedName("lootable")
    @Expose
    private Lootable lootable;
    @SerializedName("skill")
    @Expose
    private String skill;
    @SerializedName("trigger")
    @Expose
    private String trigger;
    @SerializedName("cookers")
    @Expose
    private List<Cooker> cookers = null;
    @SerializedName("containers")
    @Expose
    private List<Container> containers = null;
    @SerializedName("active")
    @Expose
    private Active active;
    @SerializedName("target")
    @Expose
    private Target target;
    @SerializedName("ingredients")
    @Expose
    private Ingredients ingredients;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("result")
    @Expose
    private Result result;

    /**
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Recipe withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getRecipeid() {
        return recipeid;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRecipeid(String recipeid) {
        this.recipeid = recipeid;
    }

    public Recipe withRecipeid(String recipeid) {
        this.recipeid = recipeid;
        return this;
    }

    public Boolean getKnown() {
        return known;
    }

    public void setKnown(Boolean known) {
        this.known = known;
    }

    public Recipe withKnown(Boolean known) {
        this.known = known;
        return this;
    }

    public Boolean getNameable() {
        return nameable;
    }

    public void setNameable(Boolean nameable) {
        this.nameable = nameable;
    }

    public Recipe withNameable(Boolean nameable) {
        this.nameable = nameable;
        return this;
    }

    public Lootable getLootable() {
        return lootable;
    }

    public void setLootable(Lootable lootable) {
        this.lootable = lootable;
    }

    public Recipe withLootable(Lootable lootable) {
        this.lootable = lootable;
        return this;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Recipe withSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Recipe withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public List<Cooker> getCookers() {
        return cookers;
    }

    public void setCookers(List<Cooker> cookers) {
        this.cookers = cookers;
    }

    public Recipe withCookers(List<Cooker> cookers) {
        this.cookers = cookers;
        return this;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    public Recipe withContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
    }

    public Recipe withActive(Active active) {
        this.active = active;
        return this;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Recipe withTarget(Target target) {
        this.target = target;
        return this;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe withIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Result getResult() {
        return result;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public Recipe withResult(Result result) {
        this.result = result;
        return this;
    }

}
