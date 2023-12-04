package com.invisibleprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Day1 {

  List<String> allLines;


  public Day1(List<String> allLines) {
    this.allLines = allLines;
  }

  public int partI(){
    int sum = 0;

    for (var line : allLines) {
      int firstDigit = 0;
      int lastDigit = 0;

      for (int i = 0; i < line.length(); i++){
        var isDigit = Character.isDigit(line.charAt(i));
        if (isDigit){
          var currentDigit = line.charAt(i) - '0';

          if (firstDigit == 0) {
            firstDigit = currentDigit;
          }
          lastDigit = currentDigit;
        }
      }

      sum += firstDigit * 10 + lastDigit;
    }

    return sum;
  }

  public int partII() {
    int sum = 0;

    var stringDigits = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for (var line : allLines) {
      int firstDigit = 0;
      int lastDigit = 0;

      for (int i = 0; i < line.length(); i++){
        var isDigit = Character.isDigit(line.charAt(i));
        if (isDigit){
          var currentDigit = line.charAt(i) - '0';

          if (firstDigit == 0) {
            firstDigit = currentDigit;
          }
          lastDigit = currentDigit;
        }

        for (int j = 0; j < stringDigits.length; j++) {
          if (line.substring(i).startsWith(stringDigits[j])){
            var currentDigit = j + 1;

            if (firstDigit == 0){
              firstDigit = currentDigit;
            }

            lastDigit = currentDigit;
          }
        }
      }

      sum += firstDigit * 10 + lastDigit;
    }

    return sum;
  }
}
