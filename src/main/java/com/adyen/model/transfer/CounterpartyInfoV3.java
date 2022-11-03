/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfer;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * CounterpartyInfoV3
 */

public class CounterpartyInfoV3 {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private BankAccountV3 bankAccount;

  public static final String SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID)
  private String transferInstrumentId;

  public CounterpartyInfoV3() { 
  }

  public CounterpartyInfoV3 balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
   * @return balanceAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public CounterpartyInfoV3 bankAccount(BankAccountV3 bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankAccountV3 getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(BankAccountV3 bankAccount) {
    this.bankAccount = bankAccount;
  }


  public CounterpartyInfoV3 transferInstrumentId(String transferInstrumentId) {
    
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   * @return transferInstrumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).")

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyInfoV3 counterpartyInfoV3 = (CounterpartyInfoV3) o;
    return Objects.equals(this.balanceAccountId, counterpartyInfoV3.balanceAccountId) &&
        Objects.equals(this.bankAccount, counterpartyInfoV3.bankAccount) &&
        Objects.equals(this.transferInstrumentId, counterpartyInfoV3.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, bankAccount, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyInfoV3 {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
    openapiFields.add("balanceAccountId");
    openapiFields.add("bankAccount");
    openapiFields.add("transferInstrumentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CounterpartyInfoV3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CounterpartyInfoV3.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CounterpartyInfoV3 is not found in the empty JSON string", CounterpartyInfoV3.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CounterpartyInfoV3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CounterpartyInfoV3` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field `bankAccount`
      if (jsonObj.getAsJsonObject("bankAccount") != null) {
        BankAccountV3.validateJsonObject(jsonObj.getAsJsonObject("bankAccount"));
      }
      // validate the optional field transferInstrumentId
      if (jsonObj.get("transferInstrumentId") != null && !jsonObj.get("transferInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferInstrumentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CounterpartyInfoV3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CounterpartyInfoV3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CounterpartyInfoV3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CounterpartyInfoV3.class));

       return (TypeAdapter<T>) new TypeAdapter<CounterpartyInfoV3>() {
           @Override
           public void write(JsonWriter out, CounterpartyInfoV3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CounterpartyInfoV3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CounterpartyInfoV3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CounterpartyInfoV3
  * @throws IOException if the JSON string is invalid with respect to CounterpartyInfoV3
  */
  public static CounterpartyInfoV3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CounterpartyInfoV3.class);
  }

 /**
  * Convert an instance of CounterpartyInfoV3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

