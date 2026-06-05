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

