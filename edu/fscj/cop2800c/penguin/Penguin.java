// Penguin.java
// Kevin Gordie
// 3/28/2026
// Represents a penguin derived class

package edu.fscj.cop2800c.penguin;

public class Penguin extends Bird {
    private String species;
    private double flipperLength;

    public Penguin(int sampleNum, String species,
                   double culmenLength, double culmenDepth,
                   double bodyMass, String sex, double flipperLength) {
        super(sampleNum, culmenLength, culmenDepth, bodyMass, sex);
        this.species = species;
        this.flipperLength = flipperLength;
    }

    public String getSpecies() {
        return species;
    }

    public double getFlipperLength() {
        return flipperLength;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", species='" + species +
               "', flipperLength=" + flipperLength;
    }
}