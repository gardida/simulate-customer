package com.liveproject.simulatecustomer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Objects;

/**
 * OBReadScheduledPayment3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBReadScheduledPayment3 extends HashMap<String, Object>  {
  @JsonProperty("Data")
  private OBReadScheduledPayment3Data data = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadScheduledPayment3 data(OBReadScheduledPayment3Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBReadScheduledPayment3Data getData() {
    return data;
  }

  public void setData(OBReadScheduledPayment3Data data) {
    this.data = data;
  }

  public OBReadScheduledPayment3 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadScheduledPayment3 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadScheduledPayment3 obReadScheduledPayment3 = (OBReadScheduledPayment3) o;
    return Objects.equals(this.data, obReadScheduledPayment3.data) &&
        Objects.equals(this.links, obReadScheduledPayment3.links) &&
        Objects.equals(this.meta, obReadScheduledPayment3.meta) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadScheduledPayment3 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

