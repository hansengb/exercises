public class CylinderTester {

    public static void main(String[] args) {
        Cylinder mario = new Cylinder(9, 70);

        System.out.println(mario.getRadius());
        System.out.println(mario.getHeight());
        System.out.println(mario.volume());
        System.out.println(mario.surfaceArea());
    }
}