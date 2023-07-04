package com.exercices.exercice3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Exercice3ApplicationTests {

	@Test
	void testIsValid() {
		String w1 = "W1234567890";
		String w2 = "X1234567890";
		String w3 = "W12345678901";
		String w4 = "W9876543210";
		List<String> words = new ArrayList<>(Arrays.asList(w1, w2, w3,w4));
		List<String> expected = new ArrayList<>(Arrays.asList(w1, w4));
		List<String> filtered = Exercice3Application.filterValidStrings(words);
		assertEquals(expected.size(), filtered.size());
		assertTrue(expected.containsAll(filtered) && filtered.containsAll(expected));
	}

}
