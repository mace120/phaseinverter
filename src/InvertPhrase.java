public class InvertPhrase {

	public static void main(String[] args) {
		String inputPhrase = "Are you twenty-one years old?";
		String invertedPhrase = invertPhrase(inputPhrase);
		System.out.println(invertedPhrase);
	}

	public static String invertPhrase(String input) {
		// Split the input phrase into words using spaces as a delimiter
		String[] words = input.split(" ");
		StringBuilder inverted = new StringBuilder();

		// Initialize a variable to keep track of punctuation
		String punctuation = "";

		for (String word : words) {
			// Check if the word ends with a punctuation mark
			if (word.matches(".*[.,!?;:]$")) {
				// Save the punctuation mark and remove it from the word
				punctuation = word.substring(word.length() - 1);
				word = word.substring(0, word.length() - 1);
			} else {
				punctuation = ""; // Reset punctuation
			}

			// Append the word to the inverted phrase with a space
			inverted.insert(0, word);

			// Add back the punctuation mark (if any) and a space
			inverted.insert(0, punctuation + " ");
		}

		// Remove the trailing space and return the inverted phrase
		return inverted.toString().trim();
	}
}
