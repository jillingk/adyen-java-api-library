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
 * GiroPayInfo
 */

public class GiroPayInfo {
  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "supportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public GiroPayInfo() { 
  }

  public GiroPayInfo supportEmail(String supportEmail) {
    
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * The email address of merchant support.
   * @return supportEmail
  **/

  @ApiModelProperty(required = true, value = "The email address of merchant support.")

  public String getSupportEmail() {
    return supportEmail;
  }


  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiroPayInfo giroPayInfo = (GiroPayInfo) o;
    return Objects.equals(this.supportEmail, giroPayInfo.supportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiroPayInfo {\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
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
    openapiFields.add("supportEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supportEmail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GiroPayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GiroPayInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GiroPayInfo is not found in the empty JSON string", GiroPayInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GiroPayInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GiroPayInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GiroPayInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field supportEmail
      if (jsonObj.get("supportEmail") != null && !jsonObj.get("supportEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GiroPayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GiroPayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GiroPayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GiroPayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GiroPayInfo>() {
           @Override
           public void write(JsonWriter out, GiroPayInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GiroPayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GiroPayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GiroPayInfo
  * @throws IOException if the JSON string is invalid with respect to GiroPayInfo
  */
  public static GiroPayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GiroPayInfo.class);
  }

 /**
  * Convert an instance of GiroPayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

