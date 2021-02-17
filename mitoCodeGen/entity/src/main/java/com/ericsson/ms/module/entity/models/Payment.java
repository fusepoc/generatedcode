
package com.ericsson.ms.module.entity.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paymentId",
    "partyName",
    "paymentDesc"
})
public class Payment {

    @JsonProperty("paymentId")
    private String paymentId;
    @JsonProperty("partyName")
    private String partyName;
    @JsonProperty("paymentDesc")
    private String paymentDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @JsonProperty("partyName")
    public String getPartyName() {
        return partyName;
    }

    @JsonProperty("partyName")
    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @JsonProperty("paymentDesc")
    public String getPaymentDesc() {
        return paymentDesc;
    }

    @JsonProperty("paymentDesc")
    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
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
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("partyName");
        sb.append('=');
        sb.append(((this.partyName == null)?"<null>":this.partyName));
        sb.append(',');
        sb.append("paymentDesc");
        sb.append('=');
        sb.append(((this.paymentDesc == null)?"<null>":this.paymentDesc));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.partyName == null)? 0 :this.partyName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.paymentDesc == null)? 0 :this.paymentDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return (((((this.partyName == rhs.partyName)||((this.partyName!= null)&&this.partyName.equals(rhs.partyName)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.paymentDesc == rhs.paymentDesc)||((this.paymentDesc!= null)&&this.paymentDesc.equals(rhs.paymentDesc))));
    }

}
