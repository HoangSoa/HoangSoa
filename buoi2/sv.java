package buoi2_sv;

import java.util.Scanner;

public class sv {
    private String name;
    private String grade;
    private int age;
    private double math, chemistry, physics;

    public sv() {
    }

    public sv(String name, String grade, int age, double math, double chemistry, double physics) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sv: ");
        this.name = scanner.nextLine();
        System.out.println("nhap lop sv: ");
        this.grade = scanner.nextLine();
        System.out.println("nhap tuoi sv: ");
        this.age = scanner.nextInt();
        System.out.println("nhap diem mon toan sv: ");
        this.math = scanner.nextDouble();
        System.out.println("nhap diem mon hoa sv: ");
        this.chemistry = scanner.nextDouble();
        System.out.println("nhap diem mon ly sv: ");
        this.physics = scanner.nextDouble();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public void output() {
        System.out.println("Ten sv: " + this.name);
        System.out.println("Lop sv: " + this.grade);
        System.out.println("Tuoi sv: " + this.age);
        System.out.println("Diem tb 3 mon cua sv: " + ((this.math + this.physics + this.chemistry)/3));


}}
