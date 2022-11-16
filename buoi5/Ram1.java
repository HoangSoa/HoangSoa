package btbuoi5;

import java.util.Scanner;

public class Ram1 {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String id;
    private Hang hang;

    public Ram1(String name, String id, Hang hang) {
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

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }

    public void input() {
        System.out.println("nhap vap id");
        setId(scanner.nextLine());
        System.out.println("nhap vao ten");
        setName(scanner.nextLine());
        hang.input();
    }
}
