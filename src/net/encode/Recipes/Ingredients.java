
package net.encode.Recipes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredients {

    @SerializedName("mandatory")
    @Expose
    private List<Mandatory> mandatory = null;
    @SerializedName("zeroorone")
    @Expose
    private List<Zeroorone> zeroorone = null;
    @SerializedName("oneof")
    @Expose
    private List<Oneof> oneof = null;
    @SerializedName("oneormore")
    @Expose
    private List<Oneormore> oneormore = null;
    @SerializedName("any")
    @Expose
    private List<Any> any = null;
    @SerializedName("optional")
    @Expose
    private List<Optional> optional = null;

    public List<Mandatory> getMandatory() {
        return mandatory;
    }

    public void setMandatory(List<Mandatory> mandatory) {
        this.mandatory = mandatory;
    }

    public Ingredients withMandatory(List<Mandatory> mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    public List<Zeroorone> getZeroorone() {
        return zeroorone;
    }

    public void setZeroorone(List<Zeroorone> zeroorone) {
        this.zeroorone = zeroorone;
    }

    public Ingredients withZeroorone(List<Zeroorone> zeroorone) {
        this.zeroorone = zeroorone;
        return this;
    }

    public List<Oneof> getOneof() {
        return oneof;
    }

    public void setOneof(List<Oneof> oneof) {
        this.oneof = oneof;
    }

    public Ingredients withOneof(List<Oneof> oneof) {
        this.oneof = oneof;
        return this;
    }

    public List<Oneormore> getOneormore() {
        return oneormore;
    }

    public void setOneormore(List<Oneormore> oneormore) {
        this.oneormore = oneormore;
    }

    public Ingredients withOneormore(List<Oneormore> oneormore) {
        this.oneormore = oneormore;
        return this;
    }

    public List<Any> getAny() {
        return any;
    }

    public void setAny(List<Any> any) {
        this.any = any;
    }

    public Ingredients withAny(List<Any> any) {
        this.any = any;
        return this;
    }

    public List<Optional> getOptional() {
        return optional;
    }

    public void setOptional(List<Optional> optional) {
        this.optional = optional;
    }

    public Ingredients withOptional(List<Optional> optional) {
        this.optional = optional;
        return this;
    }

}
