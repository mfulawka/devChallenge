package dev.challenge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * Naive db repo mock
 *
 */
@Component
public class RoutesRepository {

  private List<List<Integer>> routes;

  RoutesRepository() {
    List<Integer> route1 = new ArrayList<>();
    route1.add(6);
    route1.add(7);
    route1.add(8);
    route1.add(9);
    route1.add(10);
    List<Integer> route2 = new ArrayList<>();
    route2.add(1);
    route2.add(2);
    route2.add(3);
    route2.add(4);
    route2.add(5);
    List<Integer> route3 = new ArrayList<>();
    route3.add(10);
    route3.add(20);
    route3.add(30);
    route3.add(40);
    route3.add(50);
    this.routes = new ArrayList<>();
    this.routes.add(route1);
    this.routes.add(route2);
    this.routes.add(route3);
  }

  public int getRoutesSize() {

    return this.routes.size();
  }

  public List<Integer> getRouteForId(int id) {

    if (id < 0 || id >= this.routes.size()) {
      return null;
    }
    return this.routes.get(id);
  }
}
