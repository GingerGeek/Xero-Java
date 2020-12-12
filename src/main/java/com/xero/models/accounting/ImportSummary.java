/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** A summary of the import from setup endpoint */
@ApiModel(description = "A summary of the import from setup endpoint")
public class ImportSummary {
  StringUtil util = new StringUtil();

  @JsonProperty("Accounts")
  private ImportSummaryAccounts accounts;

  @JsonProperty("Organisation")
  private ImportSummaryOrganisation organisation;

  public ImportSummary accounts(ImportSummaryAccounts accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   *
   * @return accounts
   */
  @ApiModelProperty(value = "")
  public ImportSummaryAccounts getAccounts() {
    return accounts;
  }

  public void setAccounts(ImportSummaryAccounts accounts) {
    this.accounts = accounts;
  }

  public ImportSummary organisation(ImportSummaryOrganisation organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation
   *
   * @return organisation
   */
  @ApiModelProperty(value = "")
  public ImportSummaryOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(ImportSummaryOrganisation organisation) {
    this.organisation = organisation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportSummary importSummary = (ImportSummary) o;
    return Objects.equals(this.accounts, importSummary.accounts)
        && Objects.equals(this.organisation, importSummary.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, organisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportSummary {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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