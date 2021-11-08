package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Abstract class to be extended by every other exception related to Cluedo .
 */
public abstract class CluedoBusinessException extends Exception {

  public CluedoBusinessException(String message) {
    super(message);
  }
}
