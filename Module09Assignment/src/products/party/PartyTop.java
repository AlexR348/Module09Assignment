// Concrete Product Implementation for Party Variant
package products.party;

import interfaces.Top;

public class PartyTop implements Top {
    @Override
    public void wear() {
        System.out.println("Wearing a party top.");
    }
}
