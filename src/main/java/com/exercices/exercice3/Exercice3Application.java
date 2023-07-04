package com.exercices.exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercice3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice3Application.class, args);

	}

	public static Predicate<String> isValid() {
		return s -> s.length() == 11 && s.startsWith("W");
	}

	public static List<String> filterValidStrings(List<String> words) {
		List<String> result = new ArrayList<>();
		for (String word : words) {
			if (isValid().test(word)) {
				result.add(word);
			}
		}
		return result;

	}

}
