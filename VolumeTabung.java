import java.util.Scanner;

public class VolumeTabung {
    public static double hitungVolume(double r, double t) {
        return Math.PI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.println("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("Volume tabung adalah " + volume + " cm^3 ");
    }
}
