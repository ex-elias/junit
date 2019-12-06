package junit;

public class Str {
	
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String withoutX2(String str) {
		if(str == "") {
			return str;
		}
		if(str.startsWith("xx")) {
			return str.substring(2);
		}
		if(str.startsWith("x")) {
			return str.substring(1);
		}
		if(str.charAt(1) == 'x') {
			return str.charAt(0) + str.substring(2);
		}
		return str;
	}

	public String doubleChar(String str) {
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			res += "" + str.charAt(i) + str.charAt(i);
		}
		return res;
	}

	public String starOut(String str) {
		String res = "";
		while(str.indexOf("*") != -1) {
			if(str.equals("*")) {
				str = "";
			}
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '*') {
					if(i == 0 && i != str.length() - 1) {
						if(str.charAt(i + 1) == '*') {
							str = str.substring(i + 1);
						} else {
							str = str.substring(i + 2);
						}
						break;
					} else if(i != str.length() - 1) {
						res = res.concat(str.substring(0, i - 1));
						str = str.substring(i);
						break;
					} else {
						str = str.substring(0, i - 1);
					}
				}
			}
		}
		return res + str;
	}

	public String wordEnds(String str, String word) {
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.startsWith(word, i)) {
				if(i != 0) {
					res += "" + str.charAt(i - 1);
				}
				if(i + word.length() != str.length()) {
					res += "" + str.charAt(i + word.length());
				}
			}
		}
		return res;
	}

}
