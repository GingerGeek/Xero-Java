/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
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
import com.xero.models.accounting.LineItemTracking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LineItem
 */

public class LineItem {
  
  @JsonProperty("LineItemID")
  private UUID lineItemID;

  
  @JsonProperty("Description")
  private String description;

  
  @JsonProperty("Quantity")
  private Double quantity;

  
  @JsonProperty("UnitAmount")
  private Double unitAmount;

  
  @JsonProperty("ItemCode")
  private String itemCode;

  
  @JsonProperty("AccountCode")
  private String accountCode;

  
  @JsonProperty("TaxType")
  private String taxType;

  
  @JsonProperty("TaxAmount")
  private Double taxAmount;

  
  @JsonProperty("LineAmount")
  private Double lineAmount;

  
  @JsonProperty("Tracking")
  private List<LineItemTracking> tracking = new ArrayList<LineItemTracking>();

  
  @JsonProperty("DiscountRate")
  private String discountRate;

  
  @JsonProperty("RepeatingInvoiceID")
  private UUID repeatingInvoiceID;

  public LineItem lineItemID(UUID lineItemID) {
    this.lineItemID = lineItemID;
    return this;
  }

   /**
   * LineItem unique ID
   * @return lineItemID
  **/
  @ApiModelProperty(value = "LineItem unique ID")
  public UUID getLineItemID() {
    return lineItemID;
  }

  public void setLineItemID(UUID lineItemID) {
    this.lineItemID = lineItemID;
  }

  public LineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description needs to be at least 1 char long. A line item with just a description (i.e no unit amount or quantity) can be created by specifying just a &lt;Description&gt; element that contains at least 1 character
   * @return description
  **/
  @ApiModelProperty(value = "Description needs to be at least 1 char long. A line item with just a description (i.e no unit amount or quantity) can be created by specifying just a <Description> element that contains at least 1 character")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LineItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * LineItem Quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "LineItem Quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public LineItem unitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }

   /**
   * LineItem Unit Amount
   * @return unitAmount
  **/
  @ApiModelProperty(value = "LineItem Unit Amount")
  public Double getUnitAmount() {
    return unitAmount;
  }

  public void setUnitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
  }

  public LineItem itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * See Items
   * @return itemCode
  **/
  @ApiModelProperty(value = "See Items")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public LineItem accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * See Accounts
   * @return accountCode
  **/
  @ApiModelProperty(value = "See Accounts")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public LineItem taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * The tax type from TaxRates
   * @return taxType
  **/
  @ApiModelProperty(value = "The tax type from TaxRates")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public LineItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The tax amount is auto calculated as a percentage of the line amount (see below) based on the tax rate. This value can be overriden if the calculated &lt;TaxAmount&gt; is not correct.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The tax amount is auto calculated as a percentage of the line amount (see below) based on the tax rate. This value can be overriden if the calculated <TaxAmount> is not correct.")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public LineItem lineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

   /**
   * If you wish to omit either of the &lt;Quantity&gt; or &lt;UnitAmount&gt; you can provide a LineAmount and Xero will calculate the missing amount for you. The line amount reflects the discounted price if a DiscountRate has been used . i.e LineAmount &#x3D; Quantity * Unit Amount * ((100 – DiscountRate)/100)
   * @return lineAmount
  **/
  @ApiModelProperty(value = "If you wish to omit either of the <Quantity> or <UnitAmount> you can provide a LineAmount and Xero will calculate the missing amount for you. The line amount reflects the discounted price if a DiscountRate has been used . i.e LineAmount = Quantity * Unit Amount * ((100 – DiscountRate)/100)")
  public Double getLineAmount() {
    return lineAmount;
  }

  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }

  public LineItem tracking(List<LineItemTracking> tracking) {
    this.tracking = tracking;
    return this;
  }

  public LineItem addTrackingItem(LineItemTracking trackingItem) {
    if (this.tracking == null) {
      this.tracking = new ArrayList<LineItemTracking>();
    }
    this.tracking.add(trackingItem);
    return this;
  }

   /**
   * Optional Tracking Category – see Tracking.  Any LineItem can have a  maximum of 2 &lt;TrackingCategory&gt; elements.
   * @return tracking
  **/
  @ApiModelProperty(value = "Optional Tracking Category – see Tracking.  Any LineItem can have a  maximum of 2 <TrackingCategory> elements.")
  public List<LineItemTracking> getTracking() {
    return tracking;
  }

  public void setTracking(List<LineItemTracking> tracking) {
    this.tracking = tracking;
  }

  public LineItem discountRate(String discountRate) {
    this.discountRate = discountRate;
    return this;
  }

   /**
   * Percentage discount being applied to a line item (only supported on  ACCREC invoices – ACC PAY invoices and credit notes in Xero do not support discounts
   * @return discountRate
  **/
  @ApiModelProperty(value = "Percentage discount being applied to a line item (only supported on  ACCREC invoices – ACC PAY invoices and credit notes in Xero do not support discounts")
  public String getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(String discountRate) {
    this.discountRate = discountRate;
  }

  public LineItem repeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
    return this;
  }

   /**
   * The Xero identifier for a Repeating Invoicee.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return repeatingInvoiceID
  **/
  @ApiModelProperty(value = "The Xero identifier for a Repeating Invoicee.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getRepeatingInvoiceID() {
    return repeatingInvoiceID;
  }

  public void setRepeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.lineItemID, lineItem.lineItemID) &&
        Objects.equals(this.description, lineItem.description) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.unitAmount, lineItem.unitAmount) &&
        Objects.equals(this.itemCode, lineItem.itemCode) &&
        Objects.equals(this.accountCode, lineItem.accountCode) &&
        Objects.equals(this.taxType, lineItem.taxType) &&
        Objects.equals(this.taxAmount, lineItem.taxAmount) &&
        Objects.equals(this.lineAmount, lineItem.lineAmount) &&
        Objects.equals(this.tracking, lineItem.tracking) &&
        Objects.equals(this.discountRate, lineItem.discountRate) &&
        Objects.equals(this.repeatingInvoiceID, lineItem.repeatingInvoiceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemID, description, quantity, unitAmount, itemCode, accountCode, taxType, taxAmount, lineAmount, tracking, discountRate, repeatingInvoiceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    lineItemID: ").append(toIndentedString(lineItemID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    repeatingInvoiceID: ").append(toIndentedString(repeatingInvoiceID)).append("\n");
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

