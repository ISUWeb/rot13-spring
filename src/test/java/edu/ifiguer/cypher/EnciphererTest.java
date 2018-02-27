package edu.ifiguer.cypher;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnciphererTest {
	@Test
	public void basicEncryption() {
		Encipherer encipherer = new Encipherer();
		
		String original = "abcdefghijklmnopqrstuvwxyz";
		String expected = "nopqrstuvwxyzabcdefghijklm";
		String actual = encipherer.rot13(original);
		
		assertEquals(expected, actual);
	}

}
