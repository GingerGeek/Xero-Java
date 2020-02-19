/*
 * Xero oAuth 2 identity service
 * This specifing endpoints related to managing authentication tokens and identity for Xero API
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.identity;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * AccessToken
 */

public class AccessToken {

  
  @JsonProperty("id_token")
  private String idToken;

  
  @JsonProperty("access_token")
  private String accessToken;

  
  @JsonProperty("expires_in")
  private BigDecimal expiresIn;

  
  @JsonProperty("token_type")
  private String tokenType;

  
  @JsonProperty("refresh_token")
  private String refreshToken;
  public AccessToken idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

   /**
   * Xero unique identifier
   * @return idToken
  **/
  @ApiModelProperty(value = "Xero unique identifier")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public AccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * access token provided during authentication flow
   * @return accessToken
  **/
  @ApiModelProperty(value = "access token provided during authentication flow")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessToken expiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * time in milliseconds until access token expires.
   * @return expiresIn
  **/
  @ApiModelProperty(value = "time in milliseconds until access token expires.")
  public BigDecimal getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * type of token i.e. Bearer
   * @return tokenType
  **/
  @ApiModelProperty(value = "type of token i.e. Bearer")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * token used to refresh an expired access token
   * @return refreshToken
  **/
  @ApiModelProperty(value = "token used to refresh an expired access token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.idToken, accessToken.idToken) &&
        Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn) &&
        Objects.equals(this.tokenType, accessToken.tokenType) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, accessToken, expiresIn, tokenType, refreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

