package dev.challenge.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.challenge.api.UcFindRoutes;
import dev.challenge.api.to.DirectRouteTo;
import dev.challenge.exceptions.EqualDestAndArrException;

/**
 * managment layer for module
 *
 */
@Component
public class RouteManagement implements UcFindRoutes {

  @Autowired
  private UcFindRoutes ucFindRoutes;

  @Override
  public DirectRouteTo isDirectRouteForGivenStations(int dep_sid, int arr_sid) {

    try {
      return this.ucFindRoutes.isDirectRouteForGivenStations(dep_sid, arr_sid);
    } catch (EqualDestAndArrException e) {
      return null;
    }
  }

}
