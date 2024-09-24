class frontBack {

public static void main (String[] args) {
	
	String word = "heisenberg";
	char firstLetter = word.charAt(0);
	char lastLetter = word.charAt(word.length () - 1);
	String semiWord = word.substring(1, word.length() - 1);

	System.out.println(lastLetter + semiWord + firstLetter);

}

}

