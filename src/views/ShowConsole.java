package views;

import java.util.Scanner;

public class ShowConsole {

    private Scanner scanner = new Scanner(System.in);

    public int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
