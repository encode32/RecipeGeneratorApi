
package net.encode.Recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
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
    @SerializedName("refmaterial")
    @Expose
    private String refmaterial;
    @SerializedName("refrealtemplate")
    @Expose
    private String refrealtemplate;
    @SerializedName("difficulty")
    @Expose
    private Float difficulty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("achievement")
    @Expose
    private String achievement;
    @SerializedName("usetemplateweight")
    @Expose
    private Boolean usetemplateweight;
    @SerializedName("icon")
    @Expose
    private String icon;

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

    public Result withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Result withName(String name) {
        this.name = name;
        return this;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public Result withCstate(String cstate) {
        this.cstate = cstate;
        return this;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }

    public Result withPstate(String pstate) {
        this.pstate = pstate;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Result withMaterial(String material) {
        this.material = material;
        return this;
    }

    public String getRealtemplate() {
        return realtemplate;
    }

    public void setRealtemplate(String realtemplate) {
        this.realtemplate = realtemplate;
    }

    public Result withRealtemplate(String realtemplate) {
        this.realtemplate = realtemplate;
        return this;
    }

    public String getRefmaterial() {
        return refmaterial;
    }

    public void setRefmaterial(String refmaterial) {
        this.refmaterial = refmaterial;
    }

    public Result withRefmaterial(String refmaterial) {
        this.refmaterial = refmaterial;
        return this;
    }

    public String getRefrealtemplate() {
        return refrealtemplate;
    }

    public void setRefrealtemplate(String refrealtemplate) {
        this.refrealtemplate = refrealtemplate;
    }

    public Result withRefrealtemplate(String refrealtemplate) {
        this.refrealtemplate = refrealtemplate;
        return this;
    }

    public Float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public Result withDifficulty(Float difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Result withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public Result withAchievement(String achievement) {
        this.achievement = achievement;
        return this;
    }

    public Boolean getUsetemplateweight() {
        return usetemplateweight;
    }

    public void setUsetemplateweight(Boolean usetemplateweight) {
        this.usetemplateweight = usetemplateweight;
    }

    public Result withUsetemplateweight(Boolean usetemplateweight) {
        this.usetemplateweight = usetemplateweight;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Result withIcon(String icon) {
        this.icon = icon;
        return this;
    }

}
