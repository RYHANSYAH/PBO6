package Overloading;

/**
 *
 * @author Rayhansyah
 */
public class Main {
     public static void main(String[] args) {
        double side = 5.0;
        double length = 4.0;
        double width = 6.0;
        double radius = 3.0;
        double height = 8.0;

        System.out.println("Volume kubus: " + VolumeCalculator.calculateVolume(side));
        System.out.println("Volume balok: " + VolumeCalculator.calculateVolume(length, width, height));
        System.out.println("Volume tabung: " + VolumeCalculator.calculateVolume(radius, height));
    }
}

