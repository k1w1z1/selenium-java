public class LetterCaseEachWord {
    // Write method to input a sentence, and return the first letter of each word in UPPERCASE
    public static void main(String[] args) {
        String input = "hello world";
        String result = letterCase(input);
        System.out.println("First letter of each word in UPPERCASE: " + result); // Hello World
        System.out.println(letterCase("I      am        fabulous")); // I Am Fabulous
        System.out.println(letterCase(null)); // Invalid input :(
    }

    public static String letterCase(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Invalid input :(");
        }
        String[] words = input.trim().split("\\s+");
        // If missing \\s+ in split, "I      am        fabulous" will be INVALID, because there're too many spaces
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result
                    .append(word.substring(0,1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }
        return result.toString().trim();
    }
}
