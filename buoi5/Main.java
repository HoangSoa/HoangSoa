package btbuoi5;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        public static Scanner scanner  = new Scanner(System.in);
        public static void main(String[] args) {

            ArrayList<Hang> hangs  = new ArrayList<>();
            hangs.add(new Hang("HA"));
            hangs.add(new Hang("HB"));
            hangs.add(new Hang("HC"));

            ArrayList<Ram1> ram1s  = new ArrayList<>();
            ram1s.add(new Ram1("RA", "0", hangs.get(0) ));
            ram1s.add(new Ram1("RB", "1", hangs.get(1) ) );
            ram1s.add(new Ram1("RC", "2", hangs.get(2) )  );

            ArrayList<CPU1> cpu1s = new ArrayList<>();
            cpu1s.add(new CPU1("CPUA", "0", hangs.get(0)));
            cpu1s.add(new CPU1("CPUB", "1", hangs.get(1)));
            cpu1s.add(new CPU1("CPUC", "2", hangs.get(2)));

            ArrayList<Mainboard> mainboards=  new ArrayList<>();
            mainboards.add(new Mainboard("MBA", "0", hangs.get(0)));
            mainboards.add(new Mainboard("MBB", "1", hangs.get(1)));
            mainboards.add(new Mainboard("MBC", "2", hangs.get(2)));

            ArrayList<Computer1> computer1s=  new ArrayList<>();
            computer1s.add(new Computer1(cpu1s.get(0), mainboards.get(0), ram1s.get(0)));
            computer1s.add(new Computer1(cpu1s.get(1), mainboards.get(1), ram1s.get(1)));
            computer1s.add(new Computer1(cpu1s.get(2), mainboards.get(2), ram1s.get(2)));

            computer1s.forEach(computer -> {
                System.out.println("%s %s %s", computer.getCpu().getName(), computer.getRam().getName(), computer.getMainboard().getName());
            });
        }

}
