public class IDVerifier {
    public static void verifyID() {
        String choice = "";
        do{
            IO.print("Enter an ID number: ");
            String input = IO.readln().trim();

            String outcomeMessage = validateAndGetMessage(input);

            IO.println(outcomeMessage);

            while(true){
                IO.println("Do you want to continue?");
                choice = IO.readln().trim();
                if(choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("Yes" || choice.equalsIgnoreCase("N"||choice.equalsIgnoreCase("No")){
            } break;
                else{
                    IO.println("Invalid!");
                    IO.println("Try again!");
                }
            }
        }while (choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"));
    }
    public static String validateAndGetMessage(String input) {
        if (input == null || !input.matches("[0-9]{8}")) {
            return "Invalid!\nTry again!";
        }

        int idNo = Integer.parseInt(input); // safe to parse since we identified it has 8 digits
        int[] idDigits = String.valueOf(idNo).chars().map(Character::getNumericValue).toArray();

        int[] weights = {8, 7, 6, 5, 4, 3, 2, 1};
        int product = 0;

        for (int i = 0; i < 8; i++) {
            product += (idDigits[i] * weights[i]);
        }
        int dotProduct = product / 11;

        if (product % 11 == 0 && dotProduct >= 16) {
            return "It is a valid faculty ID. ";
        } else if (product % 11 == 0) {
            return "It is a valid student ID. ";
        } else {
            return "Invalid!\nTry again!";
        }

    }
}