/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * Currency
 */

public class Currency {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Object percentage = null;

  public Currency() { 
  }

  public Currency amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Surcharge amount per transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return amount
  **/
  
  @ApiModelProperty(value = "Surcharge amount per transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Currency currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, **AUD**.
   * @return currencyCode
  **/
  
  @ApiModelProperty(required = true, value = "Three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, **AUD**.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Currency percentage(Object percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  
  @ApiModelProperty(value = "")

  public Object getPercentage() {
    return percentage;
  }


  public void setPercentage(Object percentage) {
    this.percentage = percentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.amount, currency.amount) &&
        Objects.equals(this.currencyCode, currency.currencyCode) &&
        Objects.equals(this.percentage, currency.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currencyCode");
    openapiFields.add("percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currencyCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Currency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Currency.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Currency is not found in the empty JSON string", Currency.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Currency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Currency` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Currency.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field currencyCode
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Currency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Currency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Currency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Currency.class));

       return (TypeAdapter<T>) new TypeAdapter<Currency>() {
           @Override
           public void write(JsonWriter out, Currency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Currency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Currency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Currency
  * @throws IOException if the JSON string is invalid with respect to Currency
  */
  public static Currency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Currency.class);
  }

 /**
  * Convert an instance of Currency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

