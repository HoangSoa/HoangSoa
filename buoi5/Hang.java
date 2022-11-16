package btbuoi5;

import java.util.Scanner;

public class Hang {
    Scanner scanner = new Scanner(System.in);
    private String name;

    public Hang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        System.out.println("Moi ban nhap hang linh kien");
        setName(scanner.nextLine());
    }
}

