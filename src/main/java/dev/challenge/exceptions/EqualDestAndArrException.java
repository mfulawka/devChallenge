package dev.challenge.exceptions;

/**
 * Exception thrown when arr and dest are equal
 *
 * @author MFULAWKA
 */
public class EqualDestAndArrException extends Exception {
  /**
   * Der Konstruktor.
   *
   * @param message for client
   */
  public EqualDestAndArrException(String message) {
    super(message);
  }
}
