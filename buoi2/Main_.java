package buoi2_sv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_ {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<sv> sv_lst = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++) {
            sv sv_ = new sv();
            sv_.input();
            sv_lst.add(sv_);
        }
        for (int i = 0; i< n; i++) {
            sv_lst.get(i).output();
        }
    }}
