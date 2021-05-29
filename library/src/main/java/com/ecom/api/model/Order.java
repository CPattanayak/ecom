
package com.ecom.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Order resource
 * <p>
 * Order resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customerId",
    "dateOfPurchase",
    "status",
    "lineitems",
    "required"
})
@Generated("jsonschema2pojo")
public class Order {

    /**
     * order id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("order id")
    private Integer id;
    /**
     * customer id
     * 
     */
    @JsonProperty("customerId")
    @JsonPropertyDescription("customer id")
    private String customerId;
    /**
     * date of purchase
     * 
     */
    @JsonProperty("dateOfPurchase")
    @JsonPropertyDescription("date of purchase")
    private String dateOfPurchase;
    /**
     * status of order
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("status of order")
    private String status;
    @JsonProperty("lineitems")
    @Valid
    private List<Lineitem> lineitems = new ArrayList<Lineitem>();
    @JsonProperty("required")
    private Object required;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * order id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * order id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * customer id
     * 
     */
    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * customer id
     * 
     */
    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * date of purchase
     * 
     */
    @JsonProperty("dateOfPurchase")
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * date of purchase
     * 
     */
    @JsonProperty("dateOfPurchase")
    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * status of order
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * status of order
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("lineitems")
    public List<Lineitem> getLineitems() {
        return lineitems;
    }

    @JsonProperty("lineitems")
    public void setLineitems(List<Lineitem> lineitems) {
        this.lineitems = lineitems;
    }

    @JsonProperty("required")
    public Object getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Object required) {
        this.required = required;
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
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("dateOfPurchase");
        sb.append('=');
        sb.append(((this.dateOfPurchase == null)?"<null>":this.dateOfPurchase));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("lineitems");
        sb.append('=');
        sb.append(((this.lineitems == null)?"<null>":this.lineitems));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
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
