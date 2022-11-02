public class Tamgiac {
    public double x, y, z;
    public double perimeter() {
        return x + y + z;
    }
    public double area() {
        return Math.sqrt((double) (0.5 * (x + y + z)) * ((double) (0.5 * (x + y + z)) - x) * ((double) (0.5 * (x + y + z)) - y) * ((double) (0.5 * (x + y + z)) - z));
    }
}
