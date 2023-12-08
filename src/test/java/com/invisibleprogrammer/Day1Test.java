package com.invisibleprogrammer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1Test extends TestBase {
  @Test
  public void partI_exampleTest(){
    Assertions.assertEquals(142, getDay1("day1-partI-sample.txt").partI());
  }

  @Test
  public void partI_fullTest(){
    Assertions.assertEquals(55002, getDay1("day1-full.txt").partI());
  }

  @Test
  public void partII_exampleTest(){
    Assertions.assertEquals(281, getDay1("day1-partII-sample.txt").partII());
  }

  @Test
  public void partII_fullTest(){
    Assertions.assertEquals(55093, getDay1("day1-full.txt").partII());
  }

  private static Day1 getDay1(String fileName) {
    return new Day1(stringUtil.readFileFromResources(fileName));
  }
}