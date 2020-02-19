/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ReportFields
 */

public class ReportFields {

  
  @JsonProperty("FieldID")
  private UUID fieldID;

  
  @JsonProperty("Description")
  private String description;

  
  @JsonProperty("Value")
  private String value;
  public ReportFields fieldID(UUID fieldID) {
    this.fieldID = fieldID;
    return this;
  }

   /**
   * Get fieldID
   * @return fieldID
  **/
  @ApiModelProperty(value = "")
  public UUID getFieldID() {
    return fieldID;
  }

  public void setFieldID(UUID fieldID) {
    this.fieldID = fieldID;
  }

  public ReportFields description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportFields value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportFields reportFields = (ReportFields) o;
    return Objects.equals(this.fieldID, reportFields.fieldID) &&
        Objects.equals(this.description, reportFields.description) &&
        Objects.equals(this.value, reportFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldID, description, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFields {\n");
    sb.append("    fieldID: ").append(toIndentedString(fieldID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

