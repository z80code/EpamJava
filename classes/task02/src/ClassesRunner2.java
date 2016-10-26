import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class ClassesRunner2 {

    public static void main(String[] args) {
        // Define the Runner class in the default package, where:
        // 1. Create the object representing the steel wire having the volume 0.03 cubic meter.
        Material material = new Material("Steal", 7850.0D);
        Material newMaterial = new Material("Cooper", 8500.0D);
        Subject subject = new Subject("Steel wire", material, 0.03);
        // 2. Print the object content to the console, using toString( ) method.
        System.out.println(subject);
        // 3. Change the wire material on the copper (density = 8500.0) and print its mass.
        subject.setMaterial(newMaterial);
        // Example:
        // The wire mass is 255.0 kg.
        System.out.println(String.format("The wire mass is %.1f kg.", subject.getMass()));

    }
}
