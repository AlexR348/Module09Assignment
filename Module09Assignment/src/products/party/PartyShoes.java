// Concrete Product Implementation for Party Variant
package products.party;

import interfaces.Shoes;

public class PartyShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("Wearing party shoes.");
    }
}
