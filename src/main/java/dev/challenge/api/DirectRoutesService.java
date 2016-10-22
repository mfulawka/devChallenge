package dev.challenge.api;

import dev.challenge.api.to.DirectRouteTo;

/**
 * Interface for direct routes Service
 *
 * @author MFULAWKA
 */
public interface DirectRoutesService {

  /**
   * @param dep_sid departure station uid
   * @param arr_sid arrival departure station uid
   * @return {@link DirectRouteTo}
   */
  DirectRouteTo isDirectRoute(int dep_sid, int arr_sid);
}
