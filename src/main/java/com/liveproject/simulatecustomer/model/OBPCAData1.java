package com.liveproject.simulatecustomer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Objects;

/**
 * OBPCAData1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBPCAData1 extends HashMap<String, Object>  {
  @JsonProperty("ProductDetails")
  private ProductDetails1 productDetails = null;

  @JsonProperty("CreditInterest")
  private CreditInterest1 creditInterest = null;

  @JsonProperty("Overdraft")
  private Overdraft1 overdraft = null;

  @JsonProperty("OtherFeesCharges")
  private OtherFeesCharges otherFeesCharges = null;

  public OBPCAData1 productDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }

  public OBPCAData1 creditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBPCAData1 overdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft1 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public OBPCAData1 otherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPCAData1 obPCAData1 = (OBPCAData1) o;
    return Objects.equals(this.productDetails, obPCAData1.productDetails) &&
        Objects.equals(this.creditInterest, obPCAData1.creditInterest) &&
        Objects.equals(this.overdraft, obPCAData1.overdraft) &&
        Objects.equals(this.otherFeesCharges, obPCAData1.otherFeesCharges) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPCAData1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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
