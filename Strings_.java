class Strings_{
	public static void main(String args[]){
		// using escape sequence \" Double quotes
		System.out.println("you said: \"Hey\" "); 
		// single quote \'
		System.out.println("watcha doin\'");
		//backlash
		System.out.println("typing a backlash \\");
		//String concatenation
		String First_name = "Horrid";
		String Last_name = " Henry";
		System.out.println("I was watching " + First_name + Last_name + " yesterday");
		// using concat method
		System.out.println("I was watching " + First_name.concat(Last_name)+" yesterday");
		//text length
		String txt = "This isn't too long";
		System.out.println(txt);
		System.out.println("Length of "+txt+ " is: "+txt.length());
		//Uppercase Lowercase
		String word = "This is not boring";
		System.out.println(word);
		System.out.println("Uppercase");
		System.out.println(word + " <==> "+word.toUpperCase());
		System.out.println("Lowercase");
		System.out.println(word + " <==> " + word.toLowerCase());
	}
}
