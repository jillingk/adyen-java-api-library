/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * PaymentInstrumentGroup
 */

public class PaymentInstrumentGroup {
  public static final String SERIALIZED_NAME_BALANCE_PLATFORM = "balancePlatform";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM)
  private String balancePlatform;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_TX_VARIANT = "txVariant";
  @SerializedName(SERIALIZED_NAME_TX_VARIANT)
  private String txVariant;

  public PaymentInstrumentGroup() { 
  }

  public PaymentInstrumentGroup balancePlatform(String balancePlatform) {
    
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the payment instrument group belongs.
   * @return balancePlatform
  **/
  
  @ApiModelProperty(required = true, value = "The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the payment instrument group belongs.")

  public String getBalancePlatform() {
    return balancePlatform;
  }


  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public PaymentInstrumentGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the payment instrument group, maximum 300 characters.
   * @return description
  **/

  @ApiModelProperty(value = "Your description for the payment instrument group, maximum 300 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentInstrumentGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the payment instrument group.
   * @return id
  **/

  @ApiModelProperty(value = "The unique identifier of the payment instrument group.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentInstrumentGroup properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public PaymentInstrumentGroup putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties of the payment instrument group.
   * @return properties
  **/

  @ApiModelProperty(value = "Properties of the payment instrument group.")

  public Map<String, String> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public PaymentInstrumentGroup reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment instrument group, maximum 150 characters.
   * @return reference
  **/

  @ApiModelProperty(value = "Your reference for the payment instrument group, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInstrumentGroup txVariant(String txVariant) {
    
    this.txVariant = txVariant;
    return this;
  }

   /**
   * The tx variant of the payment instrument group.
   * @return txVariant
  **/
  
  @ApiModelProperty(required = true, value = "The tx variant of the payment instrument group.")

  public String getTxVariant() {
    return txVariant;
  }


  public void setTxVariant(String txVariant) {
    this.txVariant = txVariant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentGroup paymentInstrumentGroup = (PaymentInstrumentGroup) o;
    return Objects.equals(this.balancePlatform, paymentInstrumentGroup.balancePlatform) &&
        Objects.equals(this.description, paymentInstrumentGroup.description) &&
        Objects.equals(this.id, paymentInstrumentGroup.id) &&
        Objects.equals(this.properties, paymentInstrumentGroup.properties) &&
        Objects.equals(this.reference, paymentInstrumentGroup.reference) &&
        Objects.equals(this.txVariant, paymentInstrumentGroup.txVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, description, id, properties, reference, txVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentGroup {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    txVariant: ").append(toIndentedString(txVariant)).append("\n");
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
    openapiFields.add("balancePlatform");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("properties");
    openapiFields.add("reference");
    openapiFields.add("txVariant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balancePlatform");
    openapiRequiredFields.add("txVariant");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentGroup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentGroup is not found in the empty JSON string", PaymentInstrumentGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentInstrumentGroup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field balancePlatform
      if (jsonObj.get("balancePlatform") != null && !jsonObj.get("balancePlatform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balancePlatform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatform").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field txVariant
      if (jsonObj.get("txVariant") != null && !jsonObj.get("txVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `txVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("txVariant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentGroup>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentGroup
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentGroup
  */
  public static PaymentInstrumentGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentGroup.class);
  }

 /**
  * Convert an instance of PaymentInstrumentGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

