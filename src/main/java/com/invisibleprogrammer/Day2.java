package com.invisibleprogrammer;

import java.util.List;

public class Day2 extends Day{

  public Day2(List<String> allLines) {
    this.allLines = allLines;
  }

  public int partI() {
    final int red = 12;
    final int green = 13;
    final int blue = 14;

    int sum = 0;

    for (var line : allLines) {

      var split = line.split("[:;]");
      var gameId = split[0];

      var isPossible = true;

      for (int i = 1; i < split.length; i++){
        var grab =  split[i].trim().split(" ");

        for (int j = 0; j < grab.length; j += 2){

          var colour = grab[j + 1];
          if (colour.endsWith(",")){
            colour = colour.substring(0, colour.length() - 1);
          }
          var pieceCount = Integer.parseInt(grab[j]);

          if (colour.equals("red") && pieceCount > red
                  || colour.equals("green") && pieceCount > green
                  || colour.equals("blue") && pieceCount > blue) {
            isPossible = false;
          }

          if (!isPossible){
            break;
          }
        }
      }

      if (isPossible){
        sum += Integer.parseInt(gameId.substring(5));
      }
    }


    return sum;
  }

  public int partII() {
    int sum = 0;

    for (var line : allLines) {

      var split = line.split("[:;]");

      int red = 0;
      int green = 0;
      int blue = 0;

      for (int i = 1; i < split.length; i++){
        var grab =  split[i].trim().split(" ");

        for (int j = 0; j < grab.length; j += 2){

          var colour = grab[j + 1];
          if (colour.endsWith(",")){
            colour = colour.substring(0, colour.length() - 1);
          }
          var pieceCount = Integer.parseInt(grab[j]);

          switch (colour){
            case "red": red = Math.max(red, pieceCount); break;
            case "green": green = Math.max(green, pieceCount); break;
            case "blue": blue = Math.max(blue, pieceCount); break;
          }
        }
      }

      sum += red * green * blue;

    }

    return sum;
  }
}
