package com.liveproject.simulatecustomer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadParty3Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-20T16:46:56.313Z")




public class OBReadParty3Data   {
  @JsonProperty("Party")
  @Valid
  private List<OBParty2> party = null;

  public OBReadParty3Data party(List<OBParty2> party) {
    this.party = party;
    return this;
  }

  public OBReadParty3Data addPartyItem(OBParty2 partyItem) {
    if (this.party == null) {
      this.party = new ArrayList<OBParty2>();
    }
    this.party.add(partyItem);
    return this;
  }

  /**
   * Get party
   * @return party
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBParty2> getParty() {
    return party;
  }

  public void setParty(List<OBParty2> party) {
    this.party = party;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadParty3Data obReadParty3Data = (OBReadParty3Data) o;
    return Objects.equals(this.party, obReadParty3Data.party);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty3Data {\n");

    sb.append("    party: ").append(toIndentedString(party)).append("\n");
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

