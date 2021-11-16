import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MenuProgram1 {
    public static void main(String [] args) {
        ArrayList<Integer> menu=new ArrayList<>();
        Scanner sc=new Scanner(System.in);


        while (true) {
            displayMenu();
            int option=sc.nextInt();

            if (option == 1) {
                System.out.println("enter an integer to the menu :");
                menu.add(sc.nextInt());
                System.out.println("Added");

            }
            else if (option == 2) {
                System.out.println("enter an integer to remove from the menu :");

                int elementToRemove = sc.nextInt();
                if(menu.contains(elementToRemove)){
                    menu.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed");
                }else {
                    System.out.println("element not found");
                }

            }
            else if (option == 3) {
                System.out.println(menu);
            }
            else if(option == 4){

                Collections.sort(menu);
                System.out.println("sorted");

            }
            else if (option == 5) {
                System.out.println("bye");
                break;
            }
        }
    }
            public static void displayMenu(){

                System.out.println("1. add");
                System.out.println("2. delete");
                System.out.println("3. display");
                System.out.println("4: sort");
                System.out.println("5. exit ");
                System.out.println("pick an option ");
    }
}
