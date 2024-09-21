// Concrete Product Implementation for Party Variant
package products.party;

import interfaces.Pants;

public class PartyPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing party pants.");
    }
}
