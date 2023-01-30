/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * Company
 */

public class Company {
  public static final String SERIALIZED_NAME_HOMEPAGE = "homepage";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE)
  private String homepage;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registrationNumber";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public static final String SERIALIZED_NAME_REGISTRY_LOCATION = "registryLocation";
  @SerializedName(SERIALIZED_NAME_REGISTRY_LOCATION)
  private String registryLocation;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Company() { 
  }

  public Company homepage(String homepage) {
    
    this.homepage = homepage;
    return this;
  }

   /**
   * The company website&#39;s home page.
   * @return homepage
  **/

  @ApiModelProperty(value = "The company website's home page.")

  public String getHomepage() {
    return homepage;
  }


  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }


  public Company name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The company name.
   * @return name
  **/

  @ApiModelProperty(value = "The company name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Company registrationNumber(String registrationNumber) {
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Registration number of the company.
   * @return registrationNumber
  **/

  @ApiModelProperty(value = "Registration number of the company.")

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public Company registryLocation(String registryLocation) {
    
    this.registryLocation = registryLocation;
    return this;
  }

   /**
   * Registry location of the company.
   * @return registryLocation
  **/

  @ApiModelProperty(value = "Registry location of the company.")

  public String getRegistryLocation() {
    return registryLocation;
  }


  public void setRegistryLocation(String registryLocation) {
    this.registryLocation = registryLocation;
  }


  public Company taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Tax ID of the company.
   * @return taxId
  **/

  @ApiModelProperty(value = "Tax ID of the company.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public Company type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The company type.
   * @return type
  **/

  @ApiModelProperty(value = "The company type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.homepage, company.homepage) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.registrationNumber, company.registrationNumber) &&
        Objects.equals(this.registryLocation, company.registryLocation) &&
        Objects.equals(this.taxId, company.taxId) &&
        Objects.equals(this.type, company.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homepage, name, registrationNumber, registryLocation, taxId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registryLocation: ").append(toIndentedString(registryLocation)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("homepage");
    openapiFields.add("name");
    openapiFields.add("registrationNumber");
    openapiFields.add("registryLocation");
    openapiFields.add("taxId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Company
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Company.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Company is not found in the empty JSON string", Company.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Company.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Company` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field homepage
      if (jsonObj.get("homepage") != null && !jsonObj.get("homepage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homepage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homepage").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field registrationNumber
      if (jsonObj.get("registrationNumber") != null && !jsonObj.get("registrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationNumber").toString()));
      }
      // validate the optional field registryLocation
      if (jsonObj.get("registryLocation") != null && !jsonObj.get("registryLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registryLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registryLocation").toString()));
      }
      // validate the optional field taxId
      if (jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Company.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Company' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Company> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Company.class));

       return (TypeAdapter<T>) new TypeAdapter<Company>() {
           @Override
           public void write(JsonWriter out, Company value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Company read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Company given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Company
  * @throws IOException if the JSON string is invalid with respect to Company
  */
  public static Company fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Company.class);
  }

 /**
  * Convert an instance of Company to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

