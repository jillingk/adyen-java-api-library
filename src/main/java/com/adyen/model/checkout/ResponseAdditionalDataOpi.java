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
 * ResponseAdditionalDataOpi
 */

public class ResponseAdditionalDataOpi {
  public static final String SERIALIZED_NAME_OPI_TRANS_TOKEN = "opi.transToken";
  @SerializedName(SERIALIZED_NAME_OPI_TRANS_TOKEN)
  private String opiTransToken;

  public ResponseAdditionalDataOpi() { 
  }

  public ResponseAdditionalDataOpi opiTransToken(String opiTransToken) {
    
    this.opiTransToken = opiTransToken;
    return this;
  }

   /**
   * Returned in the response if you included &#x60;opi.includeTransToken: true&#x60; in an ecommerce payment request. This contains an Oracle Payment Interface token that you can store in your Oracle Opera database to identify tokenized ecommerce transactions. For more information and required settings, see [Oracle Opera](https://docs.adyen.com/plugins/oracle-opera#opi-token-ecommerce).
   * @return opiTransToken
  **/

  @ApiModelProperty(value = "Returned in the response if you included `opi.includeTransToken: true` in an ecommerce payment request. This contains an Oracle Payment Interface token that you can store in your Oracle Opera database to identify tokenized ecommerce transactions. For more information and required settings, see [Oracle Opera](https://docs.adyen.com/plugins/oracle-opera#opi-token-ecommerce).")

  public String getOpiTransToken() {
    return opiTransToken;
  }


  public void setOpiTransToken(String opiTransToken) {
    this.opiTransToken = opiTransToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataOpi responseAdditionalDataOpi = (ResponseAdditionalDataOpi) o;
    return Objects.equals(this.opiTransToken, responseAdditionalDataOpi.opiTransToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opiTransToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataOpi {\n");
    sb.append("    opiTransToken: ").append(toIndentedString(opiTransToken)).append("\n");
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
    openapiFields.add("opi.transToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataOpi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataOpi.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataOpi is not found in the empty JSON string", ResponseAdditionalDataOpi.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseAdditionalDataOpi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataOpi` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field opi.transToken
      if (jsonObj.get("opi.transToken") != null && !jsonObj.get("opi.transToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `opi.transToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("opi.transToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataOpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataOpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataOpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataOpi.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataOpi>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataOpi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataOpi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataOpi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataOpi
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataOpi
  */
  public static ResponseAdditionalDataOpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataOpi.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataOpi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

