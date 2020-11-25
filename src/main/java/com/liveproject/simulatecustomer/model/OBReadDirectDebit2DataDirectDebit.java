package com.liveproject.simulatecustomer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Account to or from which a cash entry is made.
 */
@ApiModel(description = "Account to or from which a cash entry is made.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBReadDirectDebit2DataDirectDebit   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("DirectDebitId")
  private String directDebitId = null;

  @JsonProperty("MandateIdentification")
  private String mandateIdentification = null;

  @JsonProperty("DirectDebitStatusCode")
  private OBExternalDirectDebitStatus1Code directDebitStatusCode = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PreviousPaymentDateTime")
  private String previousPaymentDateTime = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("PreviousPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount = null;

  public OBReadDirectDebit2DataDirectDebit accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadDirectDebit2DataDirectDebit directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * Get directDebitId
   * @return directDebitId
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=40) 
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit2DataDirectDebit mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Get mandateIdentification
   * @return mandateIdentification
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=35) 
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBReadDirectDebit2DataDirectDebit directDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Get directDebitStatusCode
   * @return directDebitStatusCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit2DataDirectDebit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebit previousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Get previousPaymentDateTime
   * @return previousPaymentDateTime
  **/
  @ApiModelProperty(value = "")


  public String getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBReadDirectDebit2DataDirectDebit frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Regularity with which direct debit instructions are to be created and processed.
   * @return frequency
  **/
  @ApiModelProperty(value = "Regularity with which direct debit instructions are to be created and processed.")


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBReadDirectDebit2DataDirectDebit previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2DataDirectDebit obReadDirectDebit2DataDirectDebit = (OBReadDirectDebit2DataDirectDebit) o;
    return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebit.accountId) &&
        Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebit.directDebitId) &&
        Objects.equals(this.mandateIdentification, obReadDirectDebit2DataDirectDebit.mandateIdentification) &&
        Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebit.directDebitStatusCode) &&
        Objects.equals(this.name, obReadDirectDebit2DataDirectDebit.name) &&
        Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebit.previousPaymentDateTime) &&
        Objects.equals(this.frequency, obReadDirectDebit2DataDirectDebit.frequency) &&
        Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebit.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, frequency, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2DataDirectDebit {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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
}
