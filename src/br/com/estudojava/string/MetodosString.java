package br.com.estudojava.string;

public class MetodosString {

	public static void main(String[] args) {

		String nome = "Alura";
		
		//REPLACES
		String replace = nome.replace("Al", "aL");
		System.out.println("replace,('aspas duplas', 'aspas duplas') --> Usando replace para alterar"
				+ " caracteres da classe String: " + replace + "\n");
		
		String replaceChar = nome.replace('a', 'A');
		System.out.println("replace('', '') aspas simples para alterar todos caracteres: " + replaceChar + "\n");
		
		
		//UPPER E LOWERCASES
		String upperCase = nome.toUpperCase();
		System.out.println("toUpperCase() --> Retorna toda string maiúscula: " + upperCase + "\n");

		String lowerCase = nome.toLowerCase();
		System.out.println("toLowerCase() --> Retorna toda string minúsculo: " + lowerCase + "\n");
		
		
		//CHARAT
		char c = nome.charAt(2);
		System.out.println("charAt(index) --> Pegando caractere da posição 2: " + c + "\n");
		
		
		//INDEXOF
		int posSubString = nome.indexOf("A");
		System.out.println("indexOf('') --> Retorna um int posição do caractere passado:"
				+ " " + posSubString + "\n");
		
		
		//SUBSTRING
		String subString = nome.substring(0);
		System.out.println("substring(index) --> Retorna uma sub String, por exemplo,"
				+ " se passar 0 irá retornar a String completa: " + subString + "\n");
		
		System.out.println("substring(index) --> Se passar 1 irá esquecer o primeiro"
				+ " caractere e retornar o resto Exemplo: \n");
		
		String subString2 = nome.substring(1);
		System.out.println(subString2);
		
		
		//LENGTH
		System.out.println("length() --> Retorna a quantidade de caracteres: " + nome.length() + "\n");
		
		
		//USANDO O CHARAT PARA PRINTAR TODOS OS CARACTERES NO CONSOLE
		for(int i = 0; i < nome.length(); i++) {
			System.out.println("Imprimindo caractere por caractere: " + nome.charAt(i));
		}
		
		
		String vazio = "";
		
		//ISEMPTY
		System.out.println("isEmpty() --> Verifica se a String está vazia (se conter espaço"
				+ " irá retorna false): " + vazio.isEmpty() + "\n");
		
		String vazio2 = " ";
		System.out.println("isEmpty() --> Verifica se a String está vazia (se conter espaço"
				+ " irá retorna false): " + vazio2.isEmpty() + "\n");
		
		String semTrim = "   exemplo  ";
		
		//TRIM
		System.out.println("trim() --> Utilizado para tirar espaços de uma String (Antes do trim):"
				+ " " + semTrim + "\n");
		
		
		String comTrim = semTrim.trim();
		System.out.println("trim() --> Com trim: " + comTrim + "\n");
		
		
		//CONTAINS
		String contains = "alura";
		System.out.println("contains('aspas duplas') --> Verifica se contém a sequência de caracteres passada"
				+ " no parametro (retorna boolean): " + contains.contains("alu"));
	}
}
