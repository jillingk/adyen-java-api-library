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
 * ShopperInput
 */

public class ShopperInput {
  /**
   * Specifies visibility of billing address fields.  Permitted values: * editable * hidden * readOnly
   */
  @JsonAdapter(BillingAddressEnum.Adapter.class)
  public enum BillingAddressEnum {
    EDITABLE("editable"),
    
    HIDDEN("hidden"),
    
    READONLY("readOnly");

    private String value;

    BillingAddressEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingAddressEnum fromValue(String value) {
      for (BillingAddressEnum b : BillingAddressEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BillingAddressEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingAddressEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingAddressEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BillingAddressEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BillingAddressEnum billingAddress;

  /**
   * Specifies visibility of delivery address fields.  Permitted values: * editable * hidden * readOnly
   */
  @JsonAdapter(DeliveryAddressEnum.Adapter.class)
  public enum DeliveryAddressEnum {
    EDITABLE("editable"),
    
    HIDDEN("hidden"),
    
    READONLY("readOnly");

    private String value;

    DeliveryAddressEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryAddressEnum fromValue(String value) {
      for (DeliveryAddressEnum b : DeliveryAddressEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryAddressEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryAddressEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryAddressEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryAddressEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS = "deliveryAddress";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS)
  private DeliveryAddressEnum deliveryAddress;

  /**
   * Specifies visibility of personal details.  Permitted values: * editable * hidden * readOnly
   */
  @JsonAdapter(PersonalDetailsEnum.Adapter.class)
  public enum PersonalDetailsEnum {
    EDITABLE("editable"),
    
    HIDDEN("hidden"),
    
    READONLY("readOnly");

    private String value;

    PersonalDetailsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PersonalDetailsEnum fromValue(String value) {
      for (PersonalDetailsEnum b : PersonalDetailsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PersonalDetailsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PersonalDetailsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PersonalDetailsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PersonalDetailsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERSONAL_DETAILS = "personalDetails";
  @SerializedName(SERIALIZED_NAME_PERSONAL_DETAILS)
  private PersonalDetailsEnum personalDetails;

  public ShopperInput() { 
  }

  public ShopperInput billingAddress(BillingAddressEnum billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Specifies visibility of billing address fields.  Permitted values: * editable * hidden * readOnly
   * @return billingAddress
  **/

  @ApiModelProperty(value = "Specifies visibility of billing address fields.  Permitted values: * editable * hidden * readOnly")

  public BillingAddressEnum getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(BillingAddressEnum billingAddress) {
    this.billingAddress = billingAddress;
  }


  public ShopperInput deliveryAddress(DeliveryAddressEnum deliveryAddress) {
    
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Specifies visibility of delivery address fields.  Permitted values: * editable * hidden * readOnly
   * @return deliveryAddress
  **/

  @ApiModelProperty(value = "Specifies visibility of delivery address fields.  Permitted values: * editable * hidden * readOnly")

  public DeliveryAddressEnum getDeliveryAddress() {
    return deliveryAddress;
  }


  public void setDeliveryAddress(DeliveryAddressEnum deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public ShopperInput personalDetails(PersonalDetailsEnum personalDetails) {
    
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Specifies visibility of personal details.  Permitted values: * editable * hidden * readOnly
   * @return personalDetails
  **/

  @ApiModelProperty(value = "Specifies visibility of personal details.  Permitted values: * editable * hidden * readOnly")

  public PersonalDetailsEnum getPersonalDetails() {
    return personalDetails;
  }


  public void setPersonalDetails(PersonalDetailsEnum personalDetails) {
    this.personalDetails = personalDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopperInput shopperInput = (ShopperInput) o;
    return Objects.equals(this.billingAddress, shopperInput.billingAddress) &&
        Objects.equals(this.deliveryAddress, shopperInput.deliveryAddress) &&
        Objects.equals(this.personalDetails, shopperInput.personalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, deliveryAddress, personalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopperInput {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
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
    openapiFields.add("billingAddress");
    openapiFields.add("deliveryAddress");
    openapiFields.add("personalDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopperInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopperInput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopperInput is not found in the empty JSON string", ShopperInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopperInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopperInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the field billingAddress can be parsed to an enum value
      if (jsonObj.get("billingAddress") != null) {
        if(!jsonObj.get("billingAddress").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `billingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress").toString()));
        }
        BillingAddressEnum.fromValue(jsonObj.get("billingAddress").getAsString());
      }
      // ensure the field deliveryAddress can be parsed to an enum value
      if (jsonObj.get("deliveryAddress") != null) {
        if(!jsonObj.get("deliveryAddress").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `deliveryAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryAddress").toString()));
        }
        DeliveryAddressEnum.fromValue(jsonObj.get("deliveryAddress").getAsString());
      }
      // ensure the field personalDetails can be parsed to an enum value
      if (jsonObj.get("personalDetails") != null) {
        if(!jsonObj.get("personalDetails").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `personalDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalDetails").toString()));
        }
        PersonalDetailsEnum.fromValue(jsonObj.get("personalDetails").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopperInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopperInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopperInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopperInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopperInput>() {
           @Override
           public void write(JsonWriter out, ShopperInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopperInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopperInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopperInput
  * @throws IOException if the JSON string is invalid with respect to ShopperInput
  */
  public static ShopperInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopperInput.class);
  }

 /**
  * Convert an instance of ShopperInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

