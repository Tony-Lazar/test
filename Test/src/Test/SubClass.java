package Test;

public class SubClass {
    int x;
    int y;
    int z;

    public SubClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void showDimentions() {
        System.out.println(
                "x: " + x + " " +
                "y: " + y + " " +
                "z: " + z);
    }
}
