package btbuoi5;

import java.util.Scanner;

public class CPU1 {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String id;
    private Hang hang;

    public CPU1( String name, String id, Hang hang) {
        this.name = name;
        this.id = id;
        this.hang = hang;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hang getBrand() {
        return hang;
    }

    public void setBrand(Hang brand) {
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
