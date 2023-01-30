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
 * Timeouts
 */

public class Timeouts {
  public static final String SERIALIZED_NAME_FROM_ACTIVE_TO_SLEEP = "fromActiveToSleep";
  @SerializedName(SERIALIZED_NAME_FROM_ACTIVE_TO_SLEEP)
  private Integer fromActiveToSleep;

  public Timeouts() { 
  }

  public Timeouts fromActiveToSleep(Integer fromActiveToSleep) {
    
    this.fromActiveToSleep = fromActiveToSleep;
    return this;
  }

   /**
   * Indicates the number of seconds of inactivity after which the terminal display goes into sleep mode.
   * @return fromActiveToSleep
  **/

  @ApiModelProperty(value = "Indicates the number of seconds of inactivity after which the terminal display goes into sleep mode.")

  public Integer getFromActiveToSleep() {
    return fromActiveToSleep;
  }


  public void setFromActiveToSleep(Integer fromActiveToSleep) {
    this.fromActiveToSleep = fromActiveToSleep;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timeouts timeouts = (Timeouts) o;
    return Objects.equals(this.fromActiveToSleep, timeouts.fromActiveToSleep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromActiveToSleep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timeouts {\n");
    sb.append("    fromActiveToSleep: ").append(toIndentedString(fromActiveToSleep)).append("\n");
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
    openapiFields.add("fromActiveToSleep");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timeouts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Timeouts.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timeouts is not found in the empty JSON string", Timeouts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Timeouts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Timeouts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timeouts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timeouts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timeouts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timeouts.class));

       return (TypeAdapter<T>) new TypeAdapter<Timeouts>() {
           @Override
           public void write(JsonWriter out, Timeouts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Timeouts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Timeouts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timeouts
  * @throws IOException if the JSON string is invalid with respect to Timeouts
  */
  public static Timeouts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timeouts.class);
  }

 /**
  * Convert an instance of Timeouts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

