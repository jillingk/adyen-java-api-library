/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalEntityManagement;

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

import com.adyen.model.legalEntityManagement.JSON;

/**
 * StockData
 */

public class StockData {
  public static final String SERIALIZED_NAME_MARKET_IDENTIFIER = "marketIdentifier";
  @SerializedName(SERIALIZED_NAME_MARKET_IDENTIFIER)
  private String marketIdentifier;

  public static final String SERIALIZED_NAME_STOCK_NUMBER = "stockNumber";
  @SerializedName(SERIALIZED_NAME_STOCK_NUMBER)
  private String stockNumber;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "tickerSymbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public StockData() { 
  }

  public StockData marketIdentifier(String marketIdentifier) {
    
    this.marketIdentifier = marketIdentifier;
    return this;
  }

   /**
   * The four-digit [Market Identifier Code](https://en.wikipedia.org/wiki/Market_Identifier_Code) of the stock market where the organization&#39;s stocks are traded.
   * @return marketIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The four-digit [Market Identifier Code](https://en.wikipedia.org/wiki/Market_Identifier_Code) of the stock market where the organization's stocks are traded.")

  public String getMarketIdentifier() {
    return marketIdentifier;
  }


  public void setMarketIdentifier(String marketIdentifier) {
    this.marketIdentifier = marketIdentifier;
  }


  public StockData stockNumber(String stockNumber) {
    
    this.stockNumber = stockNumber;
    return this;
  }

   /**
   * The 12-digit International Securities Identification Number (ISIN) of the company, without dashes (-).
   * @return stockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 12-digit International Securities Identification Number (ISIN) of the company, without dashes (-).")

  public String getStockNumber() {
    return stockNumber;
  }


  public void setStockNumber(String stockNumber) {
    this.stockNumber = stockNumber;
  }


  public StockData tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * The stock ticker symbol.
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stock ticker symbol.")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockData stockData = (StockData) o;
    return Objects.equals(this.marketIdentifier, stockData.marketIdentifier) &&
        Objects.equals(this.stockNumber, stockData.stockNumber) &&
        Objects.equals(this.tickerSymbol, stockData.tickerSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketIdentifier, stockNumber, tickerSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockData {\n");
    sb.append("    marketIdentifier: ").append(toIndentedString(marketIdentifier)).append("\n");
    sb.append("    stockNumber: ").append(toIndentedString(stockNumber)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
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
    openapiFields.add("marketIdentifier");
    openapiFields.add("stockNumber");
    openapiFields.add("tickerSymbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StockData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StockData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StockData is not found in the empty JSON string", StockData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StockData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StockData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field marketIdentifier
      if (jsonObj.get("marketIdentifier") != null && !jsonObj.get("marketIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketIdentifier").toString()));
      }
      // validate the optional field stockNumber
      if (jsonObj.get("stockNumber") != null && !jsonObj.get("stockNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stockNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stockNumber").toString()));
      }
      // validate the optional field tickerSymbol
      if (jsonObj.get("tickerSymbol") != null && !jsonObj.get("tickerSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tickerSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tickerSymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StockData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StockData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StockData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StockData.class));

       return (TypeAdapter<T>) new TypeAdapter<StockData>() {
           @Override
           public void write(JsonWriter out, StockData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StockData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StockData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StockData
  * @throws IOException if the JSON string is invalid with respect to StockData
  */
  public static StockData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StockData.class);
  }

 /**
  * Convert an instance of StockData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
