package dev.challenge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dev.challenge.api.to.DirectRouteTo;
import dev.challenge.logic.RouteManagement;

/**
 * Unit test
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusApplicationTests {

  @Autowired
  private RouteManagement routeManagement;

  /**
   * Context test
   */
  @Test
  public void contextLoads() {

  }

  /**
   * Positive test for {@link RouteManagement#isDirectRouteForGivenStations(int, int)}
   */
  @Test
  public void positiveTest() {

    DirectRouteTo route = this.routeManagement.isDirectRouteForGivenStations(1, 2);
    Assert.assertTrue(route.isDirect_bus_route());
  }

  /**
   * Negative test for {@link RouteManagement#isDirectRouteForGivenStations(int, int)}
   */
  @Test
  public void negativeTest() {

    DirectRouteTo route = this.routeManagement.isDirectRouteForGivenStations(1, 10);
    Assert.assertFalse(route.isDirect_bus_route());
  }

  /**
   * Business exception test for {@link RouteManagement#isDirectRouteForGivenStations(int, int)}
   */
  @Test
  public void exceptionTest() {

    DirectRouteTo route = this.routeManagement.isDirectRouteForGivenStations(1, 1);
    Assert.assertNull(route);
  }
}
