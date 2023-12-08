package com.invisibleprogrammer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day2Test extends TestBase{

  @Test
  public void partI_exampleTest(){
    Assertions.assertEquals(8, getDay2("day2-sample.txt").partI());
  }

  @Test
  public void partI_fullTest(){
    Assertions.assertEquals(2600, getDay2("day2-full.txt").partI());
  }

  @Test
  public void partII_exampleTest(){
    Assertions.assertEquals(2286, getDay2("day2-sample.txt").partII());
  }

  @Test
  public void partII_fullTest(){
    Assertions.assertEquals(86036, getDay2("day2-full.txt").partII());
  }

  private static Day2 getDay2(String fileName) {
    return new Day2(stringUtil.readFileFromResources(fileName));
  }
}
