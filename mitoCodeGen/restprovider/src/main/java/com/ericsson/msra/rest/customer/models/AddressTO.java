
package com.ericsson.msra.rest.customer.models;

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
    "zip",
    "country",
    "city",
    "phone",
    "secondLine",
    "state",
    "firstLine",
    "addressId"
})
public class AddressTO {

    @JsonProperty("zip")
    private Integer zip;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("phone")
    private Integer phone;
    @JsonProperty("secondLine")
    private String secondLine;
    @JsonProperty("state")
    private String state;
    @JsonProperty("firstLine")
    private String firstLine;
    @JsonProperty("addressId")
    private String addressId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("zip")
    public Integer getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("phone")
    public Integer getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @JsonProperty("secondLine")
    public String getSecondLine() {
        return secondLine;
    }

    @JsonProperty("secondLine")
    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("firstLine")
    public String getFirstLine() {
        return firstLine;
    }

    @JsonProperty("firstLine")
    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    @JsonProperty("addressId")
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
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
        sb.append(AddressTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("secondLine");
        sb.append('=');
        sb.append(((this.secondLine == null)?"<null>":this.secondLine));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("firstLine");
        sb.append('=');
        sb.append(((this.firstLine == null)?"<null>":this.firstLine));
        sb.append(',');
        sb.append("addressId");
        sb.append('=');
        sb.append(((this.addressId == null)?"<null>":this.addressId));
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
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.secondLine == null)? 0 :this.secondLine.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.firstLine == null)? 0 :this.firstLine.hashCode()));
        result = ((result* 31)+((this.addressId == null)? 0 :this.addressId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressTO) == false) {
            return false;
        }
        AddressTO rhs = ((AddressTO) other);
        return ((((((((((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.secondLine == rhs.secondLine)||((this.secondLine!= null)&&this.secondLine.equals(rhs.secondLine))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.firstLine == rhs.firstLine)||((this.firstLine!= null)&&this.firstLine.equals(rhs.firstLine))))&&((this.addressId == rhs.addressId)||((this.addressId!= null)&&this.addressId.equals(rhs.addressId))));
    }

}
