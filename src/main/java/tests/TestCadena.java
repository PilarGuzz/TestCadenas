package main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.java.unit.Cadena;

class TestCadena {

	@ValueSource(strings = {"ana", "abba"})
	@ParameterizedTest
	void testEsAnagrama(String palabra) {
		Cadena cadena = new Cadena(palabra);
		assert(cadena.esAnagrama());
			
	}	
	
	@ValueSource(strings = {"hola", "perro"})
	@ParameterizedTest
	void testNoEsAnagrama(String palabra) {
		Cadena cadena = new Cadena(palabra);
		assert(!cadena.esAnagrama());
			
	}
	
	@ValueSource(strings = {"", "   " })
	@ParameterizedTest
	void testNoEsAnagramaEspacios(String palabra) {
		Cadena cadena = new Cadena(palabra);
		assert(!cadena.esAnagrama());
			
	}
	@ValueSource(ints = {12, 12221})
	@ParameterizedTest
	void testNoEsAnagramaInteger(Integer num) {

		assert(!new Cadena(num).esAnagrama());		
	}
		
	@ValueSource(ints = {2002, 121})
	@ParameterizedTest
	void esCapicua(Integer num) {
		Cadena cadena = new Cadena(num);
		assert(cadena.esCapicua());
		
	}
	
	@ValueSource(ints = {2022, 123})
	@ParameterizedTest
	void noEsCapicua(Integer num) {
		Cadena cadena = new Cadena(num);
		assert(!cadena.esCapicua());
		
	}
	
	@ValueSource(strings = {"ana", "perro"})
	@ParameterizedTest
	void noEsCapicuaString(String cadena) {
		assert(!new Cadena(cadena).esCapicua());	

	}
	
	@ValueSource(doubles = {12.21, 1.1})
	@ParameterizedTest
	void esCapicuaDouble(double num) {
		Cadena cadena = new Cadena(num);
		assert(cadena.esCapicua(num));
		
	}
	
	@ValueSource(doubles = {20.22, 1.23})
	@ParameterizedTest
	void noEsCapicuaDouble(double num) {
		Cadena cadena = new Cadena(num);
		assert(!cadena.esCapicua(num));
		
	}
	
	
	
	

}
