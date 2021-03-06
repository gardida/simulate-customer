package com.liveproject.simulatecustomer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic date time for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic date time for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBStatement2StatementDateTime   {
  @JsonProperty("DateTime")
  private String dateTime = null;

  @JsonProperty("Type")
  private String type = null;

  public OBStatement2StatementDateTime dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public OBStatement2StatementDateTime type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementDateTime obStatement2StatementDateTime = (OBStatement2StatementDateTime) o;
    return Objects.equals(this.dateTime, obStatement2StatementDateTime.dateTime) &&
        Objects.equals(this.type, obStatement2StatementDateTime.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementDateTime {\n");

    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

