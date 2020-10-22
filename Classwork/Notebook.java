import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] notes = new String[1000];
        int counter = 0;
        while(true) {
            System.out.println("Please enter command");
            String command = sc.nextLine();
            switch (command) {
                case "add":
                    if (notes[notes.length - 1] == null) {
                        add(counter, notes, sc);
                        if (counter != 999) {
                            counter++;
                        }
                    }
                    else {
                        System.out.println("The notebook is full, please remove something");
                    }
                    break;
                case "remove":
                    if (notes[0] != null) {
                        if (counter > 0) {
                            counter--;
                        }
                        remove(counter, notes, sc);
                    }
                    else {
                        System.out.println("There's nothing to remove");
                    }
                    break;
                case "show":
                    show(notes);
                    break;
                case "show the longest":
                    showTheLongest(notes);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command! Try again");
            }
        }
    }

    public static void add(int counter, String[] notes, Scanner sc){
        notes[counter] = sc.nextLine();
    }

    public static void remove(int counter, String[] notes, Scanner sc){
        if (!(counter == 0 && notes[counter] == null)) {
            notes[counter] = null;
        }
    }
    public static void show(String[] notes) {
        for (int i = 0; i < notes.length && notes[i] != null; i++) {
            System.out.println(notes[i]);
        }
    }
    public static void showTheLongest(String[] notes) {
        String theLongest = "";
        for (int i = 0; i < notes.length && notes[i] != null; i++) {
            if (notes[i].length() > theLongest.length()) {
                theLongest = notes[i];
            }
        }
        System.out.println(theLongest);
    }
}
