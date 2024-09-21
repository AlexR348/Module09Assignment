// Client Code
package main;

import factories.GarmentFactory;
import factories.ProfessionalFactory;
import factories.CasualFactory;
import factories.PartyFactory;
import interfaces.Top;
import interfaces.Pants;
import interfaces.Shoes;

public class GarmentSimulator {
    public static void main(String[] args) {
        // Create garments using the Professional variant
        System.out.println("Professional Garment Set:");
        GarmentFactory professionalFactory = new ProfessionalFactory();
        createAndDisplayGarmentSet(professionalFactory);

        // Create garments using the Casual variant
        System.out.println("\nCasual Garment Set:");
        GarmentFactory casualFactory = new CasualFactory();
        createAndDisplayGarmentSet(casualFactory);

        // Create garments using the Party variant
        System.out.println("\nParty Garment Set:");
        GarmentFactory partyFactory = new PartyFactory();
        createAndDisplayGarmentSet(partyFactory);
    }

    // Helper method to create and display garments using a given factory
    private static void createAndDisplayGarmentSet(GarmentFactory factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        top.wear();
        pants.wear();
        shoes.wear();
    }
}
