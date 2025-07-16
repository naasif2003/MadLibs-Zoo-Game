import java.util.Scanner;

public class midslab {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String adjective1;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = input.nextLine();
        System.out.print("Enter a noun(Animal or birds): ");
        noun1 = input.nextLine();
        System.out.print("Enter a verb(Action ): ");
        verb1 = input.nextLine();

        System.out.println("I went to a " + adjective1 + " zoo.");
        System.out.println("There I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + verb1 + ".");
        input.close();
    }
}