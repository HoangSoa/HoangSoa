package btbuoi5;

public class Computer1 {
    private CPU1 cpu;
    private Mainboard mainboard;
    private Ram1 ram;

    public Computer1(CPU1 cpu, Mainboard mainboard, Ram1 ram) {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.ram = ram;

    }

    public CPU1 getCpu() {
        return cpu;
    }

    public void setCpu(CPU1 cpu) {
        this.cpu = cpu;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Ram1 getRam() {
        return ram;
    }

    public void setRam(Ram1 ram) {
        this.ram = ram;
    }


    }

