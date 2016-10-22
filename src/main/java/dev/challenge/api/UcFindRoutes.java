package dev.challenge.api;

import dev.challenge.api.to.DirectRouteTo;
import dev.challenge.exceptions.EqualDestAndArrException;

/**
 * Interface for ucFindRoutes
 *
 * @author MFULAWKA
 */
public interface UcFindRoutes {

  /**
   * @param dep_sid departure station uid
   * @param arr_sid arrival station uid
   * @return {@link DirectRouteTo}
   * @throws EqualDestAndArrException when dep_sid are equal
   */
  DirectRouteTo isDirectRouteForGivenStations(int dep_sid, int arr_sid) throws EqualDestAndArrException;
}
