

import java.util.ArrayList;
import java.util.Scanner;

/*
public class Main {
    public static int[] increaseOne(int[] nums) {
        for (int i = 0; i< nums.length; i+= 1) {
            nums[i] +=1;
        }

    }
    public static void main(String args) {
        int a[] = new int[5];
        a[0] =12;
        a[1] = 23;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int res = increaseOne(a);
        for (int i = 0 ;i < nums.length; i++) {
            System.out.println(res[i]);
        }
    }
}*/
//wrapper classes
/*public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b = a; //boxing
        int c = a; //unboxing
        System.out.println(b);
    }
}*/
//arraylist
/*    public class Main {
        public static void main(String args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);}
}*/
//array list2
    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(1);
            ArrayList<Integer> arr = new ArrayList(nums);
            System.out.println(arr);
            arr.add(2);

        }
}
//vi du ve forEach
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.forEach(num -> num = num +1);
        nums.forEach(num -> {for int i = 0; i< 2; i++} )

    }
}