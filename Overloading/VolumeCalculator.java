package Overloading;

/**
 *
 * @author Rayhansyah
 */
public class VolumeCalculator {
    // Menghitung volume kubus
    public static double calculateVolume(double side) {
        return side * side * side;
    }

    // Menghitung volume balok
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Menghitung volume tabung
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}

