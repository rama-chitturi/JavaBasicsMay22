package basics;

/** Changing class name from file name only applies when the class not having public modifier **/

public class tryingToChange {

	public static void main(String[] args) {
		
	}

}

class ClassNameChanged {

	public static void main(String[] args) {
		System.out.println("Class name can be changed with no public modifier");
		
	}

}

/** From command need to compile Java file name and execute class file 
 * like below
 * javac ProgramInternal
 * java ClassNameChanged.java
 */
