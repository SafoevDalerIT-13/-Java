package ru.safoev.file;

import java.io.*;
import java.util.*;

public class FileRead {
  private Set<Character> voicedConsonants;

  public FileRead() {
    // Инициализируем множество звонких согласных
    this.voicedConsonants = Set.of(
            'б', 'в', 'г', 'д', 'ж', 'з', 'л', 'м', 'н', 'р', 'й'
    );
  }

  // Метод для анализа файла и возврата результата
  public Set<Character> analyzeFile(String filename) throws IOException {
    Set<Character> result = new TreeSet<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String cleanLine = line.toLowerCase().replaceAll("[^а-яё]", "");

        for (char c : cleanLine.toCharArray()) {
          if (voicedConsonants.contains(c)) {
            result.add(c);
          }
        }
      }
    }

    return result;
  }

  // Метод для красивого вывода результата
  public void printResult(Set<Character> consonants) {
    System.out.println("Найденные звонкие согласные:");
    for (char c : consonants) {
      System.out.print(c + " ");
    }
    System.out.println();
  }

  @Override
  public String toString() {
    return "FileRead{" +
            "voicedConsonants=" + voicedConsonants +
            '}';
  }
}
