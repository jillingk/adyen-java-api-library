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
import com.adyen.model.checkout.RecurringDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PaymentSetupResponse
 */

public class PaymentSetupResponse {
  public static final String SERIALIZED_NAME_PAYMENT_SESSION = "paymentSession";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION)
  private String paymentSession;

  public static final String SERIALIZED_NAME_RECURRING_DETAILS = "recurringDetails";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAILS)
  private List<RecurringDetail> recurringDetails = null;

  public PaymentSetupResponse() { 
  }

  public PaymentSetupResponse paymentSession(String paymentSession) {
    
    this.paymentSession = paymentSession;
    return this;
  }

   /**
   * The encoded payment session that you need to pass to the SDK.
   * @return paymentSession
  **/
  
  @ApiModelProperty(value = "The encoded payment session that you need to pass to the SDK.")

  public String getPaymentSession() {
    return paymentSession;
  }


  public void setPaymentSession(String paymentSession) {
    this.paymentSession = paymentSession;
  }


  public PaymentSetupResponse recurringDetails(List<RecurringDetail> recurringDetails) {
    
    this.recurringDetails = recurringDetails;
    return this;
  }

  public PaymentSetupResponse addRecurringDetailsItem(RecurringDetail recurringDetailsItem) {
    if (this.recurringDetails == null) {
      this.recurringDetails = new ArrayList<>();
    }
    this.recurringDetails.add(recurringDetailsItem);
    return this;
  }

   /**
   * The detailed list of stored payment details required to generate payment forms. Will be empty if oneClick is set to false in the request.
   * @return recurringDetails
   * @deprecated
  **/
  @Deprecated
  
  @ApiModelProperty(value = "The detailed list of stored payment details required to generate payment forms. Will be empty if oneClick is set to false in the request.")

  public List<RecurringDetail> getRecurringDetails() {
    return recurringDetails;
  }


  public void setRecurringDetails(List<RecurringDetail> recurringDetails) {
    this.recurringDetails = recurringDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupResponse paymentSetupResponse = (PaymentSetupResponse) o;
    return Objects.equals(this.paymentSession, paymentSetupResponse.paymentSession) &&
        Objects.equals(this.recurringDetails, paymentSetupResponse.recurringDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSession, recurringDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse {\n");
    sb.append("    paymentSession: ").append(toIndentedString(paymentSession)).append("\n");
    sb.append("    recurringDetails: ").append(toIndentedString(recurringDetails)).append("\n");
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
    openapiFields.add("paymentSession");
    openapiFields.add("recurringDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentSetupResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentSetupResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSetupResponse is not found in the empty JSON string", PaymentSetupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentSetupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentSetupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field paymentSession
      if (jsonObj.get("paymentSession") != null && !jsonObj.get("paymentSession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentSession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentSession").toString()));
      }
      JsonArray jsonArrayrecurringDetails = jsonObj.getAsJsonArray("recurringDetails");
      if (jsonArrayrecurringDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recurringDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recurringDetails` to be an array in the JSON string but got `%s`", jsonObj.get("recurringDetails").toString()));
        }

        // validate the optional field `recurringDetails` (array)
        for (int i = 0; i < jsonArrayrecurringDetails.size(); i++) {
          RecurringDetail.validateJsonObject(jsonArrayrecurringDetails.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSetupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSetupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSetupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSetupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSetupResponse>() {
           @Override
           public void write(JsonWriter out, PaymentSetupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentSetupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentSetupResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSetupResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentSetupResponse
  */
  public static PaymentSetupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSetupResponse.class);
  }

 /**
  * Convert an instance of PaymentSetupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

