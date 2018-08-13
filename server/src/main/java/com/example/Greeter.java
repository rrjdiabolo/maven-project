package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param el nombre de una persona
  * @return cadena de texto
  */

  //Add javadoc comment
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
