package com.invisibleprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class StringUtil {
  public List<String> readFileFromResources(String fileName){
    List<String> allLines;

    try (InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
      assert stream != null;
      allLines = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8)).lines().toList();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return allLines;
  }
}
