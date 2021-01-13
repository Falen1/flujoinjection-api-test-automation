package  ejemplo.utils;

import java.util.Base64;
import java.util.UUID;

public class BaseUtil {

	private String GenerateRandom(String available_characters, int result_length) {
		String result = "";
		int charactersLength = available_characters.length();
		for (int i = 0; i < result_length; i++) {
			result += available_characters.charAt((int) Math.floor(Math.random() * charactersLength));
		}
		return result;
	}

	public String RandomAlphanumeric(int length) {
		String characters = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return GenerateRandom(characters, length);
	}

	public String RandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return GenerateRandom(characters, length);
	}

	public String RandomNumber(int length) {
		String characters = "123456789";
		return GenerateRandom(characters, length);
	}
	
	public String RandomDomain() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return String.format("@%s.%s", GenerateRandom(characters, 6),"com");
	}

	public String RandomDecimal(int length, int decimals) {
		String characters = "123456789";
		String entero = GenerateRandom(characters, length);
		String decimal = GenerateRandom(characters, decimals);

		return String.format("%s.%s", entero, decimal);
	}

	public String StringReplace(String text, String stringToFind, String stringToReplace) {
		return text.replace(stringToFind, stringToReplace);
	}

	public String RandomUUID() {
		return UUID.randomUUID() + "";
	}

	public String CutString(String texto, int inicio, int fin) {
		return texto.substring(inicio, fin);
	}
	
}
