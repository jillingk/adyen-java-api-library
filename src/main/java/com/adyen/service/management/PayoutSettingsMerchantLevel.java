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


package com.adyen.service.management;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.JSON;
import com.adyen.model.management.PayoutSettings;
import com.adyen.model.management.PayoutSettingsRequest;
import com.adyen.model.management.PayoutSettingsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.UpdatePayoutSettingsRequest;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayoutSettingsMerchantLevel extends ApiKeyAuthenticatedService {
    public PayoutSettingsMerchantLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Delete a payout setting
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param payoutSettingsId The unique identifier of the payout setting. (required)
     * @throws ApiException if fails to make API call
     */
    public void deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId(String merchantId, String payoutSettingsId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (payoutSettingsId == null) {
            throw new ApiException("Missing the required parameter 'payoutSettingsId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("payoutSettingsId", payoutSettingsId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/payoutSettings/{payoutSettingsId}");
        resource.request(requestBody, null, ApiConstants.HttpMethod.DELETE, pathParams);
    }
    
    /**
     * Get a list of payout settings
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @return PayoutSettingsResponse
     * @throws ApiException if fails to make API call
     */
    public PayoutSettingsResponse getMerchantsMerchantIdPayoutSettings(String merchantId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/payoutSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return PayoutSettingsResponse.fromJson(jsonResult);
    }
    
    /**
     * Get a payout setting
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param payoutSettingsId The unique identifier of the payout setting. (required)
     * @return PayoutSettings
     * @throws ApiException if fails to make API call
     */
    public PayoutSettings getMerchantsMerchantIdPayoutSettingsPayoutSettingsId(String merchantId, String payoutSettingsId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (payoutSettingsId == null) {
            throw new ApiException("Missing the required parameter 'payoutSettingsId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("payoutSettingsId", payoutSettingsId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/payoutSettings/{payoutSettingsId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return PayoutSettings.fromJson(jsonResult);
    }
    
    /**
     * Update a payout setting
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param payoutSettingsId The unique identifier of the payout setting. (required)
     * @param updatePayoutSettingsRequest  (optional)
     * @return PayoutSettings
     * @throws ApiException if fails to make API call
     */
    public PayoutSettings patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId(String merchantId, String payoutSettingsId, UpdatePayoutSettingsRequest updatePayoutSettingsRequest) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (payoutSettingsId == null) {
            throw new ApiException("Missing the required parameter 'payoutSettingsId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("payoutSettingsId", payoutSettingsId);

        String requestBody = updatePayoutSettingsRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/payoutSettings/{payoutSettingsId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return PayoutSettings.fromJson(jsonResult);
    }
    
    /**
     * Add a payout setting
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param payoutSettingsRequest  (optional)
     * @return PayoutSettings
     * @throws ApiException if fails to make API call
     */
    public PayoutSettings postMerchantsMerchantIdPayoutSettings(String merchantId, PayoutSettingsRequest payoutSettingsRequest) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);

        String requestBody = payoutSettingsRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/payoutSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return PayoutSettings.fromJson(jsonResult);
    }
    
}