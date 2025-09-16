import java.util.Scanner;

public class YourOwnAdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to: Choose Your Own Adventure — Year 3433\n");

        while (true) {
            playAdventure(sc);

            System.out.print("Press [y] to restart or any other key to quit: ");
            String again = sc.nextLine().trim().toLowerCase();
            if (!again.equals("y")) {
                System.out.println("Thanks for playing. See ya!");
                break;
            }
            System.out.println();
        }
        sc.close();
    }

    private static void playAdventure(Scanner sc) {
        System.out.println("You have been transported to the year 3433. You wake up far from Earth.");
        System.out.println("It's dark, gravity feels odd, and there's a house nearby.\n");

        System.out.println("Select one: [a] Walk towards the house or [b] call out to the house");
        System.out.print(">> ");
        String choice1 = sc.nextLine().trim().toLowerCase();

        if (choice1.equals("a") || choice1.equals("walk") || choice1.equals("walk towards the house")) {
            System.out.println("You approach the house and walk up the stairs. The lights suddenly turn on inside.");

            System.out.println("Select one: [a] Knock on the door or [b] peek through a window");
            System.out.print(">> ");
            String choice2 = sc.nextLine().trim().toLowerCase();

            if (choice2.equals("a") || choice2.equals("knock") ) {
                System.out.println("A calm voice invites you in. Inside there's a table with strange glowing berries.");

                System.out.println("Select one: [a] Eat a berry or [b] refuse and explore the house");
                System.out.print(">> ");
                String choice3 = sc.nextLine().trim().toLowerCase();

                if (choice3.equals("a") || choice3.equals("eat") ) {
                    System.out.println("You ate some berries and didn't die. Peeta is that you? Press [y] to play again.");
                    return;
                } else {
                    System.out.println("The computer says you live on! ");
                    System.out.println("(A soft synthetic voice: \"Life signs nominal. Continue mission.\")");
                    System.out.println("Press [y] to play again.");
                    return;
                }
            } else {
                System.out.println("As you lean to peek, the step beneath you crumbles — it was a cleverly hidden cliff-edge.");
                System.out.println("You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.");
                return;
            }

        } else if (choice1.equals("b") || choice1.equals("call") || choice1.equals("call out")) {
            System.out.println("You call out and a distant speaker answers, but the sound confuses you and the ground shudders.");

            System.out.println("Select one: [a] Run away from the house or [b] stay and listen");
            System.out.print(">> ");
            String choiceAlt = sc.nextLine().trim().toLowerCase();

            if (choiceAlt.equals("a") || choiceAlt.equals("run")) {
                System.out.println("In your panic you don't see the thin bridge; it snaps. You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.");
                return;
            } else {
                System.out.println("You stay and listen; the speaker runs a diagnostic and proclaims you fit for survival.");
                System.out.println("The computer says you live on!");
                return;
            }

        } else {
            System.out.println("Invalid choice!");
            System.out.println();
            playAdventure(sc);
        }
    }
}
