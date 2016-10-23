package dev.challenge.api.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Transfer Object for Direct routes.
 *
 * @author MFULAWKA
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = DirectRouteTo.class, name = "object") })
public class DirectRouteTo {
  @JsonProperty(required = true)
  private int dep_sid;

  @JsonProperty(required = true)
  private int arr_sid;

  @JsonProperty(required = true)
  private boolean direct_bus_route;

  /**
   * @return dep_sid
   */
  public int getDep_sid() {

    return this.dep_sid;
  }

  /**
   * @param dep_sid ist der neue Wert von {@link #getDep_sid}.
   */
  public void setDep_sid(int dep_sid) {

    this.dep_sid = dep_sid;
  }

  /**
   * @return arr_sid
   */
  public int getArr_sid() {

    return this.arr_sid;
  }

  /**
   * @param arr_sid ist der neue Wert von {@link #getArr_sid}.
   */
  public void setArr_sid(int arr_sid) {

    this.arr_sid = arr_sid;
  }

  /**
   * @return direct_bus_route
   */
  public boolean isDirect_bus_route() {

    return this.direct_bus_route;
  }

  /**
   * @param direct_bus_route ist der neue Wert von {@link #isDirect_bus_route}.
   */
  public void setDirect_bus_route(boolean direct_bus_route) {

    this.direct_bus_route = direct_bus_route;
  }
}
