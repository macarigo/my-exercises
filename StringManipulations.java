public class StringManipulations {

	public static void main(String [] args) {

		String str = "http://www.academiadecodigo.org";

		int domainSeparator = str.lastIndexOf("/");

		String domain = str.substring(domainSeparator + 1);

		String name = str.replace("http://www.", "").replaceFirst("a", "A").replace("iad", "ia d").replace("ec", "e C").replace(".org", "_"); 
		
		System.out.println ("I am a Code Cadet at < " + name + " >, " + domain);

}
}

