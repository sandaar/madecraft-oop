package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayingWithJunit {

  @Test
  void testName() {
    assertEquals(4, NewCalculator.add(2, 2));
  }
}
