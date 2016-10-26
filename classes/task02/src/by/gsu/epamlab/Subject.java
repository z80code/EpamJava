package by.gsu.epamlab;

public class Subject {
    // Define in the same package the class Subject, describing a subject consisting of the uniform material.
    // Class fields:
    // name,
    private String name;

    // material,
    private Material material;

    // volume.
    private double volume;

    // Constructors:
    // default constructor;
    public Subject() {
        this("", new Material(), 0D);
    }

    // general-purpose constructor.
    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    // Methods:
    // getters/setters;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // getMass( ) – calculating the subject mass (= density * volume);
    public double getMass() {
        return material.getDensity() * volume;
    }

    // toString( ) – converting of an object to a string in the csv–format: each field and mass, separated by the ";" symbol.
    // Example:
    // wire;steel;7850.0;0.03;235.5
    @Override
    public String toString() {
        return name + ';' + material + ";" + volume + ";" + getMass();
    }
}
