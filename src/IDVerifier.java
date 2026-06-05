public class IDVerifier {
    private static final int[] WEIGHTS = {8, 7, 6, 5, 4, 3, 2, 1};
    private static int product = 0;
    private static int dotProduct = 0;

    // RESPONSIBILITY 1: Handles talking to the user and the prompt loops
    public static void verifyID() {
        String choice = "";
        do {
            IO.print("Enter an ID number: ");
            String input = IO.readln().trim();

            // Pass the String input directly to validateID
            String outcomeMessage = validateID(input);
            IO.println(outcomeMessage);

            while (true) {
                IO.println("Do you want to continue?");
                choice = IO.readln().trim();
                if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes") ||
                        choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("No")) {
                    break;
                } else {
                    IO.println("Invalid!");
                    IO.println("Try again!");
                }
            }
        } while (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"));
    }

    // RESPONSIBILITY 2: Directs the traffic (checks formatting first, then handles classification)
    public static String validateID(String input) {
        // 1. Check format safety immediately at the top
        if (input == null || !input.matches("[0-9]{8}")) {
            return "Invalid!\nTry again!";
        }

        calculateDotProduct(input);

        // 3. Evaluate results and return the final string message
        if (product % 11 == 0 && dotProduct >= 16) {
            return "It is a valid faculty ID.";
        } else if (product % 11 == 0) {
            return "It is a valid student ID.";
        } else {
            return "Invalid!\nTry again!";
        }
    }

    // RESPONSIBILITY 3: Pure mathematical calculation (Completely independent method)
    public static int calculateDotProduct(String idNumber) {
        product = 0;
        dotProduct = 0;

        for (int i = 0; i < 8; i++) {
            // Extracts each individual digit safely from the string characters
            int digit = Character.getNumericValue(idNumber.charAt(i));
            product += (digit * WEIGHTS[i]);
        }

        return product;
    }
}
// panfia