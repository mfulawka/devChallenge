package dev.challenge.logic.uc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.challenge.api.UcFindRoutes;
import dev.challenge.api.to.DirectRouteTo;
import dev.challenge.dao.RoutesRepository;
import dev.challenge.exceptions.EqualDestAndArrException;

/**
 * uc for finding routes
 */
@Component
public class UcFindRoutesImpl implements UcFindRoutes {

  @Autowired
  private RoutesRepository routesRepository;

  @Override
  public DirectRouteTo isDirectRouteForGivenStations(int dep_sid, int arr_sid) throws EqualDestAndArrException {

    if (dep_sid == arr_sid) {
      throw new EqualDestAndArrException("dep_sid, and arr_sid must not be equal");
    }
    DirectRouteTo route = new DirectRouteTo();
    route.setArr_sid(arr_sid);
    route.setDep_sid(dep_sid);
    route.setDirect_bus_route(false);
    // Justification for code below
    // In a simple mock i have a simple data
    // normal system is more complex - it can deliver 100.000 bus routes * 1000 stops in route.
    // about 390 MB of data
    // servlet is not single threat app
    // we must process m requests.
    // loading whole data set to ram is certain outOfMemory
    // so i will pay the price of 100.000 request and load data partially
    int size = this.routesRepository.getRoutesSize();
    for (int i = 0; i < size; i++) {
      List<Integer> busRoute = this.routesRepository.getRouteForId(i);
      if (null == busRoute) {
        break;
      }
      if (busRoute.contains(new Integer(dep_sid)) && busRoute.contains(new Integer(arr_sid))) {
        route.setDirect_bus_route(true);
      }
    }
    return route;
  }
}
