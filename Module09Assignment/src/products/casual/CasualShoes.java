// Concrete Product Implementation for Casual Variant
package products.casual;

import interfaces.Shoes;

public class CasualShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("Wearing casual shoes.");
    }
}
