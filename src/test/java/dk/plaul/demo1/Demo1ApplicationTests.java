package dk.plaul.demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

  private static final int NUMBER = 5;


  @Test
  void contextLoads() {
    assertEquals(5, NUMBER);
  }
  @Test
  void dummyTest() {
    assertEquals(25, NUMBER*5);
  }

}
