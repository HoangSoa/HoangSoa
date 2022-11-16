package btbuoi5;

import java.util.Scanner;

public class Mainboard {
    Scanner scanner = new Scanner(System.in);
    private String id;
    private String name;

    private Hang hang;

    public Mainboard(String id, String name, Hang hang) {
        this.name = name;
        this.id = id;
        this.hang = hang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hang getBrand() {
        return hang;
    }

    public void setBrand(Hang hang) {
        this.hang = hang;
    }

    public void input(){
        System.out.println("Moi ban nhap id:");
        setId(scanner.nextLine());
        System.out.println("Moi ban nhap TEN:");
        setName(scanner.nextLine());
        hang.input();
    }
}
