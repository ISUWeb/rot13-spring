package edu.ifiguer.cypher;

import org.springframework.stereotype.Component;

@Component
public class Encipherer {
	public String rot13(String message) {
		String result = "";
		for (int i = 0; i < message.length(); i++) {
			int asciiCode = (int) message.charAt(i);
			asciiCode = asciiCode - (int) 'a';
			asciiCode = (asciiCode + 13) % 26;
			asciiCode = asciiCode + (int) 'a';
			result = result + (char) asciiCode;
		}
		return result;
	}
}
