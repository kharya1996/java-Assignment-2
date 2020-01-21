
public class RmoveWhiteSpace {

	public static void main(String[] args) {

		String inputString = "Java is object oriented programming language";
		System.out.println("Input string Is:-" + "  " + inputString);

		// calling the removeSpaceFunction with passing argument

		String outputString = removeSpaceFuntion(inputString);

		// showing out after removing White space from String

		System.out.println("Output String After Removing Space:-" + "   " + outputString);

	}

	public static String removeSpaceFuntion(String inputString) {
		char[] chars = inputString.toCharArray();

		// creating the variable to store the string without white space

		String outputString = "";

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] != ' ') {

				outputString = outputString + chars[i];
			}
		}

		return outputString;

	}

}
