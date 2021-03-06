/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** DeductionLine */
public class DeductionLine {
  StringUtil util = new StringUtil();

  @JsonProperty("deductionTypeID")
  private UUID deductionTypeID;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("subjectToTax")
  private Boolean subjectToTax;

  @JsonProperty("percentage")
  private Double percentage;

  public DeductionLine deductionTypeID(UUID deductionTypeID) {
    this.deductionTypeID = deductionTypeID;
    return this;
  }

  /**
   * Xero identifier for payroll deduction
   *
   * @return deductionTypeID
   */
  @ApiModelProperty(value = "Xero identifier for payroll deduction")
  public UUID getDeductionTypeID() {
    return deductionTypeID;
  }

  public void setDeductionTypeID(UUID deductionTypeID) {
    this.deductionTypeID = deductionTypeID;
  }

  public DeductionLine displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * name of earnings rate for display in UI
   *
   * @return displayName
   */
  @ApiModelProperty(value = "name of earnings rate for display in UI")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DeductionLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the deduction line
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the deduction line")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DeductionLine subjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
    return this;
  }

  /**
   * Identifies if the deduction is subject to tax
   *
   * @return subjectToTax
   */
  @ApiModelProperty(value = "Identifies if the deduction is subject to tax")
  public Boolean getSubjectToTax() {
    return subjectToTax;
  }

  public void setSubjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
  }

  public DeductionLine percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Deduction rate percentage
   *
   * @return percentage
   */
  @ApiModelProperty(value = "Deduction rate percentage")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionLine deductionLine = (DeductionLine) o;
    return Objects.equals(this.deductionTypeID, deductionLine.deductionTypeID)
        && Objects.equals(this.displayName, deductionLine.displayName)
        && Objects.equals(this.amount, deductionLine.amount)
        && Objects.equals(this.subjectToTax, deductionLine.subjectToTax)
        && Objects.equals(this.percentage, deductionLine.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionTypeID, displayName, amount, subjectToTax, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionLine {\n");
    sb.append("    deductionTypeID: ").append(toIndentedString(deductionTypeID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    subjectToTax: ").append(toIndentedString(subjectToTax)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
