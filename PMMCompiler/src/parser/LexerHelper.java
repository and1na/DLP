package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		try {
			switch (text) {
				case "'\\n'":
					return '\n';
				case "'\\t'":
					return '\t';
				default:
					if (text.length() == 3) {
						return text.charAt(1);
					}
					if (text.matches("'\\\\[1-9][0-9]*'")) {
						return (char) Integer.parseInt(text.substring(2,text.length()-1));
					}
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return 1;
	}

	public static double lexemeToReal(String text) {
		try {
			return Double.parseDouble(text);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;


	}



}
