/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.9
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Statutory Deduction Category */
public enum StatutoryDeductionCategory {
  ADDITIONALSTUDENTLOAN("AdditionalStudentLoan"),

  CHILDSUPPORT("ChildSupport"),

  COURTFINES("CourtFines"),

  CREDITOR("Creditor"),

  FEDERALLEVY("FederalLevy"),

  INLANDREVENUEARREARS("InlandRevenueArrears"),

  KIWISAVER("KiwiSaver"),

  MSDREPAYMENTS("MsdRepayments"),

  NONPRIORITYORDER("NonPriorityOrder"),

  PRIORITYORDER("PriorityOrder"),

  TABLEBASED("TableBased"),

  STUDENTLOAN("StudentLoan"),

  VOLUNTARYSTUDENTLOAN("VoluntaryStudentLoan"),

  USCHILDSUPPORT("USChildSupport");

  private String value;

  StatutoryDeductionCategory(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatutoryDeductionCategory fromValue(String value) {
    for (StatutoryDeductionCategory b : StatutoryDeductionCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}