package com.liveproject.simulatecustomer.model;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Objects;

/**
 * Additional information that can not be captured in the structured fields and/or any other specific block.
 */
@ApiModel(description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBSupplementaryData1 extends HashMap<String, Object>  {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBSupplementaryData1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

