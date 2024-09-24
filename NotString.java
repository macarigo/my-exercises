class NotString {

public static void main (String[] args) {

	String word = "semicolon";
	String word2 = "nothing";
	String semiWord = "not";

	if ((word.substring(0,3).equals(semiWord))) {
		System.out.println(word);
	}

	else {
		System.out.println(semiWord + word);
	
	}

	if((word2.substring(0,3).equals(semiWord))) {
		System.out.println(word2);
	}

	else {
		System.out.println(semiWord + word2);
	}
	}

}

	
