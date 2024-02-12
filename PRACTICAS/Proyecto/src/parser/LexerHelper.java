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
			if (text.length() == 3) {
				return text.charAt(1);
			}else if(text.equals("'\\n'")){
				return '\n';
			}else if(text.equals("'\\t'")){
				return '\t';
			}else if(text.charAt(1) == '\\'){ //si es con hexstring
				int decimalValue = Integer.parseInt(text.substring(2,text.length()-1));
				return (char) decimalValue;
			}


		}catch(NumberFormatException e) {
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
