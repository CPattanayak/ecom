
package com.ecom.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "itemId",
    "qty",
    "price"
})
@Generated("jsonschema2pojo")
public class Lineitem {

    /**
     * line item id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("line item id")
    private Integer id;
    /**
     * item id
     * 
     */
    @JsonProperty("itemId")
    @JsonPropertyDescription("item id")
    private String itemId;
    /**
     * Quantity
     * 
     */
    @JsonProperty("qty")
    @JsonPropertyDescription("Quantity")
    private Integer qty;
    /**
     * Price
     * 
     */
    @JsonProperty("price")
    @JsonPropertyDescription("Price")
    private Integer price;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * line item id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * line item id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * item id
     * 
     */
    @JsonProperty("itemId")
    public String getItemId() {
        return itemId;
    }

    /**
     * item id
     * 
     */
    @JsonProperty("itemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Quantity
     * 
     */
    @JsonProperty("qty")
    public Integer getQty() {
        return qty;
    }

    /**
     * Quantity
     * 
     */
    @JsonProperty("qty")
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * Price
     * 
     */
    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    /**
     * Price
     * 
     */
    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lineitem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
