package by.gsu.epamlab;

public class Material {

    // Create the package named by.gsu.epamlab and define the class Material, describing uniform material.
    // name,
    private String name;
    // density.
    private double density;

    // Constructors:
    // default constructor;
    public Material() {
        this("", 0D);
    }

    // general-purpose constructor.
    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    // Methods:
    // getters;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    // toString( ) – converting of an object to a string in the csv–format: each field, separated by the ";" symbol.
    // Example:
    // steel;7850.0
    @Override
    public String toString() {
        return name + ';' + density;
    }

}
