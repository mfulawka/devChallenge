package dev.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.challenge.api.DirectRoutesService;
import dev.challenge.api.to.DirectRouteTo;
import dev.challenge.logic.RouteManagement;

/**
 * Service for retrieving route information.
 *
 * @author MFULAWKA
 */
@RestController
public class DirectRoutesServiceImpl implements DirectRoutesService {

  @Autowired
  private RouteManagement routeManagement;

  @Override
  @RequestMapping("/api/direct")
  public DirectRouteTo isDirectRoute(@RequestParam(value = "dep_sid") int dep_sid,
      @RequestParam(value = "arr_sid") int arr_sid) {

    return this.routeManagement.isDirectRouteForGivenStations(dep_sid, arr_sid);
  }
}
