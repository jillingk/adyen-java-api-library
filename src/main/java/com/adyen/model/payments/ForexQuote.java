/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payments.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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

import com.adyen.model.payments.JSON;

/**
 * ForexQuote
 */

public class ForexQuote {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "baseAmount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private Amount baseAmount;

  public static final String SERIALIZED_NAME_BASE_POINTS = "basePoints";
  @SerializedName(SERIALIZED_NAME_BASE_POINTS)
  private Integer basePoints;

  public static final String SERIALIZED_NAME_BUY = "buy";
  @SerializedName(SERIALIZED_NAME_BUY)
  private Amount buy;

  public static final String SERIALIZED_NAME_INTERBANK = "interbank";
  @SerializedName(SERIALIZED_NAME_INTERBANK)
  private Amount interbank;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SELL = "sell";
  @SerializedName(SERIALIZED_NAME_SELL)
  private Amount sell;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALID_TILL = "validTill";
  @SerializedName(SERIALIZED_NAME_VALID_TILL)
  private OffsetDateTime validTill;

  public ForexQuote() { 
  }

  public ForexQuote account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The account name.
   * @return account
  **/
  
  @ApiModelProperty(value = "The account name.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public ForexQuote accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The account type.
   * @return accountType
  **/
  
  @ApiModelProperty(value = "The account type.")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public ForexQuote baseAmount(Amount baseAmount) {
    
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * Get baseAmount
   * @return baseAmount
  **/
  
  @ApiModelProperty(value = "")

  public Amount getBaseAmount() {
    return baseAmount;
  }


  public void setBaseAmount(Amount baseAmount) {
    this.baseAmount = baseAmount;
  }


  public ForexQuote basePoints(Integer basePoints) {
    
    this.basePoints = basePoints;
    return this;
  }

   /**
   * The base points.
   * @return basePoints
  **/
  
  @ApiModelProperty(required = true, value = "The base points.")

  public Integer getBasePoints() {
    return basePoints;
  }


  public void setBasePoints(Integer basePoints) {
    this.basePoints = basePoints;
  }


  public ForexQuote buy(Amount buy) {
    
    this.buy = buy;
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  
  @ApiModelProperty(value = "")

  public Amount getBuy() {
    return buy;
  }


  public void setBuy(Amount buy) {
    this.buy = buy;
  }


  public ForexQuote interbank(Amount interbank) {
    
    this.interbank = interbank;
    return this;
  }

   /**
   * Get interbank
   * @return interbank
  **/
  
  @ApiModelProperty(value = "")

  public Amount getInterbank() {
    return interbank;
  }


  public void setInterbank(Amount interbank) {
    this.interbank = interbank;
  }


  public ForexQuote reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The reference assigned to the forex quote request.
   * @return reference
  **/
  
  @ApiModelProperty(value = "The reference assigned to the forex quote request.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public ForexQuote sell(Amount sell) {
    
    this.sell = sell;
    return this;
  }

   /**
   * Get sell
   * @return sell
  **/
  
  @ApiModelProperty(value = "")

  public Amount getSell() {
    return sell;
  }


  public void setSell(Amount sell) {
    this.sell = sell;
  }


  public ForexQuote signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * The signature to validate the integrity.
   * @return signature
  **/
  
  @ApiModelProperty(value = "The signature to validate the integrity.")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public ForexQuote source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the forex quote.
   * @return source
  **/
  
  @ApiModelProperty(value = "The source of the forex quote.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public ForexQuote type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of forex.
   * @return type
  **/
  
  @ApiModelProperty(value = "The type of forex.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ForexQuote validTill(OffsetDateTime validTill) {
    
    this.validTill = validTill;
    return this;
  }

   /**
   * The date until which the forex quote is valid.
   * @return validTill
  **/
  
  @ApiModelProperty(required = true, value = "The date until which the forex quote is valid.")

  public OffsetDateTime getValidTill() {
    return validTill;
  }


  public void setValidTill(OffsetDateTime validTill) {
    this.validTill = validTill;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexQuote forexQuote = (ForexQuote) o;
    return Objects.equals(this.account, forexQuote.account) &&
        Objects.equals(this.accountType, forexQuote.accountType) &&
        Objects.equals(this.baseAmount, forexQuote.baseAmount) &&
        Objects.equals(this.basePoints, forexQuote.basePoints) &&
        Objects.equals(this.buy, forexQuote.buy) &&
        Objects.equals(this.interbank, forexQuote.interbank) &&
        Objects.equals(this.reference, forexQuote.reference) &&
        Objects.equals(this.sell, forexQuote.sell) &&
        Objects.equals(this.signature, forexQuote.signature) &&
        Objects.equals(this.source, forexQuote.source) &&
        Objects.equals(this.type, forexQuote.type) &&
        Objects.equals(this.validTill, forexQuote.validTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountType, baseAmount, basePoints, buy, interbank, reference, sell, signature, source, type, validTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForexQuote {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    basePoints: ").append(toIndentedString(basePoints)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    interbank: ").append(toIndentedString(interbank)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("accountType");
    openapiFields.add("baseAmount");
    openapiFields.add("basePoints");
    openapiFields.add("buy");
    openapiFields.add("interbank");
    openapiFields.add("reference");
    openapiFields.add("sell");
    openapiFields.add("signature");
    openapiFields.add("source");
    openapiFields.add("type");
    openapiFields.add("validTill");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("basePoints");
    openapiRequiredFields.add("validTill");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ForexQuote
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ForexQuote.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForexQuote is not found in the empty JSON string", ForexQuote.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ForexQuote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ForexQuote` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ForexQuote.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field account
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      // validate the optional field accountType
      if (jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      // validate the optional field `baseAmount`
      if (jsonObj.getAsJsonObject("baseAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("baseAmount"));
      }
      // validate the optional field `buy`
      if (jsonObj.getAsJsonObject("buy") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("buy"));
      }
      // validate the optional field `interbank`
      if (jsonObj.getAsJsonObject("interbank") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("interbank"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `sell`
      if (jsonObj.getAsJsonObject("sell") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("sell"));
      }
      // validate the optional field signature
      if (jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      // validate the optional field source
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
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
       if (!ForexQuote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForexQuote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForexQuote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForexQuote.class));

       return (TypeAdapter<T>) new TypeAdapter<ForexQuote>() {
           @Override
           public void write(JsonWriter out, ForexQuote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForexQuote read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ForexQuote given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ForexQuote
  * @throws IOException if the JSON string is invalid with respect to ForexQuote
  */
  public static ForexQuote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForexQuote.class);
  }

 /**
  * Convert an instance of ForexQuote to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

